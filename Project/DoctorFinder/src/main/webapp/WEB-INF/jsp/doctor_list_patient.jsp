<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <title>Find Doctors - Doctor Finder</title>
    <style>
        body { font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif; margin: 0; display: flex; background: #f4f7f6; }
        .sidebar { width: 250px; background: #2c3e50; color: white; height: 100vh; padding: 20px; box-sizing: border-box; }
        .content { flex: 1; padding: 30px; }
        .sidebar h2 { border-bottom: 2px solid #34495e; padding-bottom: 10px; }
        .nav-links { list-style: none; padding: 0; }
        .nav-links li { margin: 15px 0; }
        .nav-links a { color: #ecf0f1; text-decoration: none; font-size: 1.1rem; display: block; padding: 10px; border-radius: 5px; transition: background 0.3s; }
        .nav-links a:hover { background: #34495e; }
        .doctor-grid { display: grid; grid-template-columns: repeat(auto-fill, minmax(300px, 1fr)); gap: 20px; margin-top: 20px; }
        .doctor-card { background: white; padding: 20px; border-radius: 10px; box-shadow: 0 4px 6px rgba(0,0,0,0.1); border-top: 5px solid #3498db; }
        .doctor-card h3 { margin: 0; color: #2c3e50; }
        .doctor-card p { color: #7f8c8d; margin: 5px 0; }
        .btn-book { background: #3498db; color: white; padding: 10px; border-radius: 5px; text-decoration: none; display: block; text-align: center; margin-top: 15px; transition: background 0.3s; }
        .btn-book:hover { background: #2980b9; }
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
        <h1>Available Doctors</h1>
        <div class="doctor-grid">
            <c:forEach var="doc" items="${doctors}">
                <div class="doctor-card">
                    <h3>Dr. ${doc.name}</h3>
                    <p><strong>Specialty:</strong> ${doc.specialization}</p>
                    <p><strong>Location:</strong> ${doc.location}</p>
                    <p><strong>Address:</strong> ${doc.address}</p>
                    <a href="/patient/book-appointment/${doc.id}" class="btn-book">Book Appointment</a>
                </div>
            </c:forEach>
        </div>
    </div>
</body>
</html>
