<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: SergejK
  Date: 4/17/2020
  Time: 8:47 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <style>


        body {
            background: url("https://edge.alluremedia.com.au/m/g/2017/10/jigsaw_movie.jpg");
            background-size: 100%;

        }


        nav {
            float: left;
            width: 10%;
            height: 100px; /* only for demonstration, should be removed */
            background: #ccc;
            padding: 20px;
        }

        nav ul {
            list-style-type: none;
            padding: 0;
        }

        section:after {
            content: "";
            display: table;
            clear: both;
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

        article {

            position: absolute;
            left: 20%;
            top: 15%;
            width: 40%;
            height: 40%;

        }

        #digit {
            width: 80px;
            height: 50px;
            background-color: #949494;
            font-size: 40px;
            font-family: "Comic Sans MS";
            color: #ff0015;
            position: absolute;
            left: 60%;
            top: 10%;
            border-radius: 8px;
        }

        .button {
            text-decoration: none;
            outline: none;
            display: inline-block;
            padding: 12px 40px;
            margin: 10px 20px;
            border-radius: 30px;
            background-image: linear-gradient(45deg, #d7152b 0%, #33d9de 50%, #002878 100%);
            background-position: 100% 0;
            background-size: 200% 200%;
            font-family: 'Montserrat', sans-serif;
            font-size: 24px;
            font-weight: 300;
            color: #b6b6ff;
            box-shadow: 0 16px 32px 0 rgba(0, 40, 120, .35);
            transition: .5s;
            position: absolute;
            left: 51%;
            top: 25%;
        }

        .button:hover {
            box-shadow: 0 0 0 0 rgba(0, 40, 120, 0);
            background-position: 0 0;
        }

        #forLable {
            font-size: 20px;
            color: #949494;
            font-family: 'DejaVu Sans Mono', monospace;
        }

        .helloPlayer {
            text-shadow: 0 2px 10px rgb(123, 8, 21);
            font-family: "DejaVu Sans Mono", monospace;
            font-size: 28px;
            color: gray;
        }
        footer {
            position: absolute;
            bottom: 50%;
            left: 20%;
            height: 100px;
            width: 300px;
        }
        .forFooter {
            color: #ff0015;
            font-size: 25px;
        }
    </style>
    <title>Guess Num</title>
</head>


<body>
<header>
    <div>


    </div>

</header>

<section>
    <nav id="navbar">
        <ul>
            <li><a href="/">Top menu</a></li>
            <li><a href="/palindrom">Palindrome</a></li>
            <li><a href="#">ссс</a></li>
        </ul>
    </nav>
    <article>
        <div class="helloPlayer">
            Hello <c:out value="${playerName}"/>
            Your digit is <c:out value="${palyerDigit}"/>
        </div>

        <form action="/guessNum" method="post">
            <label for="digit" id="forLable">Enter digit from 1 up to 100</label><br>

            <input type="text" id="digit" name="digit" pattern="[0-9]{1-3}" title="Only digits">
            <div class="button-parent">
                <div>
                    <input type="submit" value="Submit" class="button">
                </div>
            </div>
        </form>

    </article>
    <footer class="footer">
        <div class="forFooter">
            This is your friends and they are sleeping
        </div>

    </footer>
</section>

</body>
</html>
