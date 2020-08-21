<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page import="java.util.List"%>
<%@page import="control.*"%>
<!DOCTYPE html>
<html lang="pt-br">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Colegio SB</title>
    <style>
        tr,th,td{
            border: solid 1px rgb(196, 185, 185);
        }
        div{
            width: 50px;
            height: 60px;
            margin: 20px;
            background-color: blue;
            border: solid black 2px;
        }
    </style>
</head>

<body>

    <header>
        <h1>Bem vindo <%=session.getAttribute("user")%>!</h1>
    </header>

    <nav>

        <% User user = new User().user(Long.parseLong(session.getAttribute("id").toString())); %>

        <table>
            <tr>
                <th>Senha</th>
                <th>Login</th>
                <th>Tipo</th>
            </tr>
            <tr>
                <td><%=user.getSenha()%></td>
                <td><%=user.getLogin()%></td>
                <td><%=user.getTipo()%></td>
            </tr>
        </table>

    </nav>

    <div>

    </div>


</body>

</html>