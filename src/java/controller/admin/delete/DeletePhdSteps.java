/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller.admin.delete;

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

import model.dao.PhdstepDAO;
import model.to.PhdstepTO;
import utility.Validations;

/**
 * Servlet implementation class DeleteCourseDetails
 */
@WebServlet("/admin/deletephdsteps.do")
public class DeletePhdSteps extends HttpServlet {

    private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public DeletePhdSteps() {
        super();
        // TODO Auto-generated constructor stub
    }

    /**
     * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
     * response)
     */
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String stepid = request.getParameter("stepid");
        String message = "";
        boolean failure = true;
        if (stepid != null) {
            stepid = stepid.trim();
            if (Validations.isEmpty(stepid)) {
                message = "Please Provide Any Stream ID Information";
            } else {
                PhdstepTO record = new PhdstepTO();
                int stepid1 = record.getStepid();
                PhdstepDAO psd = new PhdstepDAO();
                if (record != null) {
                    if (psd.deleteRecord(stepid)) {
                        failure = false;
                        message = "Record is Removed From Database";
                    } else {
                        message = "Record is not Removed Due To " + psd.getError_message();
                    }
                } else {
                    message = "There is No Such Record for this Stream ID";
                }
            }
        } else {
            message = "Insufficient Data";
        }
        request.setAttribute("message", message);
        if (failure) {
            request.setAttribute("error", "yes");
        }
        RequestDispatcher rd = request.getRequestDispatcher("viewphdsteps.do");
        rd.forward(request, response);
    }

}
