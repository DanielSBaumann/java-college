<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="pt-br">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" type="text/css" href="css/loginStyle.css" media="screen" />
    <script src="https://kit.fontawesome.com/a076d05399.js"></script>

    <title>Colégio SB</title>
</head>

<body>

    <header>
        <div>
            <!--<img src="#" alt="logo">-->
        </div>
    </header>

    <nav>

        <div id="box">

            <form method="POST" action="ServLogin">

                <div>
                    <input id="title_login" type="button" value="Faça Login">
                </div>

                <br><br>

                <div>
                    <input type="button" class="btn" value="login">
                    <input type="text" class="input_values" id="login" name="login" placeholder="Ex:João da Silva"
                        required>
                </div>

                <div>
                    <input type="button" class="btn" value="senha">
                    <input type="password" class="input_values" id="senha" name="senha" placeholder="Ex:joa23@1997SILVA"
                        required>
                </div>

                <div class="center">
                    <p class="avisos">Manter-me logado <input type="checkbox" value="Manter logado"></p>
                    <br>
                </div>

                <div class="center">

                    <div>
                        <input id="btn_entrar" type="submit" value="Entrar">
                    </div>

                    <div>
                        <p class="avisos">Esqueceu sua senha?</p>
                        <p class="avisos">Clique <a href="#">aqui</a></p>
                    </div>

                </div>

                <div class="center">
                    <input class="erro-login" type="text" value='<%= request.getAttribute("erro")%>' disabled>
                </div>

            </form>

        </div>

    </nav>

    <footer id="ft" class="foot">

        <p>Fale conosco</p>
        <p class="gifs"><i class="fab fa-facebook" style="font-size:32px;"></i></p>
        <p class="gifs"><i class="fab fa-instagram" style="font-size:32px;"></i></p>
        <p class=" gifs"><i class="fa fa-phone" style="font-size:26px;"></i></p>
        <p class=" gifs"><i class="fa fa-envelope" style="font-size:32px;"></i></p>

    </footer>

</body>

</html>