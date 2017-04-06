<%-- 
    Document   : altaPais
    Created on : 6/04/2017, 12:18:42 AM
    Author     : marieuri
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
submitHandler: function(form){
	guardarProducto();

        return false;
}
funcion guardarPais(){
	$.ajax({
                url: "NuevoPais",
                type: "post",
                data: $("frmNuevoPais"),serialize();}).
done(function(){
}).fail(funcion(data){
   alert('ocurrió un error.');});
}