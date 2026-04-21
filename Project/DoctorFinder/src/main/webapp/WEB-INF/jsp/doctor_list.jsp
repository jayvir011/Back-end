<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <title>Manage Doctors - Doctor Finder</title>
    <style>
        body { font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif; margin: 0; display: flex; background: #f4f7f6; }
        .sidebar { width: 250px; background: #2c3e50; color: white; height: 100vh; padding: 20px; box-sizing: border-box; }
        .content { flex: 1; padding: 30px; }
        .sidebar h2 { border-bottom: 2px solid #34495e; padding-bottom: 10px; }
        .nav-links { list-style: none; padding: 0; }
        .nav-links li { margin: 15px 0; }
        .nav-links a { color: #ecf0f1; text-decoration: none; font-size: 1.1rem; display: block; padding: 10px; border-radius: 5px; transition: background 0.3s; }
        .nav-links a:hover { background: #34495e; }
        .btn-add { background: #2ecc71; color: white; padding: 10px 20px; text-decoration: none; border-radius: 5px; display: inline-block; margin-bottom: 20px; }
        table { width: 100%; border-collapse: collapse; background: white; border-radius: 10px; overflow: hidden; box-shadow: 0 4px 6px rgba(0,0,0,0.1); }
        th, td { padding: 15px; text-align: left; border-bottom: 1px solid #eee; }
        th { background: #3498db; color: white; }
        .btn-edit { color: #3498db; text-decoration: none; margin-right: 10px; }
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
        <h1>Doctors List</h1>
        <a href="/admin/add-doctor" class="btn-add">Add New Doctor</a>
        <table>
            <thead>
                <tr>
                    <th>ID</th>
                    <th>Name</th>
                    <th>Specialization</th>
                    <th>Location</th>
                    <th>Actions</th>
                </tr>
            </thead>
            <tbody>
                <c:forEach var="doc" items="${doctors}">
                    <tr>
                        <td>${doc.id}</td>
                        <td>${doc.name}</td>
                        <td>${doc.specialization}</td>
                        <td>${doc.location}</td>
                        <td>
                            <a href="/admin/edit-doctor/${doc.id}" class="btn-edit">Edit</a>
                            <a href="/admin/delete-doctor/${doc.id}" class="btn-delete" onclick="return confirm('Are you sure?')">Delete</a>
                        </td>
                    </tr>
                </c:forEach>
            </tbody>
        </table>
    </div>
</body>
</html>
