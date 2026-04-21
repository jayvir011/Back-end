<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>

<head>
    <title>${not empty post ? 'Edit Post' : 'Create Post'} - SimpleBlog</title>

    <!-- Bootstrap -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet">

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
            text-decoration: none;
            font-weight: 500;
        }

        nav a:hover {
            text-decoration: underline;
        }

        .form-container {
            max-width: 800px;
            margin: 40px auto;
        }

        .card {
            border-radius: 12px;
            box-shadow: 0 4px 12px rgba(0,0,0,0.08);
        }

        textarea {
            resize: none;
        }

        button {
            border-radius: 8px;
        }
    </style>
</head>

<body>

    <!-- Header -->
    <header>
        <div class="container d-flex justify-content-between align-items-center">
            <h1 class="h4">SimpleBlog</h1>
            <nav>
                <a href="posts?action=dashboard">Back to Dashboard</a>
            </nav>
        </div>
    </header>

    <!-- Form Section -->
    <main>
        <div class="form-container">
            <div class="card p-4">

                <h2 class="mb-4">
                    ${not empty post ? 'Edit Blog Post' : 'New Blog Post'}
                </h2>

                <form action="posts" method="post">
                    <input type="hidden" name="action" value="${not empty post ? 'update' : 'insert'}">

                    <c:if test="${not empty post}">
                        <input type="hidden" name="id" value="${post.id}">
                    </c:if>

                    <div class="mb-3">
                        <label class="form-label">Title:</label>
                        <input type="text" name="title" class="form-control"
                               value="${post.title}" required>
                    </div>

                    <div class="mb-3">
                        <label class="form-label">Content:</label>
                        <textarea name="content" rows="10"
                                  class="form-control"
                                  required>${post.content}</textarea>
                    </div>

                    <button type="submit" class="btn btn-success w-100">
                        ${not empty post ? 'Update Post' : 'Create Post'}
                    </button>
                </form>

            </div>
        </div>
    </main>

</body>

</html>