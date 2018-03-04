<%-- 
    Document   : regCase_list
    Created on : 2018-03-04, 13:48:35
    Author     : dominik.jedrzejowski
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Sprawy zarejestrowane przez: ${employee.name}</h1>

        <c:forEach items="${employee.regCases}" var="regCase">
            [Id sprawy]: ${regCase.id}.  
            [Temat]: ${regCase.name}, 
            [Info]: ${regCase.info}, 
            [Zlecenie 1]: ${regCase.order1}, 
            [Zlecenie 2]: ${regCase.order2}<br>
        </c:forEach>
    </body>
</html>
