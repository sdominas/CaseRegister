<%-- 
    Document   : addCase
    Created on : 2018-03-03, 10:11:29
    Author     : dominik.jedrzejowski
--%>

<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Rejestracja</title>
    </head>
    <body>
        <h1>Dodaj przypadek</h1>
        
        <form:form commandName="registeredCase" action="save.htm" method="post">
            <form:input path="id"/><br/>
            <form:input path="name"/><form:errors path="name"/><br/>
            <form:input path="position"/><form:errors path="position"/><br/>
            <form:input path="variant"/><form:errors path="variant"/><br/>
            <form:input path="serial"/><form:errors path="serial"/><br/>
            <form:input path="order1"/><form:errors path="order1"/><br/>
            <form:input path="order2"/><form:errors path="order2"/><br/>
            <form:input path="info"/><form:errors path="info"/><br/>
            <form:button>Zapisz</form:button>
        </form:form>
    </body>
</html>
