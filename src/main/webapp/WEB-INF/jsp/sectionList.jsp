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
        <title>Lista zespołów</title>
    </head>
    <body>
        <h1>Lista zespołów</h1>

        <table border="1">
            <th>ID: </th>
            <th>Nazwa zespołu: </th>
                <c:forEach items="${sections}" var="section">
                <tr>
                    <td> <a href="<c:url value="/section/edit.htm"/>?id=${section.id}">${section.id}</a></td>
                    <td>${section.name}</td>
                </tr>
            </c:forEach>
        </table>        


    </body>
</html>
