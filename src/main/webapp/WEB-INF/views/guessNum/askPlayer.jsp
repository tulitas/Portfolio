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
    <style>
        body {
            background: url("https://avatars.mds.yandex.net/get-ott/224348/2a0000016249b9dfa1129d1b38e2de839957/orig");
            background-size: 100%;
        }

        #comment {
            text-align: center;
            text-shadow: 0 14px 10px rgba(255, 204, 233, 0.15),
            0 24px 2px rgba(255, 204, 233, 0.1),
            0 34px 30px rgba(255, 204, 233, 0.1);;
        }

        /*buttons*/
        #Yes {
            top: 15%;
            left: 27%;
            position: absolute;

            font-weight: 700;
            color: white;
            text-decoration: none;
            padding: .8em 1em calc(.8em + 3px);
            width: 100px;
            border-radius: 3px;
            background: rgba(134, 199, 143, 0.71);
            box-shadow: 0 -3px rgba(92, 199, 90, 0.71) inset;
            transition: 0.2s;
        }

        #Yes:hover {
            background: rgb(70, 167, 65);
        }

        #Yes:active {
            background: rgb(0, 134, 14);
            box-shadow: 0 3px rgb(24, 29, 134) inset;
        }

        #No {
            top: 15%;
            left: 37%;
            position: absolute;

            font-weight: 700;
            color: white;
            text-decoration: none;
            padding: .8em 1em calc(.8em + 3px);
            width: 100px;
            border-radius: 3px;
            background: rgb(199, 149, 137);
            box-shadow: 0 -3px rgb(167, 131, 112) inset;
            transition: 0.2s;

        }

        #No:hover {
            background: rgb(167, 73, 75);
        }

        #No:active {
            background: rgb(120, 5, 13);
            box-shadow: 0 3px rgb(255, 0, 21) inset;
        }

        aside {
            float: right;
            padding: 90px;
            width: 70%;
            vertical-align: middle;
        }

        h1 {
            color: #ff0015;
        }

        h2 {
            position: absolute;
            left: 15%;
            top: 80%;
            font-size: 50px;
            color: #75ff87;
            animation: blink 1s infinite;
        }
        @keyframes blink {
            from { opacity: 1;  }
            to { opacity: 0;  }
        }
    </style>
    <title>Question</title>
</head>
<body>
<header>
    <h1 id="comment">Let`s play a game</h1>
</header>
<section>
    <article>
        <h2 class="h2">if not scary</h2>
    </article>
</section>
<aside>
    <form action="/askPlayerName">
        <label for="Yes">If you whant play press YES</label><br>
        <input type="submit" value="Yes" class="button" name="Yes" id="Yes">
    </form>
    <form action="/">
        <input value="No" type="submit" name="No" id="No">
    </form>
</aside>
</body>
</html>
