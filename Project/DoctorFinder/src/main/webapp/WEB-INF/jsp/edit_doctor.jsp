<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <title>Add/Edit Doctor - Doctor Finder</title>
    <style>
        body { font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif; margin: 0; display: flex; background: #f4f7f6; }
        .sidebar { width: 250px; background: #2c3e50; color: white; height: 100vh; padding: 20px; box-sizing: border-box; }
        .content { flex: 1; padding: 30px; }
        .sidebar h2 { border-bottom: 2px solid #34495e; padding-bottom: 10px; }
        .nav-links { list-style: none; padding: 0; }
        .nav-links li { margin: 15px 0; }
        .nav-links a { color: #ecf0f1; text-decoration: none; font-size: 1.1rem; display: block; padding: 10px; border-radius: 5px; transition: background 0.3s; }
        .nav-links a:hover { background: #34495e; }
        .form-container { background: white; padding: 2rem; border-radius: 10px; box-shadow: 0 4px 6px rgba(0,0,0,0.1); max-width: 600px; }
        .form-group { margin-bottom: 1rem; }
        label { display: block; margin-bottom: 0.5rem; color: #7f8c8d; }
        input, select, textarea { width: 100%; padding: 0.8rem; border: 1px solid #ddd; border-radius: 5px; box-sizing: border-box; }
        button { background-color: #3498db; color: white; padding: 10px 20px; border: none; border-radius: 5px; cursor: pointer; font-size: 1rem; }
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
        <h1>${doctor == null ? "Add New Doctor" : "Edit Doctor"}</h1>
        <div class="form-container">
            <form action="/admin/save-doctor" method="post">
                <input type="hidden" name="id" value="${doctor.id}">
                <div class="form-group">
                    <label>Full Name</label>
                    <input type="text" name="name" value="${doctor.name}" required>
                </div>
                <div class="form-group">
                    <label>Gender</label>
                    <select name="gender">
                        <option value="Male" ${doctor.gender == 'Male' ? 'selected' : ''}>Male</option>
                        <option value="Female" ${doctor.gender == 'Female' ? 'selected' : ''}>Female</option>
                        <option value="Other" ${doctor.gender == 'Other' ? 'selected' : ''}>Other</option>
                    </select>
                </div>
                <div class="form-group">
                    <label>Specialization</label>
                    <input type="text" name="specialization" value="${doctor.specialization}" required>
                </div>
                <div class="form-group">
                    <label>Location</label>
                    <select name="location">
                        <c:forEach var="loc" items="${locations}">
                            <option value="${loc.name}" ${doctor.location == loc.name ? 'selected' : ''}>${loc.name}</option>
                        </c:forEach>
                    </select>
                </div>
                <div class="form-group">
                    <label>Address</label>
                    <textarea name="address" rows="3">${doctor.address}</textarea>
                </div>
                <div class="form-group">
                    <label>Email</label>
                    <input type="email" name="email" value="${doctor.email}" required>
                </div>
                <div class="form-group">
                    <label>Password</label>
                    <input type="password" name="password" value="${doctor.password}" required>
                </div>
                <button type="submit">Save Doctor</button>
            </form>
        </div>
    </div>
</body>
</html>
