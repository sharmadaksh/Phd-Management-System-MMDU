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


import model.dao.LogininfoDAO;
import model.to.LogininfoTO;
import utility.Validations;

/**
 * Servlet implementation class DeleteCourseDetails
 */
@WebServlet("/admin/deletelogindetails.do")
public class DeleteLoginDetails extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DeleteLoginDetails() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String username = request.getParameter("username");
		String message = "";
		boolean failure = true;
		if(username!=null){
			username = username.trim();
			if(Validations.isEmpty(username)){
				message = "Please Provide Any Course ID Information";
			}else{
				LogininfoTO record = new LogininfoTO();
                                                                           String username1=record.getUsername();
                                                                           LogininfoDAO lid=new LogininfoDAO();
				if(record!=null){
					if(lid.deleteRecord(username)){
						failure  = false;
						message = "Record is Removed From Database";
					}else{
						message = "Record is not Removed Due To " + lid.getError_message();
					}
				}else{
					message = "There is No Such Record for this Course ID";
				}
			}
		}else{
			message = "Insufficient Data";
		}
		request.setAttribute("message", message);
		if(failure){
			request.setAttribute("error", "yes");
		}
		RequestDispatcher rd = request.getRequestDispatcher("viewlogindetails.do");
		rd.forward(request, response);
	}

}
