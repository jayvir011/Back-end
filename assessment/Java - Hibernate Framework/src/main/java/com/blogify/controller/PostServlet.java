package com.blogify.controller;

import com.blogify.dao.PostDAO;
import com.blogify.model.Post;
import com.blogify.model.User;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.List;

@WebServlet("/posts")
public class PostServlet extends HttpServlet {
    private PostDAO postDAO;

    public void init() {
        postDAO = new PostDAO();
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String action = request.getParameter("action");

        if ("insert".equals(action)) {
            insertPost(request, response);
        } else if ("update".equals(action)) {
            updatePost(request, response);
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action == null)
            action = "list";

        switch (action) {
            case "new":
                showNewForm(request, response);
                break;
            case "edit":
                showEditForm(request, response);
                break;
            case "delete":
                deletePost(request, response);
                break;
            case "dashboard":
                showDashboard(request, response);
                break;
            case "search":
                searchPosts(request, response);
                break;
            case "list":
            default:
                listPosts(request, response);
                break;
        }
    }

    private void listPosts(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        List<Post> listPosts = postDAO.getAllPosts();
        request.setAttribute("listPosts", listPosts);
        request.getRequestDispatcher("index.jsp").forward(request, response);
    }

    private void showDashboard(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        HttpSession session = request.getSession(false);
        User user = (session != null) ? (User) session.getAttribute("user") : null;

        if (user == null) {
            response.sendRedirect("login.jsp");
            return;
        }

        List<Post> userPosts = postDAO.getPostsByUserId(user.getId());
        request.setAttribute("userPosts", userPosts);
        request.getRequestDispatcher("dashboard.jsp").forward(request, response);
    }

    private void showNewForm(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.getRequestDispatcher("post-form.jsp").forward(request, response);
    }

    private void insertPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        HttpSession session = request.getSession(false);
        User user = (session != null) ? (User) session.getAttribute("user") : null;

        if (user != null) {
            String title = request.getParameter("title");
            String content = request.getParameter("content");
            Post newPost = new Post(title, content, user);
            postDAO.savePost(newPost);
            response.sendRedirect("posts?action=dashboard");
        } else {
            response.sendRedirect("login.jsp");
        }
    }

    private void showEditForm(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        Post existingPost = postDAO.getPostById(id);
        request.setAttribute("post", existingPost);
        request.getRequestDispatcher("post-form.jsp").forward(request, response);
    }

    private void updatePost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        String title = request.getParameter("title");
        String content = request.getParameter("content");

        Post post = postDAO.getPostById(id);
        post.setTitle(title);
        post.setContent(content);
        postDAO.updatePost(post);
        response.sendRedirect("posts?action=dashboard");
    }

    private void deletePost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        postDAO.deletePost(id);
        response.sendRedirect("posts?action=dashboard");
    }

    private void searchPosts(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String query = request.getParameter("query");
        List<Post> searchResults = postDAO.searchPostsByTitle(query);
        request.setAttribute("listPosts", searchResults);
        request.getRequestDispatcher("index.jsp").forward(request, response);
    }
}
