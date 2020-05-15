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
            background: url("data:image/png;base64,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");
            /*background-color: #75ff87;*/
            color: #3333FF;
            background-size: 100%;
        }
        .button2 {
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
    <button class="button1"></button>
    <button class="button2">button 1</button>

</section>


<footer>
    footer
</footer>
</body>
</html>
