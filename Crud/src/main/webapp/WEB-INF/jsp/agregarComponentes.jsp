<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%> 
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%> 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
        <title>Componentes del Crud</title>
    </head>

    <c:choose>  
        <c:when test="'Agregar Componente'">  
            <!--<c:url var="accionComponente" value="actualizarComponentes.html"/>-->
            <spring:url var="accionComponente" value="/actualizarComponentes.html"/>
        </c:when>  
        <c:otherwise>  
            <!--<c:url var="accionComponente" value="agregarComponentes.html"/>-->
            <spring:url var="accionComponente" value="/agregarComponentes.html"/> 
        </c:otherwise>  
    </c:choose>

    <form:form id="agregar" modelAttribute="componenteForm" method="post" action="">
        <table width="400px" height="150px">
            
            <tr>
                <form:hidden path="id" />
                <td><form:label path="nombre">Nombre</form:label></td>
                <td><form:input  path="nombre"/></td>
            </tr>
            <tr>
                <td><form:label path="direccion">Dirección</form:label></td>
                <td><form:input  path="direccion"/></td>
            </tr> 
            <tr>
                <td><form:label path="telefono">Telefono</form:label></td>
                <td><form:input  path="telefono"/></td>
            </tr>
            <tr>
                <td><form:label path="email">E-mail</form:label></td>
                <td><form:input  path="email"/></td>
            </tr>

            <tr><td></td><td>
                    <c:choose>  
                        <c:when test="'Agregar Componente'">  
                            <input type="submit" value="Modificar" /> 
                        </c:when>  
                        <c:otherwise>  
                            <input type="submit" value="Agregar" />
                        </c:otherwise>  
                    </c:choose>
                </td></tr>
        </table>
    </form:form>

    
</html>