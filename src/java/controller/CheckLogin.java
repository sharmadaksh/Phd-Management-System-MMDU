/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

/**
 *
 * @author HP PAVILION
 */
import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.dao.LogininfoDAO;
import model.to.LogininfoTO;
import utility.Validations;

/**
 * Servlet implementation class CheckLogin
 */
@WebServlet("/checklogin.do")
public class CheckLogin extends HttpServlet {

    private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
     * response)
     */
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        boolean failure = true;
        String message = "";
        if (username != null && password != null) {
            if (Validations.isEmpty(username) || Validations.isEmpty(password)) {
                message = "Please Enter Some Value in Boxes";
            } else {
                LogininfoTO record = new LogininfoDAO().getRecord(username);
                if (record != null) {
                    if (record.getPassword().equals(password)) {
                        if (record.getRolename().equalsIgnoreCase("admin")) {
                            HttpSession session = request.getSession();
                            session.setAttribute("aname", username);
                            response.sendRedirect("admin/addlogindetails.jsp");
                            failure = false;
                        } else if (record.getRolename().equalsIgnoreCase("user")) {
                            HttpSession session = request.getSession();
                            session.setAttribute("uname", username);
                            response.sendRedirect("user/index.jsp");
                            failure = false;
                        } else {
                            message = "Invalid Credential for User";
                        }
                    } else {
                        message = "Invalid User Name / Password Given";
                    }
                } else {
                    message = "Invalid User Name / Password Given";
                }
            }
        } else {
            message = "Insufficient Data Provided";
        }
        if (failure) {
            request.setAttribute("message", message);
            RequestDispatcher rd = request.getRequestDispatcher("login.jsp");
            rd.forward(request, response);
        }
    }

}
