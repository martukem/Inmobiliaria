
package EjemplosDao;

import Utilidades.ConexionBd;
import static Utilidades.ConexionBd.conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class DaoAlumno {
    public Connection conexionDaoAlumno() throws ClassNotFoundException, SQLException{
        
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
         
         
         
         String sql="select * from Alumno where nombreAlumno=?";
         PreparedStatement buscar=conexion.prepareStatement(sql);
         buscar.setString(1, nombreBuscado);
         //utilizamos executeQuery porque nos devuelve resultados
         ResultSet rs= buscar.executeQuery();
         while(rs.next()){
            System.out.println("Id Alumno:"+rs.getString(1)); 
            System.out.println("Nombre Alumno:"+rs.getString(2));
            System.out.println("Apellido Alumno:"+rs.getString(3));
            System.out.println("Direccion Alumno:"+rs.getString(4));
            System.out.println("Tfno. Alumno:"+rs.getString(5));
            System.out.println("Edad Alumno:"+rs.getString(6));
            
            listarAlumno();
         }
         //cerramos el prepareStatement
         buscar.close();
         //cerramos el resultset
         rs.close();
     }
     
     public void actualizarPorNombre(String nombreAlumno, int idAlumno) throws SQLException{
     
       String sql="update Alumno set nombreAlumno=? where idAlumno=?";
       PreparedStatement buscar=conexion.prepareStatement(sql);  
       buscar.setString(1, nombreAlumno);
       buscar.setInt(2, idAlumno);
       int filasAfectadas=buscar.executeUpdate();
       System.out.println("Filas afectadas:"+filasAfectadas); 
       
     }
     
     public void borrarRegistro(int idAlumno) throws SQLException{
        PreparedStatement buscar=conexion.prepareStatement("delete from Alumno  where idAlumno=?");
        buscar.setInt(1, idAlumno);
        int filasAfectadas=buscar.executeUpdate();
        System.out.println("Filas afectadas:"+filasAfectadas); 
     }
     
     public void insertarRegistro(String nombreAlumno, String apellidoAlumno, String direccionAlumno, String telefonoAlumno, int edadAlumno) throws SQLException{
         
         String sql="insert into Alumno(nombreAlumno, apellidoAlumno, direccionAlumno, telefonoAlumno, edadAlumno) values(?,?,?,?,?)";
         PreparedStatement buscar=conexion.prepareStatement(sql); 
         buscar.setString(1, nombreAlumno);
         buscar.setString(2, apellidoAlumno);
         buscar.setString(3, direccionAlumno);
         buscar.setString(4, telefonoAlumno);
         buscar.setInt(5, edadAlumno);
         int filasAfectadas=buscar.executeUpdate();
        System.out.println("Filas afectadas:"+filasAfectadas); 
     }
     
     public void listarAlumno() throws SQLException{
        // El statement es para consutlas sin parametros
        String sql="select * from Alumno";
        Statement stm=null;
        stm=conexion.createStatement();
        //Rellenamos la lista de Profesores en un Resulset
        ResultSet rs=stm.executeQuery(sql);
        while (rs.next()){
            
            System.out.println("Id Alumno:"+rs.getString(1)); 
            System.out.println("Nombre Alumno:"+rs.getString(2));
            System.out.println("Apellido Alumno:"+rs.getString(3));
            System.out.println("Direccion Alumno:"+rs.getString(4));
            System.out.println("Tfno. Alumno:"+rs.getString(5));
            System.out.println("Edad Alumno:"+rs.getString(6));
        }
     
    stm.close();
    rs.close();
    }
      public void cerraConexion() throws SQLException{
      
      conexion.close();
      
  }  

      
}
