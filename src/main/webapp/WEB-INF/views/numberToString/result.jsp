<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: SergejK
  Date: 28-May-20
  Time: 11:04 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <style>
        .container {
            display: flex;
            flex-flow: column wrap;
            align-content: space-between;
            height: 665px;

            background-color: #f7f7f7;
            border-radius: 3px;
            padding: 20px;
            width: 60%;
            margin: 40px auto;
            counter-reset: items;
        }

        .item {
            width: 32%;
            position: relative;
            margin-bottom: 2%;
            border-radius: 3px;
            background-color: #a1cbfa;
            border: 1px solid #4290e2;
            box-shadow: 0 2px 2px rgba(0,90,250,0.05),
            0 4px 4px rgba(0,90,250,0.05),
            0 8px 8px rgba(0,90,250,0.05),
            0 16px 16px rgba(0,90,250,0.05);
            color: #fff;
            padding: 15px;
            box-sizing: border-box;
        }

        .item::before {
            counter-increment: items;
            content: counter(items);
        }

        .item:nth-child(3n+1) { order: 1; }
        .item:nth-child(3n+2) { order: 2; }
        .item:nth-child(3n)   { order: 3; }

        .container::before,
        .container::after {
            content: "";
            flex-basis: 100%;
            width: 0;
            order: 2;
        }

        body { font-family: sans-serif; }
        h3 { text-align: center; }
        #color1:hover {
            background-color: purple;
        }
    </style>
    <title>Result</title>
</head>
<body>

<div class="container">
    <div class="item" style="height: 140px" id="color1">
         <a href="${pageContext.request.contextPath}/">push</a>
    </div>
    <div class="item" style="height: 190px"></div>
    <div class="item" style="height: 170px"></div>
    <div class="item" style="height: 120px"></div>
    <div class="item" style="height: 160px"></div>
    <div class="item" style="height: 180px"></div>
    <div class="item" style="height: 140px"></div>
    <div class="item" style="height: 190px"></div>
    <div class="item" style="height: 170px"></div>
    <div class="item" style="height: 170px"></div>
</div>

<c:out value="${numString}"/>
</body>
</html>
