<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <title>My Appointments - Doctor Finder</title>
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
        th { background: #3498db; color: white; }
    </style>
</head>
<body>
    <div class="sidebar">
        <h2>Patient Portal</h2>
        <ul class="nav-links">
            <li><a href="/patient/dashboard">Dashboard</a></li>
            <li><a href="/patient/doctors">Find Doctors</a></li>
            <li><a href="/patient/appointments">My Appointments</a></li>
            <li><a href="/patient/search-appointment">Search Appointment</a></li>
        </ul>
    </div>
    <div class="content">
        <h1>My Appointments</h1>

        <c:if test="${not empty error}">
            <div style="background: #f8d7da; color: #721c24; padding: 10px; border-radius: 5px; margin-bottom: 20px; border: 1px solid #f5c6cb;">
                ${error}
            </div>
        </c:if>
        <c:if test="${not empty message}">
            <div style="background: #d4edda; color: #155724; padding: 10px; border-radius: 5px; margin-bottom: 20px; border: 1px solid #c3e6cb;">
                ${message}
            </div>
        </c:if>

        <table>
            <thead>
                <tr>
                    <th>ID</th>
                    <th>Doctor ID</th>
                    <th>Title</th>
                    <th>Date</th>
                    <th>Time</th>
                    <th>Status</th>
                    <th>Actions</th>
                </tr>
            </thead>
            <tbody>
                <c:forEach var="app" items="${appointments}">
                    <tr>
                        <td>${app.id}</td>
                        <td>${app.doctorId}</td>
                        <td>${app.title}</td>
                        <td>${app.date}</td>
                        <td>${app.time}</td>
                        <td>
                            <c:choose>
                                <c:when test="${app.status == 'PENDING'}">
                                    <span style="color: #f39c12;">Waiting for approval</span>
                                </c:when>
                                <c:when test="${app.status == 'APPROVED'}">
                                    <span style="color: #2ecc71;">Confirmed</span>
                                </c:when>
                                <c:when test="${app.status == 'REJECTED'}">
                                    <span style="color: #e74c3c;">Rejected</span>
                                </c:when>
                                <c:otherwise>
                                    <span style="color: #7f8c8d;">${app.status}</span>
                                </c:otherwise>
                            </c:choose>
                        </td>
                        <td>
                            <a href="/patient/deleteAppointment/${app.id}" style="color: #e74c3c; text-decoration: none;">Delete</a>
                        </td>
                    </tr>
                </c:forEach>
            </tbody>
        </table>
    </div>
</body>
</html>
