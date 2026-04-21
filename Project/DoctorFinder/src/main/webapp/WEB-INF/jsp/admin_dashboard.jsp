<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>Admin Dashboard - Doctor Finder</title>
    <style>
        body { font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif; margin: 0; display: flex; background: #f4f7f6; }
        .sidebar { width: 250px; background: #2c3e50; color: white; height: 100vh; padding: 20px; box-sizing: border-box; }
        .content { flex: 1; padding: 30px; }
        .sidebar h2 { border-bottom: 2px solid #34495e; padding-bottom: 10px; }
        .nav-links { list-style: none; padding: 0; }
        .nav-links li { margin: 15px 0; }
        .nav-links a { color: #ecf0f1; text-decoration: none; font-size: 1.1rem; display: block; padding: 10px; border-radius: 5px; transition: background 0.3s; }
        .nav-links a:hover { background: #34495e; }
        .card-container { display: flex; gap: 20px; margin-top: 20px; }
        .card { background: white; padding: 20px; border-radius: 10px; box-shadow: 0 4px 6px rgba(0,0,0,0.1); flex: 1; text-align: center; }
        .card h3 { margin: 0; color: #7f8c8d; }
        .card p { font-size: 2rem; margin: 10px 0; color: #2c3e50; font-weight: bold; }
        .logout { margin-top: 50px; }
        .logout a { background: #e74c3c; padding: 10px; border-radius: 5px; text-decoration: none; color: white; }
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
        <div class="logout">
            <a href="/logout">Logout</a>
        </div>
    </div>
    <div class="content">
        <h1>Welcome, Admin</h1>
        <p>Manage your medical network efficiently.</p>
        
        <div class="card-container">
            <div class="card">
                <h3>Total Doctors</h3>
                <p>${doctorCount}</p>
            </div>
            <div class="card">
                <h3>Total Patients</h3>
                <p>${patientCount}</p>
            </div>
            <div class="card">
                <h3>Service Locations</h3>
                <p>${locationCount}</p>
            </div>
        </div>
    </div>
</body>
</html>
