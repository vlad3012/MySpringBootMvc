<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<spring:message code="select.option.submit" var="submitValue"/>
<html>
<head>
    <title><spring:message code="book.create.title"/></title>
</head>
<body>
<b><spring:message code="book.create.headline"/></b>
<form method="post" action="/createBook">
    <br>
    <label><spring:message code="book.create.name"/></label>
    <input type="text" name="name"/>
    <br>
    <label><spring:message code="book.create.author"/></label>
    <input type="text" name="author"/>
    <input type="submit" name=${submitValue}>

</form>
</body>
</html>
