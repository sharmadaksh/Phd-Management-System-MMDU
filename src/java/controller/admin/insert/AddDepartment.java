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

import model.to.DepartmentinfoTO;
import model.dao.DepartmentinfoDAO;
import utility.Validations;

/**
 *
 * @author Daksh
 */
public class AddDepartment extends HttpServlet{
     protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String deptid = request.getParameter("deptid");
        String deptname = request.getParameter("deptname");
        String instid=request.getParameter("instid");
        int deptid1=Integer.parseInt(deptid);
        int instid1=Integer.parseInt(instid);
        HttpSession session = request.getSession();
        System.out.print("++++++++"+deptname);
        boolean failure = true;
        String message = "";
        if (deptid != null && deptname != null && instid!=null) {
            session.setAttribute("deptid1", deptid1);
            session.setAttribute("deptname", deptname);
            session.setAttribute("instid1", instid);
            
            System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
            if (Validations.isEmpty(deptid) || Validations.isEmpty(deptname) || Validations.isEmpty(instid) ) {
                message = "Please Fill All Boxes";
            } else  {
                DepartmentinfoTO record = new DepartmentinfoTO();
                record.setDeptid(deptid1);
                record.setDeptname(deptname);
                record.setInstid(instid1);
                System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
                DepartmentinfoDAO lid = new DepartmentinfoDAO();
                if (lid.insertRecord(record)) {
                    message = "New Department is cretated in the System";
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
        response.sendRedirect("adddepartment.jsp");
    }

}
