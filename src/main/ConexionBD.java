package main;

import java.sql.*;

public class ConexionBD {

    // recomendable crear un metodo para cada seccion (en este caso user)
public static void InserUser(Connection con, String name, String password){

    String sql = "insert into usuarios values('"+name+"','"+password+"')";
    Statement stmt;
    int result;

    try {
        stmt = con.createStatement();
        result = stmt.executeUpdate(sql);
        //en este ejemplo no es muy util este if, debido a que su else, es el mismo catch
        // pero en un jframe tal vez sea mas util
        if(result == 1){
            System.out.println("Usuario registrado exitosamente");
        }
    } catch (SQLException e) {
        System.out.println(e.getMessage());
        throw new RuntimeException(e);
    }
}



    //CONSULTAR DATOS

public static void  Consulta(Connection con) {
    String sql = "select * from (nombre de la tabla que deseo consultar)";
    //select * from user Where id = 3 (para consultar solo los datos del usuario 3

    Statement stmt;
    ResultSet rs;
    int id;
    String nombre, password; //segun el orden en la base de datos
    // y lo que vamos a consultar, se crean variables que se necesiten)


    try {
        stmt = con.createStatement();
        rs = stmt.executeQuery(sql);

        while(rs.next()) {
            //según el tipo de dato y nombre de las columnas
            id = rs.getInt("id");
            nombre = rs.getString("nombre");
            password = rs.getString("password");

            System.out.println("ID: " + id + " Nombre: " + nombre + " Password: " + password);

        }
    } catch (SQLException e) {
        System.out.println("Error: " + e);
        throw new RuntimeException(e);
    }
}

        //CONECTAR BASE DE DATOS
public static Connection ConectarBD( String bd ) {
  Connection con;
  String Url = "Esperar url profesor";
  String user = "Esperar url profesor";
  String password = "Esperar url profesor";


    System.out.println("Conectando...");

   try {
       con = DriverManager.getConnection(Url+bd,user,password);
       System.out.println("Conectado");
   }catch (SQLException e) {
       System.out.println(e.getMessage());
        throw new RuntimeException(e);
   }

    return con;
}
//DESCONECTAR BASE DE DATOS
public static void Desconexion(Connection cb) {
    try {
        cb.close();
        System.out.println("Desconectado");
    } catch (SQLException e) {
        System.out.println(e.getMessage());
        throw new RuntimeException(e);
    }
}


// INICIAR BASE DE DATOS
public static void main (String[] args) {
    Connection bd = ConectarBD("prueba");
    // se insertó un nuevo usuario con esos parametros
    InserUser(bd, "gabriel","123456");
    Consulta(bd); //consultamos los datos de la tabla
    //prueba = es el nombre que se le da la base de datos
//    System.out.println("Consultas terminadas");
//    Desconexion(bd); (para desconectar nuestra base de datos)
}

}