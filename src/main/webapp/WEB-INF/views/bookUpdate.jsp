<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<spring:message code="select.option.submit" var="submitValue"/>
<html>
<head>
    <title><spring:message code="book.update.title"/></title>
</head>
<body>
<b><spring:message code="book.update.headline"/></b>
<form method="post" action="/bookUpdate">
    <spring:message code="book.update.headline"/>
    <br>
    <label><spring:message code="book.update.bookId"/></label>
    <input name="id" type="text">
    <br>
    <label><spring:message code="book.update.newName"/></label>
    <input name="name" type="text">
    <br>
    <label><spring:message code="book.update.newAuthor"/></label>
    <input name="author" type="text">
    <input type="submit" name=${submitValue}>
</form>
</body>
</html>