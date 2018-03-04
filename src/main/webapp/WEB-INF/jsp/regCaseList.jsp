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
        <title>Lista spraw</title>
    </head>
    <body>
        <h1>Lista przypadków</h1>

        <table border="1">
            <th>ID: </th>
            <th>Nazwa: </th>
            <th>Pozycja: </th>
            <th>Wariant: </th>
            <th>Numer seryjny: </th>
            <th>Zlecenie1: </th>
            <th>Zlecenie2: </th>
            <th>Info: </th>
            <th>Czas rejestracji: </th>
            
                <c:forEach items="${regCases}" var="regCase">
                <tr>
                    <td> <a href="<c:url value="/regCase/edit.htm"/>?id=${regCase.id}">${regCase.id}</a></td>
                    <td>${regCase.name}</td>
                    <td>${regCase.position}</td>
                    <td>${regCase.variant}</td>
                    <td>${regCase.serial}</td>
                    <td>${regCase.order1}</td>
                    <td>${regCase.order2}</td>
                    <td>${regCase.info}</td>
                    <td>${regCase.registeredDate}</td>
                </tr>
            </c:forEach>
        </table>        


    </body>
</html>
