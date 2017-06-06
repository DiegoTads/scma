<%-- 
    Document   : index
    Created on : 15/05/2017, 14:10:08
    Author     : Diego
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Sistema para Controle de Manutenção de Aparelhos</title>
    </head>
    <body>
        
        <header>
        <jsp:include page="header.jsp"/>
        </header>

        <br>
        <br>
        
        <center>
        <h1>Login</h1>
        </center>
        
        <br>
        
        <form action="login">
        <center>
        Usuario: <input type="text" name="usuario"> <br><br>
        Senha: <input type="password" name="senha">
        <br>
        <br>
        <input type="submit" name="logar" value="Entrar">
       
        <br>
        <br>
        </form>
            
        <a href="redefinir_senha.jsp" target = "ordemDeServico">Redefinir senha</a><br><br>
        <a href="cadastrar.jsp" target = "ordemDeServico">Cadastrar</a>

        </center>
    </body>
</html>
