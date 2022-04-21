<%-- 
    Document   : createForm
    Created on : 7 abr 2022, 9:16:31
    Author     : informatica
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Registrar Articulo</h1>
	<form action="CarreraControllerServlet?action=insert" method="post">
		<table border="1" align="center">		
		<tr>
			<td>Nombre:</a></td>		
			<td><input type="text" name="nombre"/></td>	
		</tr>
		
	</table>
	<br>
	<table border="0" align="center">
		<tr>
		<td><input type="submit" value="Agregar" name="agregar"></td>	
		</tr>
	
	</form>
    </body>
</html>
