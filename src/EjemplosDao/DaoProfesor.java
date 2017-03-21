
package EjemplosDao;

import Utilidades.ConexionBd;
import static Utilidades.ConexionBd.conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class DaoProfesor {
      
    //Creamos el objeto
    //private Connection conexion=null;
    
    // Creamos otro metodo
    public Connection conexionDaoProfesor() throws ClassNotFoundException, SQLException{
        
        //Ahora creamos una conexion
        ConexionBd.conexion=null;
        conexion=ConexionBd.conectado();
        
        if (conexion!=null){
            System.out.println("Conexion Establecida");
        }
       return conexion; 
    } 
    
    
    //Metodo con parametros
     public void buscarPorNombre(String nombreBuscado) throws SQLException{
         
         
         
         String sql="select * from Profesor where nombreProfesor=?";
         PreparedStatement buscar=conexion.prepareStatement(sql);
         buscar.setString(1, nombreBuscado);
         ResultSet rs= buscar.executeQuery();
         while(rs.next()){
            System.out.println("Id Profesor:"+rs.getString(1)); 
            System.out.println("Nombre Profesor:"+rs.getString(2));
            System.out.println("Apellido Profesor:"+rs.getString(3));
            System.out.println("Direccion Profesor:"+rs.getString(4));
            System.out.println("Tfno. Profesor:"+rs.getString(5));
            System.out.println("Edad Profesor:"+rs.getString(6));
         }
         buscar.close();
         rs.close();
     }
     
     public void actualizarPorNombre(String nombreProfesor, int idProfesor) throws SQLException{
     
       String sql="update Profesor set nombreProfesor=? where idProfesor=?";
       PreparedStatement buscar=conexion.prepareStatement(sql);  
       buscar.setString(1, nombreProfesor);
       buscar.setInt(2, idProfesor);
       int filasAfectadas=buscar.executeUpdate();
       System.out.println("Filas afectadas:"+filasAfectadas); 
       
     }
     
     public void borrarRegistro(int idProfesor) throws SQLException{
        PreparedStatement buscar=conexion.prepareStatement("delete from Profesor  where idProfesor=?");
        buscar.setInt(1, idProfesor);
        int filasAfectadas=buscar.executeUpdate();
        System.out.println("Filas afectadas:"+filasAfectadas); 
     }
     
     public void insertarRegistro(String nombreProfesor, String apellidoProfesor, String direccionProfesor, String telefonoProfesor, int edadProfesor) throws SQLException{
         
         String sql="insert into Profesor(nombreProfesor, apellidoProfesor, direccionProfesor, telefonoProfesor, edadProfesor) values(?,?,?,?,?)";
         PreparedStatement buscar=conexion.prepareStatement(sql); 
         buscar.setString(1, nombreProfesor);
         buscar.setString(2, apellidoProfesor);
         buscar.setString(3, direccionProfesor);
         buscar.setString(4, telefonoProfesor);
         buscar.setInt(5, edadProfesor);
         int filasAfectadas=buscar.executeUpdate();
        System.out.println("Filas afectadas:"+filasAfectadas); 
     }
     
     public void listarProfesores() throws SQLException{
        // El statement es para consutlas sin parametros
        String sql="select * from Profesor";
        Statement stm=null;
        stm=conexion.createStatement();
        //Rellenamos la lista de Profesores en un Resulset
        ResultSet rs=stm.executeQuery(sql);
        while (rs.next()){
            
            System.out.println("Id Profesor:"+rs.getString(1)); 
            System.out.println("Nombre Profesor:"+rs.getString(2));
            System.out.println("Apellido Profesor:"+rs.getString(3));
            System.out.println("Direccion Profesor:"+rs.getString(4));
            System.out.println("Tfno. Profesor:"+rs.getString(5));
            System.out.println("Edad Profesor:"+rs.getString(6));
        }
     
    stm.close();
    rs.close();
    }
      public void cerraConexion() throws SQLException{
      
      conexion.close();
      
  }  
      
  }  
    

