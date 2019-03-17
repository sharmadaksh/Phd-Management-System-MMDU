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
        System.out.println("Username "+username);
        System.out.println("Password "+password);
        String message = "";
        if (username != null && password != null) {
            System.out.println("++++++++++++++++++++++++++++1111111111");
            if (Validations.isEmpty(username) || Validations.isEmpty(password)) {
                System.out.println("++++++++++++++++++++++++++++222222222");
                message = "Please Enter Some Value in Boxes";
            } else {
                System.out.println("++++++++++++++++++++++++++++333333333");
                LogininfoTO record = new LogininfoDAO().getRecord(username);
                if (record != null) {
                    if (record.getPassword().equals(password)) {
                        if (record.getRolename().equalsIgnoreCase("admin")) {
                            HttpSession session = request.getSession();
                            session.setAttribute("aname", username);
                            response.sendRedirect("admin/addlogindetails.jsp");
                            failure = false;
                        } else if (record.getRolename().equalsIgnoreCase("scholar")) {
                            System.out.println("++++++++++++++++++++++++++++44444444");
                            HttpSession session = request.getSession();
                            session.setAttribute("uname", username);
                            response.sendRedirect("scholar/scholarhome.jsp");
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
