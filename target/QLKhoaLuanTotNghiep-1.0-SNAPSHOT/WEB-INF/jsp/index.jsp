<%--
    Document   : index
    Created on : Sep 4, 2023, 10:59:38 PM
    Author     : MT
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
        <ul>
            <c:forEach var="u" items="${users}">
                <li>${u.id} - ${u.firstName}</li>
            </c:forEach>
        </ul>
    </body>
</html>
