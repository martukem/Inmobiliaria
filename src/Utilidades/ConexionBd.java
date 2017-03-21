
package Utilidades;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;


public class ConexionBd {
    // variable global
    // los objetos, metodos estaticos son de la CLASE,  por lo tanto sus valores son compartidos por los objetos de esa clase
    public static Connection conexion=null; /* esto es una propiedad*/
    private DatabaseMetaData dm;
    
    public static Connection conectado() throws ClassNotFoundException, SQLException{
       
    
    //cargar el driver
    Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
    //Pedir una conexion e iniciamos una variable
    conexion=DriverManager.getConnection("jdbc:sqlserver://192.168.1.110\\SQL2012EXPRESS_1;databaseName=Academia", "sa", "root");
        
    /*if(conexion!=null){
        
         dm= conexion.getMetaData();
        
        System.out.println("Conexion Establecida");
        System.out.println("Driver Name"+dm.getDriverName());
        System.out.println("Driver Version"+dm.getDriverVersion());
        System.out.println("BD Name"+dm.getDatabaseProductName());
        
    }*/
    return conexion;
            
            
   }
    
    //Metodo con parametr
     
     
     
    /*private Connection conexion=null;
    
    public Connection conectar(){
        
        
        try {
            //Cargar driver
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ConexionBd.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            conexion=DriverManager.getConnection("jdbc:sqlserver://localhost,dataBaseName=Instituto", "root", "root");
        } catch (SQLException ex) {
            Logger.getLogger(ConexionBd.class.getName()).log(Level.SEVERE, null, ex);
        }
        if(conexion!=null){
            System.out.println("Conexion..........Establecida");
        }
         
        return conexion;
    }
    
  /* Connetion conectar() throws ClassNotFoundException
    class.*/

 public void cerraConexion() throws SQLException{
      
      conexion.close();
      
  }    
 
    
    
}
