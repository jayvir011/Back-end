<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <title>SimpleBlog - Home</title>

    <!-- Bootstrap -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet">

    <!-- Custom Style -->
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
            color: white;
            margin-right: 15px;
            text-decoration: none;
            font-weight: 500;
        }

        nav span {
            margin-right: 15px;
            font-weight: 500;
        }

        nav a:hover {
            text-decoration: underline;
        }

        .search-bar {
            margin: 30px auto;
            max-width: 600px;
        }

        .search-bar input {
            border-radius: 30px;
            padding: 10px 15px;
        }

        .search-bar button {
            border-radius: 30px;
            padding: 10px 20px;
        }

        .post-card {
            border-radius: 12px;
            box-shadow: 0 4px 12px rgba(0,0,0,0.08);
            margin-bottom: 20px;
            transition: transform 0.2s;
        }

        .post-card:hover {
            transform: translateY(-3px);
        }

        .meta {
            font-size: 14px;
            color: gray;
        }

        .content {
            margin-top: 10px;
            color: #333;
        }

        .empty-msg {
            text-align: center;
            margin-top: 30px;
        }
    </style>
</head>

<body>

    <!-- Header -->
    <header>
        <div class="container d-flex justify-content-between align-items-center">
            <h1 class="h4">SimpleBlog</h1>
            <nav>
                <a href="posts?action=list">Home</a>

                <c:choose>
                    <c:when test="${not empty sessionScope.user}">
                        <a href="posts?action=dashboard">Dashboard</a>
                        <span>Welcome, ${sessionScope.user.name}!</span>
                        <a href="user?action=logout">Logout</a>
                    </c:when>
                    <c:otherwise>
                        <a href="login.jsp">Login</a>
                        <a href="register.jsp">Register</a>
                    </c:otherwise>
                </c:choose>
            </nav>
        </div>
    </header>

    <!-- Main -->
    <main class="container">

        <!-- Search -->
        <section class="search-bar text-center">
            <form action="posts" method="get" class="d-flex gap-2">
                <input type="hidden" name="action" value="search">
                <input type="text" name="query" class="form-control" placeholder="Search posts by title...">
                <button type="submit" class="btn btn-primary">Search</button>
            </form>
        </section>

        <!-- Posts -->
        <section class="posts">
            <h2 class="mb-4">Recent Blog Posts</h2>

            <c:forEach var="post" items="${listPosts}">
                <div class="card post-card p-4">
                    <h3>${post.title}</h3>
                    <p class="meta">By ${post.user.name} on ${post.createdAt}</p>
                    <div class="content">${post.content}</div>
                </div>
            </c:forEach>

            <c:if test="${empty listPosts}">
                <p class="empty-msg">No posts found.</p>
            </c:if>
        </section>

    </main>

</body>
</html>