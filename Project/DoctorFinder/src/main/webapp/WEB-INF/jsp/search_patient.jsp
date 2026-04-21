<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <title>Search Patient - Doctor Finder</title>
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
        <h1>Search Patient by ID</h1>
        <form action="/doctor/search-patient" method="get" class="search-box">
            <input type="number" name="id" placeholder="Enter Patient ID" required>
            <button type="submit">Search</button>
        </form>

        <c:if test="${not empty foundPatient}">
            <div class="result-card">
                <h3>Patient Details</h3>
                <p><strong>Name:</strong> ${foundPatient.fullname}</p>
                <p><strong>Username:</strong> ${foundPatient.username}</p>
                <p><strong>Mobile:</strong> ${foundPatient.mobile}</p>
                <p><strong>Location:</strong> ${foundPatient.location}</p>
                <p><strong>Address:</strong> ${foundPatient.address}</p>
            </div>
        </c:if>
        <c:if test="${param.id != null && empty foundPatient}">
            <p style="color: red;">No patient found with ID: ${param.id}</p>
        </c:if>
    </div>
</body>
</html>
