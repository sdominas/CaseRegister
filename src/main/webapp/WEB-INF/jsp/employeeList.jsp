<%-- 
    Document   : addCase
    Created on : 2018-03-03, 10:11:29
    Author     : dominik.jedrzejowski
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Lista osób</title>
    </head>
    <body>
        <h1>Lista osób</h1>

        <table border="1">
            <th>ID: </th>
            <th>Imię: </th>
            <th>Nazwisko: </th>
            <th>Mail: </th>
                <c:forEach items="${employees}" var="employee">
                <tr>
                    <td> <a href="<c:url value="/employee/edit.htm"/>?id=${employee.id}">${employee.id}</a></td>
                    <td>${employee.name}</td>
                    <td>${employee.lastName}</td>
                    <td>${employee.email}</td>
                </tr>
            </c:forEach>
        </table>        


    </body>
</html>
