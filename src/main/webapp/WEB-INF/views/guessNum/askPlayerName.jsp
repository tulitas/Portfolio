<%--
  Created by IntelliJ IDEA.
  User: SergejK
  Date: 4/23/2020
  Time: 10:07 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <style>
        body {
            background: url("https://cdn.onebauer.media/one/media/5d30/81db/b5d9/a63b/a290/01b8/saw-puppet.jpg?quality=50&width=1800&ratio=16-9&resizeStyle=aspectfill&format=jpg");
            background-size: 100%;
        }
        h1 {
            font-size: 50px;
            font-style: italic;
            color: dimgrey;
            text-shadow: 0 4px 4px rgba(149, 119, 150, 0.52),
            0 8px 2px rgba(167, 75, 145, 0.41),
            0 9px 3px rgba(255, 204, 233, 0.1);;
        }
        #name {
            background-color: #666666;
        }
    </style>
    <title>Player Name</title>
</head>
<body>
<header>
    <h1 class="h1">
        Hey, hello daredevil,<br>and what's your name, buddy.
    </h1>
</header>
<article>
    <form action="${pageContext.request.contextPath}/askPlayerName" method="post">
        <label for="name" style="color: #666666">Enter name</label>
        <input type="text" id="name" name="name" pattern="[az-AZ]" title="Only letters">
        <input type="submit" value="Submit" class="button">
    </form>
</article>
</body>
</html>
