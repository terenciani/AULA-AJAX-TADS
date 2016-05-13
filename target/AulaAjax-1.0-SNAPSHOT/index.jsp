<%-- 
    Document   : index
    Created on : 10/05/2016, 21:46:44
    Author     : Marcelo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <script type="text/javascript" src="js/jquery-1.12.3.min.js"></script>
        <script type="text/javascript" src="js/script.js"></script>
        <title>JSP Page</title>
        <script>
            
            $(document).ready(function(){
                $('#btn-submit').click( function (){
                    /**mandar aparecer aqui*/
                    var texto = $('#usuario').val();
                    /*O primeiro parametro indica a url onde queremos obter um determinado recurso
                     * o segundo é um conjunto de dados chave - valor que são os dados que queremos mandar para o servidor,
                     * o terceiro parametro é uma funçao de resposta
                     * get (url, dados, funcao de resposta)*/
                    $.get('ServletAjax', {usuario: texto}, function (textoResposta){
                         $('#msg-carregando').text(textoResposta);
                    });
                });
            });
           
        </script>
    </head>
    <body>
        <h1>Hello World!</h1>
        <form>
            <input type="text" id="usuario" />
            <input type="button" id="btn-submit" value="Exibir Olá" />
            
            <div id="msg-carregando">Carregando ..</div>
            
            
        </form>
    </body>
</html>
