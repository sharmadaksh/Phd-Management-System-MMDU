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

import model.to.InstituteinfoTO;
import model.dao.InstituteinfoDAO;
import utility.Validations;

/**
 *
 * @author Daksh
 */
public class AddInstitute extends HttpServlet{
     protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String instid = request.getParameter("instid");
        String instname = request.getParameter("instname");
        int instid1=Integer.parseInt(instid);
        HttpSession session = request.getSession();
        boolean failure = true;
        String message = "";
        if (instid != null && instname != null ) {
            session.setAttribute("instid1", instid1);
            session.setAttribute("instname", instname);
            
            if (Validations.isEmpty(instid) || Validations.isEmpty(instname) ) {
                message = "Please Fill All Boxes";
            } else  {
                InstituteinfoTO record = new InstituteinfoTO();
                record.setInstid(instid1);
                record.setInstname(instname);
                
                InstituteinfoDAO lid = new InstituteinfoDAO();
                if (lid.insertRecord(record)) {
                    message = "New Institute is cretated in the System";
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
        response.sendRedirect("addinstittute.jsp");
    }

}
