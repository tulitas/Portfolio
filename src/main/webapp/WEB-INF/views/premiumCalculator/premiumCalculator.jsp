<%--
  Created by IntelliJ IDEA.
  User: SergejK
  Date: 13-May-20
  Time: 03:02 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Premium Calculator</title>
    <style>
        header {
            /*position: absolute;*/
            height: 10%;
            width: 100%;
            text-align: center;
        }

        .name {
            color: #ff0015;
            font-family: "Malgun Gothic";
            font-style: italic;
            font-size: 40px;
        }

        section {
            height: 70%;
            width: 70%;
            margin-left: 20%;
            margin-top: -13.4%;
        }

        article {
            height: 30%;
            width: 20%;


        }

        footer {
            width: 100%;
            height: 20%;
        }

        html {
            height: 100%;
        }

        body {
            background-color: #33ADFF;
        }

        button {

            font-size: 16px;
            text-align: center;

            border-radius: 50px 50px 50px 50px;
            padding: 20px;
            outline: none;
        }

        .button1 {
            background: url("data:image/jpeg;base64,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");
            /*background-color: #75ff87;*/
            color: #3333FF;
            background-size: 100%;
        }

        .button2 {
            background-color: #ffc73a;
            color: #ff5fc0;
        }

        .button3 {
            border-radius: 15px 25px 10px 50px;
            background-color: #ffc73a;
            color: #ff5fc0;
        }

        #navbar {
            position: absolute;
            left: 1%;
            top: 15%;
            margin: 0;
            padding: 0;
            list-style-type: none;
            width: 200px;
        }

        #navbar li {
            border-left: 10px solid #666;
            border-bottom: 1px solid #666;
        }

        #navbar a {
            background-color: #949494;
            color: #fff;
            padding: 5px;
            text-decoration: none;
            font-weight: bold;
            border-left: 5px solid #33ADFF;
            display: block;
        }

        #navbar a:hover {
            background-color: #666;
            border-left: 5px solid #3333FF;
        }

        .input1 {
            background-color: #cccccc;
            height: 20px;
            width: 250px;
            font-size: 19px;
            border-radius: 10px;
        }

    </style>
</head>
<body>
<header>
    <div class="name">Premium Calculator</div>
</header>
<article>
    <nav id="navbar">
        <ul>
            <li><a href="/">Top menu</a></li>
            <li><a href="/askPlayer">Guess Num</a></li>
            <li><a href="#">ссс</a></li>
        </ul>
    </nav>
</article>
<section>
    <form action="${pageContext.request.contextPath}premiumCalculator" method="post">
        <label for="sumWater">enter sum water</label>
        <textarea class="input1" id="sumWater" name="sumWater"></textarea>

        <label for="sumFire">enter sum fire</label>
        <textarea class="input1" name="sumFire" id="sumFire"></textarea>

        <button class="button1"></button>
        <br>
    </form>

</section>


<footer>
    footer
</footer>
</body>
</html>
