<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <title>Manage Locations - Doctor Finder</title>
    <style>
        body { font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif; margin: 0; display: flex; background: #f4f7f6; }
        .sidebar { width: 250px; background: #2c3e50; color: white; height: 100vh; padding: 20px; box-sizing: border-box; }
        .content { flex: 1; padding: 30px; }
        .sidebar h2 { border-bottom: 2px solid #34495e; padding-bottom: 10px; }
        .nav-links { list-style: none; padding: 0; }
        .nav-links li { margin: 15px 0; }
        .nav-links a { color: #ecf0f1; text-decoration: none; font-size: 1.1rem; display: block; padding: 10px; border-radius: 5px; transition: background 0.3s; }
        .nav-links a:hover { background: #34495e; }
        .form-inline { background: white; padding: 20px; border-radius: 10px; margin-bottom: 20px; display: flex; gap: 10px; box-shadow: 0 4px 6px rgba(0,0,0,0.1); }
        .form-inline input { flex: 1; padding: 10px; border: 1px solid #ddd; border-radius: 5px; }
        .form-inline button { background: #3498db; color: white; border: none; padding: 10px 20px; border-radius: 5px; cursor: pointer; }
        table { width: 100%; border-collapse: collapse; background: white; border-radius: 10px; overflow: hidden; box-shadow: 0 4px 6px rgba(0,0,0,0.1); }
        th, td { padding: 15px; text-align: left; border-bottom: 1px solid #eee; }
        th { background: #34495e; color: white; }
        .btn-delete { color: #e74c3c; text-decoration: none; }
    </style>
</head>
<body>
    <div class="sidebar">
        <h2>Admin Panel</h2>
        <ul class="nav-links">
            <li><a href="/admin/dashboard">Dashboard</a></li>
            <li><a href="/admin/doctors">Manage Doctors</a></li>
            <li><a href="/admin/patients">View Patients</a></li>
            <li><a href="/admin/locations">Manage Locations</a></li>
        </ul>
    </div>
    <div class="content">
        <h1>Locations</h1>
        <form action="/admin/add-location" method="post" class="form-inline">
            <input type="text" name="name" placeholder="Enter Location Name" required>
            <button type="submit">Add Location</button>
        </form>
        <table>
            <thead>
                <tr>
                    <th>ID</th>
                    <th>Name</th>
                    <th>Actions</th>
                </tr>
            </thead>
            <tbody>
                <c:forEach var="loc" items="${locations}">
                    <tr>
                        <td>${loc.id}</td>
                        <td>${loc.name}</td>
                        <td>
                            <a href="/admin/delete-location/${loc.id}" class="btn-delete" onclick="return confirm('Are you sure?')">Delete</a>
                        </td>
                    </tr>
                </c:forEach>
            </tbody>
        </table>
    </div>
</body>
</html>
