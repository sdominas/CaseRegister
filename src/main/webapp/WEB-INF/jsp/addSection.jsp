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
        <h1>Spring CRM :: <c:choose><c:when test="${not empty param['id']}">Edycja danych</c:when><c:otherwise>Dodawanie zespołu/działu</c:otherwise></c:choose></h1>

        <form:form commandName="section" method="POST" action="add.htm">
            <form:hidden path="id"/>
            <form:input path="name" placeholder="Nazwa komórki/zespołu" required="true" /><form:errors path="name"/><br/>
            <form:button>Zapisz</form:button>
        </form:form>
    </body>
</html>
