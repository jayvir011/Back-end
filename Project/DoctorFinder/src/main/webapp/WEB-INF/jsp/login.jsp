<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>Login - Doctor Finder</title>
    <style>
        body { font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif; background-color: #f4f7f6; display: flex; justify-content: center; align-items: center; height: 100vh; margin: 0; }
        .login-container { background: white; padding: 2rem; border-radius: 10px; box-shadow: 0 4px 6px rgba(0,0,0,0.1); width: 100%; max-width: 400px; }
        h2 { text-align: center; color: #2c3e50; }
        .form-group { margin-bottom: 1rem; }
        label { display: block; margin-bottom: 0.5rem; color: #7f8c8d; }
        input, select { width: 100%; padding: 0.8rem; border: 1px solid #ddd; border-radius: 5px; box-sizing: border-box; }
        button { width: 100%; padding: 1rem; background-color: #3498db; color: white; border: none; border-radius: 5px; cursor: pointer; font-size: 1rem; transition: background 0.3s; }
        button:hover { background-color: #2980b9; }
        .error { color: #e74c3c; text-align: center; margin-bottom: 1rem; }
        .links { text-align: center; margin-top: 1rem; }
        .links a { color: #3498db; text-decoration: none; }
    </style>
</head>
<body>
    <div class="login-container">
        <h2>Doctor Finder Login</h2>
        <% if(request.getAttribute("error") != null) { %>
            <div class="error"><%= request.getAttribute("error") %></div>
        <% } %>
        <% if(request.getParameter("msg") != null && request.getParameter("msg").equals("registered")) { %>
            <div style="color: green; text-align: center; margin-bottom: 1rem;">Registration successful! Please login.</div>
        <% } %>
        <form action="/login" method="post">
            <div class="form-group">
                <label>Email / Username</label>
                <input type="text" name="email" required>
            </div>
            <div class="form-group">
                <label>Password</label>
                <input type="password" name="password" required>
            </div>
            <div class="form-group">
                <label>Select Role</label>
                <select name="role" required>
                    <option value="patient">Patient</option>
                    <option value="doctor">Doctor</option>
                    <option value="admin">Admin</option>
                </select>
            </div>
            <button type="submit">Login</button>
        </form>
        <div class="links">
            <p>Don't have an account?</p>
            <a href="/register?role=patient">Register as Patient</a> | 
            <a href="/register?role=doctor">Register as Doctor</a>
        </div>
    </div>
</body>
</html>
