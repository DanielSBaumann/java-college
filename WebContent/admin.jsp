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
    <link rel="stylesheet" type="text/css" href="css/cadastro.css" media="screen" />
    <script src="https://kit.fontawesome.com/a076d05399.js"></script>
    <script src="js/admin.js"></script>

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
            <div id="search">
                <i class="fa fa-search" id="lupa"></i>
                <input type="text" id="txt-search" placeholder="Pesquise aqui">
            </div>
        </div>
        <div id="hd-gif">
            <p><i class="fa fa-home"></i>Home |</p>
            <p><i class="fa fa-user-edit"></i>Meu Perfil |</p>
            <p>Sair</p>
        </div>
    </header>

    <nav>

        <div class="box-nav">

            <ul>
                <li class="hamburg"><i class="fa fa-bars">

                    <ul>
                        <li class="hamburg-inside">
                            Academico
                            <ul class="topic">
                                <li class="link trn"><a href="#">ABC</a></li>
                                <li class="link"><a href="#">DEF</a></li>
                                <li class="link"><a href="#">GHI</a></li>
                            </ul>
                        </li>
                        <li class="hamburg-inside">
                            Materiais
                            <ul class="topic">
                                <li class="link"><a href="#">ABC</a></li>
                                <li class="link"><a href="#">DEF</a></li>
                                <li class="link"><a href="#">GHI</a></li>
                            </ul>
                        </li>
                        <li class="hamburg-inside">
                            Grade escolar
                            <ul class="topic">
                                <li class="link"><a href="#">ABC</a></li>
                                <li class="link"><a href="#">DEF</a></li>
                                <li class="link"><a href="#">GHI</a></li>
                            </ul>
                        </li>
                        <li class="hamburg-inside">
                            Avaliacoes
                            <ul class="topic">
                                <li class="link"><a href="#">ABC</a></li>
                                <li class="link"><a href="#">DEF</a></li>
                                <li class="link"><a href="#">GHI</a></li>
                            </ul>
                        </li>
                        <li class="hamburg-inside">
                            Financeiro
                            <ul class="topic">
                                <li class="link"><a href="#">ABC</a></li>
                                <li class="link"><a href="#">DEF</a></li>
                                <li class="link"><a href="#">GHI</a></li>
                                <li class="link"><a href="#">GHI</a></li>
                                <li class="link"><a href="#">GHI</a></li>
                            </ul>
                        </li>
                        </li>
                    </ul>
                </i></li>
            </ul>
        
        </div>

    </nav>

    <section>

        <div class="form-main">

            <div class="form-main-left">

                <fieldset>

                    <legend>Cadastro de Usuario</legend>

                    <label for="tipo">Categoria do Usuario</label>
                    <select name="tipo" id="tipo">
                        <option value="0">Selecione...</option>
                        <option value="1">Administrador</option>
                        <option value="2">Administrativo</option>
                        <option value="3">Funcionario</option>
                        <option value="4">Professor</option>
                        <option value="5">Aluno</option>
                        <option value="6">Responsavel</option>
                    </select>

                    <br>

                    <label for="nome">Nome</label>
                    <input class="input-txt" type="text" id="nome" name="nome" placeholder="digite nome" required>

                    <br>

                    <label for="login">Login</label>
                    <input class="input-txt" type="text" id="login" name="login" placeholder="digite login" required>

                    <br>

                    <label for="senha">Senha</label>
                    <input class="input-txt" type="password" id="senha" name="senha" placeholder="digite senha"
                        required>

                </fieldset>

            </div>

            <div class="form-main-right">

                <fieldset>

                    <legend>Dados Pessoais</legend>

                    <label for="cpf">Cpf</label>
                    <input class="input-txt" type="text" id="cpf" name="cpf" placeholder="digite cpf" required>

                    <br>

                    <label for="tel">Telefone</label>
                    <input class="input-txt" type="text" id="tel" name="tel" placeholder="(21)99999-9999" required>

                    <br>

                    <label for="endereco">Endereco</label>
                    <input class="input-txt" type="text" id="endereco" name="endereco"
                        placeholder="Ex:Av. das Americas 5000" required>

                    <br>
                    <label for="email">Email</label>
                    <input class="input-txt" type="email" id="email" name="email" placeholder="Ex:joao@mail.com"
                        required>

                    <br>

                    <label for="niver">Data nascimento</label>
                    <input type="date" id="niver" name="niver" required>

                </fieldset>

            </div>

            <div class="form-main-bottom">

                <input onclick="cadastrar()" class="btn-cad" type="button" value="cadastrar">

                <input class="btn-reset" type="reset" value="clear">

            </div>

        </div>

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