<%--
  Created by IntelliJ IDEA.
  User: SergejK
  Date: 26-May-20
  Time: 12:19 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <style>
        body {
            background-color: #cccccc;
        }

        * {
            box-sizing: border-box;
        }

        header {
            background-color: #666666;
            padding: 30px;
            text-align: center;
            font-size: 35px;
            color: white;
        }

        nav {
            float: left;
            width: 10%;
            /*height: 300px;*/
            background: #FFD7A7;
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

        footer {
            background-color: #777;
            padding: 10px;
            text-align: center;
            color: white;
        }

        @media (max-width: 600px) {
            nav, article {
                width: 100%;
                height: auto;
            }
        }
        .text {
        position: relative;
            top: 40px;
            left: 50px;
            background-color: rgba(49, 99, 49, 0.57);
            outline: none;
            border-radius: 8px;
            height: 30px;
            /*width: 40px;*/
            font-size: 25px;
            color: #75ff87;
        }
        .button1 {
            /*position: relative;*/
            /*left: 150px;*/
            /*top: 50px;*/
            /*outline: none;*/
            background-size: 20px, 20px;
            background: url("https://lh3.googleusercontent.com/proxy/LdHnrGK8uG30l9Gov3rtFLp82qoGUnXbaomOu-K4B7AdEiX2tQukt837-rFUaRqHGoyoYZb5kNQUs0ES4LWnijw2nTq5D2RaKlBL2kE6K6lT8gYmWgEql0FjXA");
        }

    </style>
    <title>Number to string</title>
</head>
<body>
<header>
    Convert number to string
</header>

<section>
    <nav>
        <ul>
            <li><a href="#">London</a></li>
            <li><a href="#">Paris</a></li>
            <a href="#">Tokyo</a>
        </ul>
    </nav>
    <article>
        <label for="num">Enter digits</label><br>
        <input class="text" id="num" pattern="{0-99}" title="only numbers"/>
        <button class="button1">zzz</button>
    </article>
</section>

<footer>

</footer>
</body>
</html>
