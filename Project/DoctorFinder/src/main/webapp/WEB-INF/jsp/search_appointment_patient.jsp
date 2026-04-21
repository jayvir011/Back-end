<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <title>Search Appointment - Doctor Finder</title>
    <style>
        body { font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif; margin: 0; display: flex; background: #f4f7f6; }
        .sidebar { width: 250px; background: #2c3e50; color: white; height: 100vh; padding: 20px; box-sizing: border-box; }
        .content { flex: 1; padding: 30px; }
        .sidebar h2 { border-bottom: 2px solid #34495e; padding-bottom: 10px; }
        .nav-links { list-style: none; padding: 0; }
        .nav-links li { margin: 15px 0; }
        .nav-links a { color: #ecf0f1; text-decoration: none; font-size: 1.1rem; display: block; padding: 10px; border-radius: 5px; transition: background 0.3s; }
        .nav-links a:hover { background: #34495e; }
        .search-box { background: white; padding: 20px; border-radius: 10px; display: flex; gap: 10px; box-shadow: 0 4px 6px rgba(0,0,0,0.1); margin-bottom: 20px; }
        .search-box input { flex: 1; padding: 10px; border: 1px solid #ddd; border-radius: 5px; }
        .search-box button { background: #3498db; color: white; border: none; padding: 10px 20px; border-radius: 5px; cursor: pointer; }
        .result-card { background: white; padding: 20px; border-radius: 10px; box-shadow: 0 4px 6px rgba(0,0,0,0.1); margin-top: 20px; }
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
        <h1>Search My Appointment by ID</h1>
        <form action="/patient/search-appointment" method="get" class="search-box">
            <input type="number" name="id" placeholder="Enter Appointment ID" required>
            <button type="submit">Search</button>
        </form>

        <c:if test="${not empty foundAppointment}">
            <div class="result-card">
                <h3>Appointment Details</h3>
                <p><strong>Title:</strong> ${foundAppointment.title}</p>
                <p><strong>Disease:</strong> ${foundAppointment.disease}</p>
                <p><strong>Date:</strong> ${foundAppointment.date}</p>
                <p><strong>Time:</strong> ${foundAppointment.time}</p>
                <p><strong>Details:</strong> ${foundAppointment.details}</p>
                <p><strong>Doctor ID:</strong> ${foundAppointment.doctorId}</p>
                <p><strong>Status:</strong> 
                    <c:choose>
                        <c:when test="${foundAppointment.status == 'PENDING'}"><span style="color: #f39c12;">Waiting for approval</span></c:when>
                        <c:when test="${foundAppointment.status == 'APPROVED'}"><span style="color: #2ecc71;">Confirmed</span></c:when>
                        <c:when test="${foundAppointment.status == 'REJECTED'}"><span style="color: #e74c3c;">Rejected</span></c:when>
                        <c:otherwise>${foundAppointment.status}</c:otherwise>
                    </c:choose>
                </p>
            </div>
        </c:if>
        <c:if test="${param.id != null && empty foundAppointment}">
            <p style="color: red;">No appointment found with ID: ${param.id}</p>
        </c:if>
    </div>
</body>
</html>
