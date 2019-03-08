/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller.admin.insert;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.to.LogininfoTO;
import model.dao.LogininfoDAO;
import utility.Validations;

/**
 *
 * @author HP PAVILION
 */
public class AddLoginDetails extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String username = request.getParameter("uname");
        String password = request.getParameter("pwd");
        String rolename = request.getParameter("rolename");
        String emailid = request.getParameter("email");
        String secque = request.getParameter("secque");
        String secans = request.getParameter("secans");
        HttpSession session = request.getSession();
        boolean failure = true;
        String message = "";
        if (username != null && password != null && rolename != null && emailid != null && secque != null && secans != null) {
            session.setAttribute("uname", username);
            session.setAttribute("pwd", password);
            session.setAttribute("rolename", rolename);
            session.setAttribute("email", emailid);
            session.setAttribute("secque", secque);
            session.setAttribute("secans", secans);
            if (Validations.isEmpty(username) || Validations.isEmpty(password) || Validations.isEmpty(rolename) || Validations.isEmpty(emailid) || Validations.isEmpty(rolename)) {
                message = "<script>alert('Please Fill All Boxes')</script>";
            } else {
                LogininfoTO record = new LogininfoTO();
                record.setUsername(username);
                record.setPassword(password);
                record.setRolename(rolename);
                record.setEmailid(emailid);
                record.setSecque(secque);
                record.setSecans(secans);

                LogininfoDAO lid = new LogininfoDAO();
                if (lid.insertRecord(record)) {
                    message = "Login Information is Added in System";
                    failure = false;
                } else {
                    message = "Insertion Failure : " + lid.getError_message();
                }
            }
        }else{
            message = "Not Enough Details";
        }

        if (failure) {
            session.setAttribute("error", "yes");
        }
        session.setAttribute("message", message);
        response.sendRedirect("addlogindetails.jsp");
    }

}
