<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="java.util.Map" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>HTTP Header View</title>
</head>
<body>
    <h1>All Request Headers</h1>
    
    <table border="1" cellpadding="10">
        <thead>
            <tr bgcolor="#cccccc">
                <th>Header Name</th>
                <th>Header Value</th>
            </tr>
        </thead>
        <tbody>
            <%
                // Retrieve the headers map passed from the Controller
                Map<String, String> headers = (Map<String, String>) request.getAttribute("headerList");
                
                if (headers != null && !headers.isEmpty()) {
                    for (Map.Entry<String, String> entry : headers.entrySet()) {
            %>
                        <tr>
                            <td><strong><%= entry.getKey() %></strong></td>
                            <td><%= entry.getValue() %></td>
                        </tr>
            <%
                    }
                } else {
            %>
                    <tr>
                        <td colspan="2">No headers found.</td>
                    </tr>
            <%
                }
            %>
        </tbody>
    </table>

    <hr>
    <p><i>Note: The server has also sent custom response headers ('X-Server-Name' and 'X-Project-Version') back to your browser.</i></p>
    
    <button onclick="location.href='../index.jsp'">Go Back</button>
</body>
</html>
