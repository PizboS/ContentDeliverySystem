<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>contentPage</title>
</head>
<body>
<div class="form-style-2">
    <form:form action="/cds/target/save" method="POST" modelAttribute="target">
        <form:label path="userGuid">Введите Guid пользователя: </form:label>
        <form:input path="userGuid" />
        <br/>
        <form:label path="contentGuid">Введите Guid контента: </form:label>
        <form:input path="contentGuid" />
        <br/>
        <form:label path="page">Введите страницу: </form:label>
        <form:input path="page" />
        <br/>
        <form:label path="priority">Введите приоритет: </form:label>
        <form:input path="priority" />
        <br/>
        <form:label path="startDate">Введите время начало: </form:label>
        <form:input path="startDate" type="date" />
        <br/>
        <form:label path="endDate">Введите время конца: </form:label>
        <form:input path="endDate" type="date"/>
        <br/>
        <input type="submit" value="send content">
    </form:form>
</div>
</body>
</html>
