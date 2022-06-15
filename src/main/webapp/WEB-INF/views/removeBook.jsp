<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<spring:message code="select.option.submit" var="submitValue"/>
<html>
<head>
    <title><spring:message code="book.remove.title"/></title>
</head>
<body>
<form method="post" action="/bookRemove">
    <b><spring:message code="book.remove.head"/></b>
    <br>
    <label><spring:message code="book.remove.input"/></label>
    <input type="text" name="bookId">
    <input type="submit" value=${submitValue}>
</form>
</body>
</html>