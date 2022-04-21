<%-- 
    Document   : list
    Created on : 7 abr 2022, 8:32:08
    Author     : informatica
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Lista Carrera!</h1>
        
        <table border="1" width="100%">
		<tr>
		 <td> idcarrera</td>
		 <td> NOMBRE</td>	
		 <td colspan=2>ACCIONES</td>
		</tr>
		<c:forEach var="carrera" items="${listaCarrera}">
			<tr>
				<td><c:out value="${carrera.idcarrera}"/></td>
				<td><c:out value="${carrera.nombre}"/></td>
				<td><a href="adminArticulo?action=showedit&id=<c:out value="${carrera.idcarrera}" />">Editar</a></td>
				<td><a href="adminArticulo?action=eliminar&id=<c:out value="${carrera.idcarrera}"/>">Eliminar</a> </td>				
			</tr>
		</c:forEach>
	</table>
    </body>
</html>
