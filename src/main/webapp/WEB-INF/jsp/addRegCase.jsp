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
        <title>Rejestracja</title>
    </head>
    <body>
        <h1>Spring CRM :: <c:choose><c:when test="${not empty param['id']}">Edycja danych</c:when><c:otherwise>Dodawanie pracownika</c:otherwise></c:choose></h1>
        
        <form:form commandName="regCase" action="add.htm" method="post">
            <form:hidden path="id"/>
            <form:input path="name" placeholder="Nazwa przypadku" required="true" maxlength="100" size="100" /><form:errors path="name"/><br/>
            <form:input path="position" placeholder="Pozycja materiałowa" required="true" /><form:errors path="position"/><br/>
            <form:input path="variant" placeholder="Wariant płytki/urządzenia (opcjonalnie)" required="false" /><form:errors path="variant"/><br/>
            <form:input path="serial" placeholder="Numer fabryczny (opcjonalnie)" required="false" /><form:errors path="serial"/><br/>
            <form:input path="order1" placeholder="Zlecenie/zamówienie (opcjonalnie)" required="false" /><form:errors path="order1"/><br/>
            <form:input path="order2" placeholder="Zlecenie/zamówienie 2 (opcjonalnie)" required="false" /><form:errors path="order2"/><br/>
            <form:input path="info" placeholder="Opis przypadku (opcjonalnie)" required="false" /><form:errors path="name"/><br/>
            <form:button>Zapisz</form:button>
        </form:form>
    </body>
</html>
