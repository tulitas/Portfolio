<%@ taglib prefix="th" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: SergejK
  Date: 07-May-20
  Time: 07:18 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Add new</title>
</head>
<body>

<form action="${pageContext.request.contextPath}/added"  method="post">
    <label for="name">Name</label>
    <input type="text"  id="name" name="name">
    <%--<span th:if="${#fields.hasErrors('name')}" th:errors="*{name}"></span>--%>
    <label for="surname">Surname</label>
    <input type="text"  id="surname" name="surname">
    <%--<span th:if="${#fields.hasErrors('email')}" th:errors="*{email}"></span>--%>
    <input type="submit" value="Add User">
</form>

</body>
</html>
