/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control.admin.view;

/**
 *
 * @author HP PAVILION
 */
import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.dao.LogininfoDAO;
import model.to.LogininfoTO;

/**
 * Servlet implementation class ViewLoginDetails
 */
@WebServlet("/admin/viewlogindetails.do")
public class ViewLoginDetails extends HttpServlet {

    private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
     * response)
     */
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        LogininfoDAO lid = new LogininfoDAO();
       List<LogininfoTO> lit = lid.getAllRecord();
        if (lit != null) {
            request.setAttribute("lit", lit);
        }
        RequestDispatcher rd = request.getRequestDispatcher("viewlogindetails.jsp");
        rd.forward(request, response);
    }

}
