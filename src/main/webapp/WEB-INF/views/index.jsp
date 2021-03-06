<%--
  Created by IntelliJ IDEA.
  User: SergejK
  Date: 4/15/2020
  Time: 10:59 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<style>


    .bmenu {
        padding: 50px 0px;
        margin: 0 auto;
        position: relative;
        background: rgba(0, 0, 0, 0.7);
        width: 500px;
        height: 500px;
        -webkit-border-radius: 250px;
        -moz-border-radius: 250px;
        border-radius: 250px;
        -webkit-transition: background-color 0.5s ease-in-out;
        -moz-transition: background-color 0.5s ease-in-out;
        -o-transition: background-color 0.5s ease-in-out;
        -ms-transition: background-color 0.5s ease-in-out;
        transition: background-color 0.5s ease-in-out;
    }

    .bmenu:hover {
        background: rgba(0, 0, 0, 0.2);
    }

    .bmenu li {
        font-size: 40px;
        display: block;
        line-height: 66px;
    }

    .bmenu li a {
        white-space: nowrap;
        color: transparent;
        display: block;
        text-align: center;
        text-transform: uppercase;
        text-shadow: 0px 0px 3px #fff;
        letter-spacing: 1px;
        -moz-transform: scale(0.8);
        -ms-transform: scale(0.8);
        -o-transform: scale(0.8);
        -webkit-transform: scale(0.8);
        transform: scale(0.8);
        -webkit-transition: all 0.4s linear;
        -moz-transition: all 0.4s linear;
        -o-transition: all 0.4s linear;
        -ms-transition: all 0.4s linear;
        transition: all 0.4s linear;
    }

    .bmenu:hover li a {
        text-shadow: 0px 0px 10px #fff;
    }

    .bmenu li a:hover {
        text-shadow: none;
        color: #fff;
        background: rgba(129, 6, 29, 0.8);
        -moz-transform: scale(1);
        -ms-transform: scale(1);
        -o-transform: scale(1);
        -webkit-transform: scale(1);
        transform: scale(1);
    }

    body {
        background: url("https://cdn.iz.ru/sites/default/files/styles/900x506/public/news-2019-08/TASS_28367297.jpg?itok=0yvFJ3kK");
        background-size: 100%;
    }


</style>

<title>Hello</title>

</head>
<body>

<ul class="bmenu">
    <li><a href="${pageContext.request.contextPath}/ticTacToe">Tic Tac Toe</a></li>
    <li><a href="${pageContext.request.contextPath}palindrom">Palindrom</a></li>
    <li><a href="${pageContext.request.contextPath}/askPlayer">Guess Num</a></li>
    <li><a href="${pageContext.request.contextPath}/calendar/month">Calendar</a></li>
    <li><a href="${pageContext.request.contextPath}premiumCalculator">Premium Calculator</a></li>
    <li><a href="${pageContext.request.contextPath}/dotCom">Dot Com Bust (console)</a></li>
    <li><a href="${pageContext.request.contextPath}/numberToString">Num to string</a></li>
</ul>

</body>
</html>
