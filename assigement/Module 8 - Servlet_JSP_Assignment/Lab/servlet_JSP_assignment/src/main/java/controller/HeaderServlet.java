package controller;

import java.io.IOException;
import java.util.Map;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.HeaderModel;

/**
 * Controller class to handle HTTP requests/responses for Headers.
 */
@WebServlet("/HeaderServlet")
public class HeaderServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doGet(HttpServletRequest request, HttpServletResponse response) 
            throws ServletException, IOException {
        
        // 1. Logic via Model
        HeaderModel model = new HeaderModel();
        Map<String, String> headers = model.extractHeaders(request);
        
        // 2. Set custom response headers
        response.setHeader("X-Server-Name", "MyJavaServer");
        response.setHeader("X-Project-Version", "1.0");

        // 3. Store data for View
        request.setAttribute("headerList", headers);

        // 4. Forward to View (header.jsp)
        request.getRequestDispatcher("view/header.jsp").forward(request, response);
    }
}
