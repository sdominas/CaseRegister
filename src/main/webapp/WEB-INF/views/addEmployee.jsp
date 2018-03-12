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
        <title>JSP Page</title>
    </head>
    <body> 
        <h1>Spring CRM :: <c:choose><c:when test="${not empty param['id']}">Edycja danych</c:when><c:otherwise>Dodawanie pracownika</c:otherwise></c:choose></h1>

        <form:form commandName="employee" method="POST" action="add.htm">

            <form:hidden path="id"/>
            <form:input path="name" placeholder="Imię" required="true" /><form:errors path="name"/><br/>
            <form:input path="lastName" placeholder="Nazwisko" required="true"/><form:errors path="lastName"/><br/>
            <form:input path="email" type="email" placeholder="Mail" required="true" /><form:errors path="email"/> <br/>
            <form:select items="${sections}" path="section.id" itemValue="id" itemLabel="name"></form:select>

            <form:button>Zapisz</form:button>

        </form:form>
        <br>
        <h3>Lista osób</h3>
        <c:if test="${!empty listPersons}">
            <table class="tg">
                <tr>
                    <th width="80">Person ID</th>
                    <th width="120">Imię</th>
                    <th width="120">Nazwisko</th>
                    <th width="120">mail</th>
                    <th width="120">Zespół</th>
                    <th width="60">Edit</th>
                    <th width="60">Delete</th>
                </tr>
                <c:forEach items="${listPersons}" var="employee">
                    <tr>
                        <td>${employee.id}</td>
                        <td>${employee.name}</td>
                        <td>${employee.lastName}</td>
                        <td>${employee.mail}</td>
                        <td>${employee.section}</td>
                        <td><a href="<c:url value='/edit/${employee.id}' />" >Edit</a></td>
                        <td><a href="<c:url value='/remove/${employee.id}' />" >Delete</a></td>
                    </tr>
                </c:forEach>
            </table>
        </c:if>
    </body>
</html>
