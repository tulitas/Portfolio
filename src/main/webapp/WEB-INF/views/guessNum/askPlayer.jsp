<%--
  Created by IntelliJ IDEA.
  User: SergejK
  Date: 4/23/2020
  Time: 5:33 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Question</title>
</head>
<body>
<article>
    <form action="/guessNum">
        <label for="Yes" >If you whant play press YES</label><br>
        <input type="submit" value="Yes" class="button" name="Yes" id="Yes">
    </form>
    <form action="/">
        <input value="No" class="button" type="submit" name="No">
    </form>
</article>
</body>
</html>
