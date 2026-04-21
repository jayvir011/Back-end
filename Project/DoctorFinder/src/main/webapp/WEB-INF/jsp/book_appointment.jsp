<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <title>Book Appointment - Doctor Finder</title>
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
        .error-msg { background: #f8d7da; color: #721c24; padding: 15px; border-radius: 5px; margin-bottom: 20px; border: 1px solid #f5c6cb; }
        .booked-list { background: white; padding: 20px; border-radius: 10px; box-shadow: 0 4px 6px rgba(0,0,0,0.1); margin-top: 20px; }
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
        <h1>Book Appointment</h1>

        <c:if test="${not empty error}">
            <div class="error-msg">${error}</div>
        </c:if>

        <div style="display: flex; gap: 30px; flex-wrap: wrap;">
            <div class="form-container">
                <form action="/patient/save-appointment" method="post">
                    <input type="hidden" name="doctorId" value="${doctorId}">
                    <div class="form-group">
                        <label>Appointment Title</label>
                        <input type="text" name="title" required>
                    </div>
                    <div class="form-group">
                        <label>Reason / Disease</label>
                        <input type="text" name="disease" required>
                    </div>
                    <div class="form-group">
                        <label>Preferred Date</label>
                        <input type="date" name="date" required>
                    </div>
                    <div class="form-group">
                        <label>Preferred Time</label>
                        <input type="time" name="time" required>
                    </div>
                    <div class="form-group">
                        <label>Details</label>
                        <textarea name="details" rows="3"></textarea>
                    </div>
                    <button type="submit">Confirm Booking</button>
                </form>
            </div>

            <div class="booked-list" style="flex: 1; min-width: 300px;">
                <h3 style="margin-top: 0; color: #2c3e50;">Already Booked Slots</h3>
                <p style="font-size: 0.9rem; color: #7f8c8d;">(Approved sessions for this doctor)</p>
                <ul style="padding-left: 20px; color: #34495e;">
                    <c:forEach var="booked" items="${bookedAppointments}">
                        <li style="margin-bottom: 5px;"><strong>${booked.date}</strong> at <strong>${booked.time}</strong></li>
                    </c:forEach>
                    <c:if test="${empty bookedAppointments}">
                        <li>No confirmed bookings yet</li>
                    </c:if>
                </ul>
            </div>
        </div>
    </div>
</body>
</html>
