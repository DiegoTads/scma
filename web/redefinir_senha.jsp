<%-- 
    Document   : redefinir_senha
    Created on : 23/05/2017, 13:24:49
    Author     : Diego
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Redefinir Senha</title>
    </head>
    <body>
        
        <header>
        <jsp:include page="header.jsp"/>
        </header>
        
        <center>
        <h1>Redefinir Senha</h1>
        
        <form action="RedefinirSenha">
        <center>
        Usuario: <input type="text" name="usuario"> <br><br>
        Nova Senha: <input type="password" name="senha"> <br><br>
        Nome: <input type="text" size="50" name="nome"> <br><br>
        Pergunta: <input type="text" size="50" name="pergunta"> <br><br>
        Resposta: <input type="text" size="50" name="resposta"> <br><br>
        <br>
        <br>
        <input type="submit" name="logar" value="Redefinir">
       
        <br>
        <br>
        </form>
        </center>
            
    </body>
</html>
