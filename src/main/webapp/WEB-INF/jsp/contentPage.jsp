<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>contentPage</title>
</head>
<body>
<div class="form-style-2">
    <form:form action="/cds/content/save" method="POST" modelAttribute="contentData">
        <form:label path="header">Введите заголовок: </form:label>
        <form:input path="header" />
        <br/>
        <form:label path="backgroundImg">Введите название изображения: </form:label>
        <form:input path="backgroundImg" />
        <br/>
        <form:label path="text">Введите текст: </form:label>
        <form:input path="text" />
        <br/>
        <input type="submit" value="send content">
    </form:form>
</div>
</body>
</html>