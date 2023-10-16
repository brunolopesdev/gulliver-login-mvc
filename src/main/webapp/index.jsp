<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" type="text/css" href="login.css" />
    <meta charset="UTF-8">
    <title>Login</title>
</head>
<body>
	<header class="cabecalho">
      <div class="logotipo">
        <img
          class="logo-img"
          src="img/logo-gulliver-menor.png"
          alt="logo do gulliver traveller"
        />

        <ul class="menu" id="menu">
          <li class="menu-opções">
            <a href="#" class="menu-link"> Sobre mim</a>
          </li>

          <li class="menu-opções">
            <a href="#" class="menu-link">Cupom de desconto</a>
          </li>

          <li class="menu-opções">
            <a href="#" class="menu-link">Parceiros</a>
          </li>

          <li class="menu-opções">
            <a href="#" class="menu-link">Promoções</a>
          </li>
        </ul>
      </div>
    </header>
    <main>
	    <form action="LoginServlet" method="post">
	        <label for="nomeUsuario">Nome de Usuário:</label>
	        <input type="text" name="nomeUsuario" id="nomeUsuario" required><br>
	
	        <label for="senha">Senha:</label>
	        <input type="password" name="senha" id="senha" required><br>
	
	        <button type="submit" value="Login">Entrar</button>
	    </form>
    </main>
</body>
</html>