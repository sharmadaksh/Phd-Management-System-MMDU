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

import model.to.PhdstepTO;
import model.dao.PhdstepDAO;
import utility.Validations;

/**
 *
 * @author HP PAVILION
 */
public class AddPhdStep extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String stepid = request.getParameter("stepid");
        String stepname = request.getParameter("stepname");
        int stepid1=Integer.parseInt(stepid);
        HttpSession session = request.getSession();
        boolean failure = true;
        String message = "";
        if (stepid != null && stepname != null ) {
            session.setAttribute("stepid", stepid);
            session.setAttribute("stepname", stepname);
            
            if (Validations.isEmpty(stepid) || Validations.isEmpty(stepname) ) {
                message = "Please Fill All Boxes";
            } else  {
                PhdstepTO record = new PhdstepTO();
                record.setStepid(stepid1);
                record.setStepname(stepname);
                
                PhdstepDAO lid = new PhdstepDAO();
                if (lid.insertRecord(record)) {
                    message = "New Step is cretated in the System";
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
        response.sendRedirect("addphdstep.jsp");
    }

}

