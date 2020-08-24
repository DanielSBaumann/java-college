<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page import="java.util.List"%>
<%@page import="control.*"%>
<!DOCTYPE html>
<html lang="pt-br">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" type="text/css" href="css/indexStyle.css" media="screen" />
    <script src="https://kit.fontawesome.com/a076d05399.js"></script>
    <script src="js/aluno.js"></script>
    <title>Colégio SB</title>
</head>

<body>
    <header>
        <div id="hd-logo">
            <div id="box-logo">
                <img id="img-logo" src="img/image.png" alt="logo">
                <p>Bem vindo <%=session.getAttribute("user")%>!</p>
            </div>

            <!--FORM-->
            <form id="form-main">
                <input type="hidden" id="action" name="action">
                <!--FORM-->

        </div>
        <div id="hd-search">
            <!--<form id="form-main">-->
            <div id="search">
                <i class="fa fa-search" id="lupa"></i>
                <input type="text" id="txt-search" placeholder="Pesquise aqui">
            </div>
        </div>
        <div id="hd-gif">
            <p><i onclick="home()" class="fa fa-home">Home |</i></p>
            <p><i onclick="profile()" class="fa fa-user-edit">Meu Perfil |</i></p>
            <p><i onclick="" class="fa fa-book">Inf. Academicas |</i></p>
            <p onclick="">Sair</p>
        </div>
    </header>

    <nav>

        <div class="box-nav">

            <ul>
                <li class="topic">
                    Academico
                    <ul>
                        <li class="link"><a href="#">ABC</a></li>
                        <li class="link"><a href="#">DEF</a></li>
                        <li class="link"><a href="#">GHI</a></li>
                    </ul>
                </li>
                <li class="topic">
                    Materiais
                    <ul>
                        <li class="link"><a href="#">ABC</a></li>
                        <li class="link"><a href="#">DEF</a></li>
                        <li class="link"><a href="#">GHI</a></li>
                    </ul>
                </li>
                <li class="topic">
                    Grade escolar
                    <ul>
                        <li class="link"><a href="#">ABC</a></li>
                        <li class="link"><a href="#">DEF</a></li>
                        <li class="link"><a href="#">GHI</a></li>
                    </ul>
                </li>
                <li class="topic">
                    Avaliacoes
                    <ul>
                        <li class="link"><a href="#">ABC</a></li>
                        <li class="link"><a href="#">DEF</a></li>
                        <li class="link"><a href="#">GHI</a></li>
                    </ul>
                </li>
                <li class="topic">
                    Financeiro
                    <ul>
                        <li class="link"><a href="#">ABC</a></li>
                        <li class="link"><a href="#">DEF</a></li>
                        <li class="link"><a href="#">GHI</a></li>
                        <li class="link"><a href="#">GHI</a></li>
                        <li class="link"><a href="#">GHI</a></li>
                    </ul>
                </li>
                </li>
            </ul>

        </div>

    </nav>

    <section>

        <!-- Carrousel-->

        <!-- Carrousel-->

    </section>

    <footer>
        <p>Fale conosco</p>
        <p class="gifs"><i class="fab fa-facebook" style="font-size:32px;"></i></p>
        <p class="gifs"><i class="fab fa-instagram" style="font-size:32px;"></i></p>
        <p class=" gifs"><i class="fa fa-phone" style="font-size:26px;"></i></p>
        <p class=" gifs"><i class="fa fa-envelope" style="font-size:32px;"></i></p>

        <!--</form>-->
        </form>
        <!--FORM-->
    </footer>
</body>

</html>