<%-- 
    Document   : Conexion
    Created on : 12 nov 2022, 12:33:21
    Author     : Sebastian
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
            Class.forName("com.mysql.jdbc.Driver");
            Connection conexion = null;
            String selectProd = "SELECT * FROM tb_sucur"
            String selectSucur = "SELECT id_sucur FROM tb_sucur WHERE nom_sucur = ?"
            PreparedStatement consultaProd = null;
            PreparedStatement consultaSucur = null;
            
            try(
            conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/jspdb", "root", "")
            consultaProd = conexion.preparedStatement(selectProd);
            consultaProd.setString(1, request.getParameter("nom_prod"));
            consultaProd.execute();
            
            
            consultaSucur = conexion.preparedStatement(selectSucur);
            consultaSucur.setString(1, request.getParameter("nom_sucur"));
            consultaSucur.execute();
        %>
    </body>
</html>
