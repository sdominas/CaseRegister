<%-- 
    Document   : addEmployee
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
        <title>Spring5 MVC Hibernate Demo</title>
        <style type="text/css">
            .error {
                color: red;
            }
            table {
                width: 20%;
                border-collapse: collapse;
                border-spacing: 0px;
            }
            table td {
                border: 1px solid #565454;
                padding: 5px;
            }
        </style>
    </head>
    <body>
        <h1>Input Form :: <c:choose><c:when test="${not empty param['id']}">Edycja danych </c:when><c:otherwise>Dodawanie działu</c:otherwise></c:choose></h1>
        <form:form action="add" method="post" modelAttribute="section" >
            <table>
                <tr>
                    <td>Name</td>
                    <td>
                        <form:hidden path="id"/>
                        <form:input path="name" /> <br />
                        <form:errors path="name" cssClass="error" />
                    </td>
                </tr>
                <tr>
                    <td colspan="2"><button type="submit">Zapisz</button></td>
                </tr>
            </table>
        </form:form>


        <h2>Sections List</h2>
        <table>
            <tr>
                <td><strong>Id</strong></td>
                <td><strong>Name</strong></td>
            </tr>
            <c:forEach items="${sections}" var="section">
                <tr>
                    <td> <a href="<c:url value="/section/add"/>?id=${section.id}">${section.id}</a></td>
                    <td>${section.name}</td>
                    <td><a href="<c:url value="/section/remove"/>?id=${section.id}">Delete  id=${section.id}[${section.name}]</a></td>
                </tr>
            </c:forEach>
        </table>
    </body>
</html>
