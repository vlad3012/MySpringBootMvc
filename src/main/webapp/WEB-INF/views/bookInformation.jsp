<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<spring:message code="select.option.submit" var="submitValue"/>
<html>
<head>
    <title><spring:message code="book.info.title"/></title>
</head>
<body>
<h1><spring:message code="book.info.headline"/></h1>
<form action="/getBook">
    <br/><spring:message code="book.info.inputId"/>
    <input name="bookId" type="text">
    <input type="submit" name=${submitValue}>;
</form>
</body>
</html>
