<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page import="com.example.DoctorFinder.entity.Doctor" %>
<%
    Doctor doctor = (Doctor) session.getAttribute("user");
    if (doctor == null) { response.sendRedirect("/"); return; }
%>
<!DOCTYPE html>
<html>
<head>
    <title>Doctor Dashboard - Doctor Finder</title>
    <style>
        body { font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif; margin: 0; display: flex; background: #f4f7f6; }
        .sidebar { width: 250px; background: #2c3e50; color: white; height: 100vh; padding: 20px; box-sizing: border-box; }
        .content { flex: 1; padding: 30px; }
        .sidebar h2 { border-bottom: 2px solid #34495e; padding-bottom: 10px; }
        .nav-links { list-style: none; padding: 0; }
        .nav-links li { margin: 15px 0; }
        .nav-links a { color: #ecf0f1; text-decoration: none; font-size: 1.1rem; display: block; padding: 10px; border-radius: 5px; transition: background 0.3s; }
        .nav-links a:hover { background: #34495e; }
        .welcome-card { background: white; padding: 30px; border-radius: 15px; box-shadow: 0 10px 20px rgba(0,0,0,0.05); text-align: center; margin-bottom: 30px; }
        .logout { margin-top: 50px; }
        .logout a { background: #e74c3c; padding: 10px; border-radius: 5px; text-decoration: none; color: white; }
        
        .appointment-section { margin-bottom: 40px; }
        .appointment-section h3 { color: #2c3e50; border-bottom: 3px solid #16a085; display: inline-block; padding-bottom: 5px; margin-bottom: 20px; }
        .appointment-grid { display: grid; grid-template-columns: repeat(auto-fill, minmax(350px, 1fr)); gap: 20px; }
        .card { background: white; padding: 20px; border-radius: 12px; box-shadow: 0 4px 12px rgba(0,0,0,0.08); border-left: 6px solid #16a085; transition: transform 0.2s; }
        .card:hover { transform: translateY(-3px); }
        .card h4 { margin: 0 0 12px 0; color: #2c3e50; font-size: 1.2rem; }
        .card p { margin: 8px 0; color: #555; font-size: 0.95rem; }
        .card b { color: #34495e; }
        
        .btn-approve { background: #27ae60; color: white; padding: 8px 15px; border-radius: 5px; text-decoration: none; margin-right: 10px; font-size: 0.85rem; }
        .btn-reject { background: #e74c3c; color: white; padding: 8px 15px; border-radius: 5px; text-decoration: none; font-size: 0.85rem; }
        .status { font-weight: bold; margin-top: 15px; display: inline-block; padding: 5px 12px; border-radius: 20px; font-size: 0.85rem; text-transform: uppercase; }
        .confirmed { background: #e8f5e9; color: #27ae60; }
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
        <div class="logout">
            <a href="/logout">Logout</a>
        </div>
    </div>
    <div class="content">
        <div class="welcome-card">
            <h1>Welcome, Dr. <%= doctor.getName() %></h1>
            <p>Specialization: <strong><%= doctor.getSpecialization() %></strong></p>
            <p>You have a smooth schedule ahead today.</p>
        </div>

        <div class="appointment-section">
            <h3>Pending Requests</h3>
            <div class="appointment-grid">
                <c:forEach var="a" items="${pendingAppointments}">
                    <div class="card" style="border-left-color: #f39c12;">
                        <h4>Patient: ${patientMap[a.patientId].fullname}</h4>
                        <p><b>Date:</b> ${a.date}</p>
                        <p><b>Time:</b> ${a.time}</p>
                        <p><b>Topic:</b> ${a.title}</p>
                        <p><b>Reason:</b> ${a.disease}</p>
                        <p><b>Patient Location:</b> ${patientMap[a.patientId].location}</p>
                        <div style="margin-top: 15px;">
                            <a href="/doctor/approve-appointment/${a.id}" class="btn-approve">Approve</a>
                            <a href="/doctor/reject-appointment/${a.id}" class="btn-reject">Reject</a>
                        </div>
                    </div>
                </c:forEach>
            </div>
            <c:if test="${empty pendingAppointments}">
                <p style="color: #7f8c8d;">No pending requests</p>
            </c:if>
        </div>

        <div class="appointment-section">
            <h3>Approved Appointments</h3>
            <div class="appointment-grid">
                <c:forEach var="a" items="${approvedAppointments}">
                    <div class="card" style="border-left-color: #2ecc71;">
                        <h4>Patient: ${patientMap[a.patientId].fullname}</h4>
                        <p><b>Date:</b> ${a.date}</p>
                        <p><b>Time:</b> ${a.time}</p>
                        <p><b>Topic:</b> ${a.title}</p>
                        <p><b>Reason:</b> ${a.disease}</p>
                        <span class="status confirmed">Confirmed</span>
                    </div>
                </c:forEach>
            </div>
            <c:if test="${empty approvedAppointments}">
                <p style="color: #7f8c8d;">No confirmed appointments yet</p>
            </c:if>
        </div>
    </div>
</body>
</html>
