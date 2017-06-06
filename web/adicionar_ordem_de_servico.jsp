<%-- 
    Document   : AdicionarOrdemDeServico
    Created on : 15/05/2017, 15:10:17
    Author     : Diego
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Adicionar Ordem de Serviço</title>
    </head>
    <body>
        
        <header>
        <jsp:include page="header.jsp"/>
        </header>
        
       <center> <h1>Adicionar Ordem de Serviço</h1> </center>

        <br>
        <br>

        <form action="AdicionarOrdemDeServicoCelular">        
            <table width="50%" align="center" border="1">
                <tr>
                    <td width="180" align="left">Cliente*:</td>
                    <td><input type="text" name="cliente" size="82" maxlength="50"></td>
                </tr>
                <tr>
                    <td size="50" align="left">Caixa:</td>
                    <td><input type="text" name="caixa" size="82" maxlength="100"></td>
                </tr>
                <tr>
                    <td size="50" align="left">Data*:</td>
                    <td><input type="text" name="data" size="30" maxlength="10"></td>
                </tr>
                <tr>
                    <td size="50" align="left">Data da Compra:</td>
                    <td><input type="text" name="dataCompra" size="30" maxlength="10"></td>
                </tr>
                <tr>
                    <td size="50" align="left">Operadora:</td>
                    <td><input type="text" name="operadora" size="82" maxlength="100"></td>
                </tr>
                <tr>
                    <td size="50" align="left">Garantia*:</td> 
                    <td><input type="radio" name="garantia" value="Sim">Sim
                        <input type="radio" name="garantia" value="Não">Não</td>
                </tr>
                <tr>
                    <td size="50" align="left">Marca*:</td>
                    <td><input type="text" name="marca" size="82" maxlength="100"></td>
                </tr>
                <tr>
                    <td size="50" align="left">Modelo*:</td>
                    <td><input type="text" name="modelo" size="82" maxlength="100"></td>
                </tr>
                <tr>
                    <td size="50" align="left">Serial*:</td>
                    <td><input type="text" name="serial" size="82" maxlength="100"></td>
                </tr>
                <tr>
                    <td size="50" align="left">Acessórios</td> 
                    <td><input type="text" name="acessorios" size="82" maxlength="100"></td>
                </tr>
                <tr>
                    <td size="50" align="left">Defeito*:</td>
                    <td><input type="text" name="defeito" size="82" maxlength="100"></td>
                </tr>
                <tr>
                    <td size="50" align="left">Estado do Aparelho:</td>
                    <td><input type="text" name="estadoAparelho" size="82" maxlength="100"></td>
                </tr>
                <tr>
                    <td size="50" align="left">Valor do Serviço:</td>
                    <td><input type="text" value="00" name="valorServico" size="30" maxlength="100"></td>
                </tr>
                <td size="50" align="left">Situação*:</td>
                <td size="50"><select name="situacao" multiple size="2">
                    <option value="Encaminhado">Encaminhado</option>
                    <option value="Aguardando Autorização">Aguardando Autorização</option>
                    <option value="Aguardando Orçamento">Aguardando Orçamento</option>
                    <option value="Pronto">Pronto</option>
                    </select></td>
                <tr>
                    <td size="50" align="left">Observações:</td>
                    <td><input type="text" name="observacao" size="82" maxlength="100"></td>
                </tr>
                <tr>
                    <td size="50" align="left">Atendente*:</td>
                    <td><input type="text" name="atendente" size="82" maxlength="100"></td>
                </tr>
            </table> 
            <br>
            <br>
            <center> <input type="submit" value="Adicionar"> </center>
        </form>
        
        *= Campos Obrigatórios.
    </body>
</html>
