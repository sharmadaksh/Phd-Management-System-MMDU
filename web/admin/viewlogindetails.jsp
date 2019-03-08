<%-- 
    Document   : managelogindetails
    Created on : Feb 4, 2019, 10:52:46 PM
    Author     : HP PAVILION
--%>
<link rel="stylesheet" href="css/bootstrap.min.css">
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ include file="adminhome.jsp"%>
<h2><center>View Login Details</center></h2>

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
<table class="table">
    <thead class="thead-dark">
        <tr>
            <th>Username</th>
            <th>Password</th>
            <th>Rolename</th>
            <th>Email ID</th>
            <th>Secret Question</th>
            <th>Secret Answer</th>
            <th>Last Login Time</th>
            <th>Update Record</th>
            <th>Delete Record</th>

        </tr>
    </thead>
    <tbody>
        <c:choose>
            <c:when test="${ lit != null }">
                <c:forEach var="item" items="${lit }">
                    <tr>
                        <td>${item.username }</td>
                        <td>${item.password }</td>
                        <td>${item.rolename }</td>
                        <td>${item.emailid}</td>
                        <td>${item.secque}</td>
                        <td>${item.secans}</td>
                        <td>${item.lastlogin}</td>
                        <td>
                            <a class="btn btn-primary"
                          onclick="return confirm('Are You Sure to Update This Login Details?')"
                          href="deletecourse.do?username=${item.username }">Update Record
                            </a>
                        </td>
                        <td>
                            <a class="btn btn-primary"
                          onclick="return confirm('Are You Sure to Remove This Login Details?')"
                          href="deletelogindetails.do?username=${item.username }">Delete Record
                            </a>
                        </td>

                    </tr>
                </c:forEach>
            </c:when>
            <c:otherwise>
                <tr>
                    <td colspan="4" align="center">There is No Login Detail</td>
                </tr>
            </c:otherwise>
        </c:choose>
    </tbody>
</table>
<%@ include file="footer.jsp"%>
