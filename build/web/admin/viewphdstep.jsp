<%-- 
    Document   : viewphdstep
    Created on : Feb 7, 2019, 1:09:32 PM
    Author     : HP PAVILION
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<link rel="stylesheet" href="css/bootstrap.min.css">
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ include file="adminhome.jsp"%>
<h3><center>View Ph.D Steps </center></h3>

<c:if test="${message !=null }">
    <c:choose>
        <c:when test="${error!=null }">
            <div class="alert alert-danger">${message }</div>
            <br>
        </c:when>
        <c:otherwise>
            <div class="alert alert-success">${message }</div>
            <br>
        </c:otherwise>
    </c:choose>
</c:if>
            <div class="container-fluid" >
   <table class="table" >
    <thead class="thead-dark" style="border-radius:10px;">
        <tr>
            <th>Step ID</th>
            <th>Step Name</th>
            <th>Update Record</th>
            <th>Delete Record</th>
        </tr>
    </thead>
    <tbody style="height: 185px;">
        <c:choose>
            <c:when test="${ pit != null }">
                <c:forEach var="item" items="${pit }">
                    <tr>
                        <td>${item.stepid }</td>
                        <td>${item.stepname }</td>
                        
                        <td>
                            <a class="btn btn-primary"
                          onclick="return confirm('Are You Sure to Update This Step Details?')"
                          href="deletestreamdetails.do?stepid=${item.stepid }">Update Record
                            </a>
                        </td>
                        <td>
                            <a class="btn btn-primary"
                          onclick="return confirm('Are You Sure to Remove This Step Details?')"
                          href="deletephdsteps.do?stepid=${item.stepid }">Delete Record
                            </a>
                        </td>

                    </tr>
                </c:forEach>
            </c:when>
            <c:otherwise>
                <tr>
                    <td colspan="4" align="center">There is No Step Details</td>
                </tr>
            </c:otherwise>
        </c:choose>
    </tbody>
</table>
            </div>
<%@ include file="footer.jsp"%>
