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
        <title>JSP Page</title>
        <script>
            
            $(document).ready(function(){
                $('#btn-submit').click( function (){
                    var texto = $('#usuario').val();
                    $('#msg-carregando').text(texto);
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
