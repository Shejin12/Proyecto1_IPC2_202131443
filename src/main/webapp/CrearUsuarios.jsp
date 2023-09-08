<%-- 
    Document   : CrearUsuarios
    Created on : 8 sept 2023, 10:44:30
    Author     : Usuario
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <form action="SvUsuario" method="POST">
            <p><label>DPI: </label><input type="text" name="dpi"></p>
            <p><label>Nombre: </label><input type="text" name="nombre"></p>
            <p><label>Telefono: </label><input type="text" name="telefono"></p>
            <p><label>Suscripción: </label><input type="text" name="suscripcion"></p>
            <p><label>Direccion: </label><input type="text" name="direccion"></p>
            <p><label>Contraseña: </label><input type="text" name="pass"></p>
            <button type="submit" class="text-center d-grid gap-2">Enviar</button>
        </form>
    </body>
</html>
