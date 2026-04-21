<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>

<head>
    <title>Login - SimpleBlog</title>

    <!-- Bootstrap -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet">

    <style>
        body {
            background: linear-gradient(135deg, #667eea, #764ba2);
            height: 100vh;
            display: flex;
            justify-content: center;
            align-items: center;
        }

        .auth-container {
            background: white;
            padding: 30px;
            border-radius: 12px;
            width: 100%;
            max-width: 400px;
            box-shadow: 0 6px 18px rgba(0,0,0,0.2);
        }

        h2 {
            text-align: center;
            margin-bottom: 20px;
        }

        .form-control {
            border-radius: 8px;
        }

        button {
            width: 100%;
            border-radius: 8px;
        }

        .links {
            text-align: center;
            margin-top: 15px;
        }

        .links a {
            text-decoration: none;
        }

        .links a:hover {
            text-decoration: underline;
        }

        .message {
            text-align: center;
            margin-bottom: 10px;
        }
    </style>
</head>

<body>

    <div class="auth-container">
        <h2>Login to SimpleBlog</h2>

        <p class="message text-success">${message}</p>
        <p class="message text-danger">${error}</p>

        <form action="user" method="post">
            <input type="hidden" name="action" value="login">

            <div class="mb-3">
                <label class="form-label">Email:</label>
                <input type="email" name="email" class="form-control" required>
            </div>

            <div class="mb-3">
                <label class="form-label">Password:</label>
                <input type="password" name="password" class="form-control" required>
            </div>

            <button type="submit" class="btn btn-primary">Login</button>
        </form>

        <div class="links">
            <p>Don't have an account? <a href="register.jsp">Register here</a></p>
            <p><a href="index.jsp">Back to Home</a></p>
        </div>
    </div>

</body>

</html>