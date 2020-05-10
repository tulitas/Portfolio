<%--
  Created by IntelliJ IDEA.
  User: SergejK
  Date: 08-May-20
  Time: 10:14 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <style>
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

        article {

            position: absolute;
            left: 14%;
            top: 15%;
            width: 40%;
            height: 40%;
            background-color: #75ff87;
        }

        footer {
            position: absolute;
            bottom: 20%;
            left: 5%;
            height: 100px;
            width: 300px;
            background-color: #949494;
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
    <title>You heve added</title>
</head>
<body>

<header>
    <p>
        header
    </p>
</header>

<section>
    <nav id="navbar">
        <ul>
            <li><a href="/">Top menu</a></li>
            <li><a href="/palindrom">Palindrome</a></li>
            <li><a href="/guessNum">Gues Num</a></li>
        </ul>
    </nav>
    <article>
        <div>
            <table>
                <thead>
                <tr>
                    <th>ID</th>
                    <th>Name</th>
                    <th>Surname</th>
                </tr>
                </thead>
                <tbody>
                <tr th:each="jobform : ${jobforms}">
                    <td>${jobforms.id}</td>
                    <td>${jobforms.name}</td>
                    <td>${jobforms.surname}</td>
                    <td><a href="/edit${jobforms.id}">Edit</a></td>
                    <td><a href="/delete${jobforms.id}">Delete</a></td>

                </tr>
                </tbody>
            </table>
        </div>
    </article>
</section>

<footer>
    <p>
        footer
    </p>
</footer>
</body>
</html>
