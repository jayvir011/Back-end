<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>

<head>
    <title>Dashboard - SimpleBlog</title>

    <!-- Bootstrap CSS -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet">

    <!-- Custom CSS -->
    <style>
        body {
            background-color: #f5f7fa;
        }

        header {
            background: #212529;
            color: white;
            padding: 15px 0;
        }

        header h1 {
            margin: 0;
        }

        nav a {
            color: #fff;
            margin-right: 15px;
            text-decoration: none;
            font-weight: 500;
        }

        nav a:hover {
            text-decoration: underline;
        }

        .container-box {
            margin-top: 30px;
        }

        .card {
            border-radius: 12px;
            box-shadow: 0 4px 12px rgba(0,0,0,0.08);
        }

        table {
            margin-bottom: 0;
        }

        .btn-sm {
            padding: 5px 10px;
        }

        .empty-msg {
            margin-top: 20px;
            text-align: center;
            font-size: 16px;
        }
    </style>
</head>

<body>

    <!-- Header -->
    <header>
        <div class="container d-flex justify-content-between align-items-center">
            <h1 class="h4">SimpleBlog Dashboard</h1>
            <nav>
                <a href="posts?action=list">Home</a>
                <a href="posts?action=new">Create New Post</a>
                <a href="user?action=logout">Logout</a>
            </nav>
        </div>
    </header>

    <!-- Main Content -->
    <div class="container container-box">
        <div class="card p-4">
            <h2 class="mb-4">Your Posts</h2>

            <div class="table-responsive">
                <table class="table table-hover align-middle">
                    <thead class="table-dark">
                        <tr>
                            <th>Title</th>
                            <th>Created At</th>
                            <th>Actions</th>
                        </tr>
                    </thead>
                    <tbody>
                        <c:forEach var="post" items="${userPosts}">
                            <tr>
                                <td>${post.title}</td>
                                <td>${post.createdAt}</td>
                                <td>
                                    <a href="posts?action=edit&id=${post.id}" class="btn btn-warning btn-sm">Edit</a>
                                    <a href="posts?action=delete&id=${post.id}"
                                       class="btn btn-danger btn-sm"
                                       onclick="return confirm('Delete this post?')">Delete</a>
                                </td>
                            </tr>
                        </c:forEach>
                    </tbody>
                </table>
            </div>

            <c:if test="${empty userPosts}">
                <p class="empty-msg">
                    You haven't created any posts yet.
                    <a href="posts?action=new" class="btn btn-primary btn-sm ms-2">Create one now!</a>
                </p>
            </c:if>

        </div>
    </div>

</body>

</html>