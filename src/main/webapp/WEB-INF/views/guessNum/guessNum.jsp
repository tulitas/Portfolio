<%--
  Created by IntelliJ IDEA.
  User: SergejK
  Date: 4/17/2020
  Time: 8:47 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<style>
    #div1 {
        font-size: 50px;
        color: #3333FF;
        text-align: center;
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
<head>
    <title>Guess Num</title>
</head>
<body>
<header>
    <div id="div1">
        Guess Num
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

    </article>
</section>
<footer>

</footer>
</body>
</html>
