<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <title>All Patients - Doctor Finder</title>
    <style>
        body { font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif; margin: 0; display: flex; background: #f4f7f6; }
        .sidebar { width: 250px; background: #2c3e50; color: white; height: 100vh; padding: 20px; box-sizing: border-box; }
        .content { flex: 1; padding: 30px; }
        .sidebar h2 { border-bottom: 2px solid #34495e; padding-bottom: 10px; }
        .nav-links { list-style: none; padding: 0; }
        .nav-links li { margin: 15px 0; }
        .nav-links a { color: #ecf0f1; text-decoration: none; font-size: 1.1rem; display: block; padding: 10px; border-radius: 5px; transition: background 0.3s; }
        .nav-links a:hover { background: #34495e; }
        table { width: 100%; border-collapse: collapse; background: white; border-radius: 10px; overflow: hidden; box-shadow: 0 4px 6px rgba(0,0,0,0.1); }
        th, td { padding: 15px; text-align: left; border-bottom: 1px solid #eee; }
        th { background: #16a085; color: white; }
    </style>
</head>
<body>
    <div class="sidebar">
        <h2>Doctor Portal</h2>
        <ul class="nav-links">
            <li><a href="/doctor/dashboard">Dashboard</a></li>
            <li><a href="/doctor/appointments">My Appointments</a></li>
            <li><a href="/doctor/add-appointment">Add Appointment</a></li>
            <li><a href="/doctor/search-appointment">Search Appointment</a></li>
            <li><a href="/doctor/patients">View All Patients</a></li>
            <li><a href="/doctor/search-patient">Search Patient</a></li>
        </ul>
    </div>
    <div class="content">
        <h1>Registered Patients</h1>
        <table>
            <thead>
                <tr>
                    <th>ID</th>
                    <th>Full Name</th>
                    <th>Username</th>
                    <th>Mobile</th>
                    <th>Location</th>
                </tr>
            </thead>
            <tbody>
                <c:forEach var="p" items="${patients}">
                    <tr>
                        <td>${p.id}</td>
                        <td>${p.fullname}</td>
                        <td>${p.username}</td>
                        <td>${p.mobile}</td>
                        <td>${p.location}</td>
                    </tr>
                </c:forEach>
            </tbody>
        </table>
    </div>
</body>
</html>
