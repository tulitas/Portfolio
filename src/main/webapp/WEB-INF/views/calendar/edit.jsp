<%@ taglib prefix="th" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: SergejK
  Date: 08-May-20
  Time: 10:43 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Update Jobform</title>
</head>
<body>

<div>
    <section>
        <form th:action="@{/edit (id=${jobform})} " method="post">
            <c:forEach var="view" items="${jobform}">
                <label for="name">name</label>
                <input type="text" id="name" name="name" value="${view.name}"/>

                <label for="surname">name</label>
                <input type="text" name="surname" id="surname" value="${view.surname}"/>
                <button class="add_button"> Save </button>
            </c:forEach>
        </form>
    </section>
</div>
</body>
</html>
