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

import model.to.StudentInfoTO;
import model.dao.StudentinfoDAO;
import utility.Validations;

/**
 *
 * @author HP PAVILION
 */
public class AddStudentDetails extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String studentid = request.getParameter("studentid");
        String uname = request.getParameter("uname");
        String name = request.getParameter("name");
        String fname = request.getParameter("fname");
        String sessbegmnth = request.getParameter("sessionbeginmonth");
        String sessendmnth = request.getParameter("sessionendmonth");
        String sessbegyr = request.getParameter("sessionbeginyear");
        String sessendyr = request.getParameter("sessionendyear");
        String streamid = request.getParameter("streamid");
        
        int sessbegmnth1=Integer.parseInt(sessbegmnth);
        int sessendmnth1=Integer.parseInt(sessendmnth);
        int sessbegyr1=Integer.parseInt(sessbegyr);
        int sessendyr1=Integer.parseInt(sessendyr);    
        
        HttpSession session = request.getSession();
        boolean failure = true;
        String message = "";
        if (studentid != null && uname != null && name != null && fname != null && sessbegmnth!= null && sessendmnth != null && sessbegyr != null && sessendyr != null &&  streamid != null) {
            session.setAttribute("studentid", studentid);
            session.setAttribute("uname", uname);
            session.setAttribute("name", name);
            session.setAttribute("fname", fname);
            session.setAttribute("sessbegmnth", sessbegmnth);
            session.setAttribute("sessendmnth", sessendmnth);
            session.setAttribute("sessbegyr", sessbegyr);
            session.setAttribute("sessendyr", sessendyr);
            session.setAttribute("streamid", streamid);
            
            if (Validations.isEmpty(studentid) || Validations.isEmpty(uname) || Validations.isEmpty(name) || Validations.isEmpty(fname) || Validations.isEmpty(sessbegmnth) || Validations.isEmpty(sessendmnth) || Validations.isEmpty(sessbegyr) || Validations.isEmpty(sessendyr) || Validations.isEmpty(streamid)) {
                message = "'Please Fill All Boxes";
            } 
            else if(Validations.isNumber(sessbegmnth) || Validations.isNumber(sessendmnth) || Validations.isNumber(sessbegyr) || Validations.isNumber(sessendyr))
            {
                
            }
            else {
                StudentInfoTO record = new StudentInfoTO();
                record.setStudentid(studentid);
                record.setName(uname);
                record.setName(name);
                record.setFname(fname);
                record.setSessionbeginmonth(sessbegmnth1);
                record.setSessionendmonth(sessendmnth1);
                record.setSessionbeginyear(sessbegyr1);
                record.setSessionendyear(sessendyr1);
                record.setStreamid(streamid);

                StudentinfoDAO sid = new StudentinfoDAO();
                if (sid.insertRecord(record)) {
                    message = "Login Information is Added in System";
                    failure = false;
                } else {
                    message = "Insertion Failure : " + sid.getError_message();
                }
            }
        }else{
            message = "Not Enough Details";
        }

        if (failure) {
            session.setAttribute("error", "yes");
        }
        session.setAttribute("message", message);
        response.sendRedirect("addstudent.jsp");
    }

}
