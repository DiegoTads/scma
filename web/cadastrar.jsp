<%-- 
    Document   : cadastrar
    Created on : 23/05/2017, 13:25:49
    Author     : Diego
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Cadastrar Usuário</title>
    </head>
    <body>
        
        <header>
        <jsp:include page="header.jsp"/>
        </header>
        
        <center>
        <h1>Cadastrar Usuário</h1>
        
        <form action="CadastrarUsuario">
        <center>
        Usuario: <input type="text" name="usuario"> <br><br>
        Senha: <input type="password" name="senha"> <br><br>
        Nome: <input type="text" size="50" name="nome"> <br><br>
        Pergunta: <input type="text" size="50" name="pergunta"> <br><br>
        Resposta: <input type="text" size="50" name="resposta"> <br><br>
        <br>
        <br>
        <input type="submit" name="logar" value="Cadastrar">
       
        <br>
        <br>
        </form>
        </center>
            
    </body>
</html>
