<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <title>Add Appointment - Doctor Finder</title>
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
        button { background-color: #16a085; color: white; padding: 10px 20px; border: none; border-radius: 5px; cursor: pointer; font-size: 1rem; }
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
        <h1>Schedule New Appointment</h1>
        <div class="form-container">
            <form action="/doctor/save-appointment" method="post">
                <div class="form-group">
                    <label>Select Patient</label>
                    <select name="patientId" required>
                        <c:forEach var="p" items="${patients}">
                            <option value="${p.id}">${p.fullname} (${p.username})</option>
                        </c:forEach>
                    </select>
                </div>
                <div class="form-group">
                    <label>Appointment Title</label>
                    <input type="text" name="title" required>
                </div>
                <div class="form-group">
                    <label>Disease / Reason</label>
                    <input type="text" name="disease" required>
                </div>
                <div class="form-group">
                    <label>Date</label>
                    <input type="date" name="date" required>
                </div>
                <div class="form-group">
                    <label>Time</label>
                    <input type="time" name="time" required>
                </div>
                <div class="form-group">
                    <label>Details</label>
                    <textarea name="details" rows="3"></textarea>
                </div>
                <button type="submit">Create Appointment</button>
            </form>
        </div>
    </div>
</body>
</html>
