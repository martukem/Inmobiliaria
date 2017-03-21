
package instituto;

import EjemplosDao.DaoAlumno;
import EjemplosDao.DaoProfesor;
import Humanos.Alumno;
import Utilidades.ConexionBd;
import java.sql.SQLException;

/*import Gestion.Asignatura;
import Gestion.Curso;
import Humanos.Alumno;
import Humanos.Persona;
import Humanos.Profesor;
import Utilidades.ConexionBd;
import Utilidades.Imprime;
import Utilidades.NivelFormativo;
import java.util.ArrayList;*/


public class Instituto {

    
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        
        Alumno alumno1= new Alumno();
        alumno1.setNombre("Marta");
        alumno1.setApellidos("Casajus");
        alumno1.setDireccion("Zaragoza");
        alumno1.setTelefono("123");
        alumno1.setEdad(25);
        
        
        DaoAlumno daoAlumno=new DaoAlumno();
        daoAlumno.conexionDaoAlumno();
        //daoAlumno.insertarRegistro(alumno1.getNombre(), alumno1.getApellidos(), direccionAlumno, telefonoAlumno, 0);
         daoAlumno.insertarRegistro(alumno1.getNombre(), alumno1.getApellidos(), alumno1.getDireccion(), alumno1.getTelefono(), alumno1.getEdad());
        
                
        
        //DaoProfesor daoProfesor=new DaoProfesor();
        //daoProfesor.conexionDaoProfesor();
        
        
        //ConexionBd conector=new ConexionBd();
        //conector.conectado();
       // conector.buscarPorNombre("Raul");/*public void buscarPorNombre*/
       //conector.actualizarPorNombre("RAULITO", "1");/* public void update*/
       //conector.borrarRegistro(8); /* public void delete*/
       //conector.insertarRegistro("Marta", "Casajus", "Zaragoza", "1234", 25);
       //conector.listarProfesores();
       
        /*ConexionBd conectar=new ConexionBd();
        conectar.conectar();*/
        /*
        Asignatura asignatura1=new Asignatura("Java");
        Asignatura asignatura2=new Asignatura("SQL");
        Asignatura asignatura3=new Asignatura("JEE");
    
        //Lista
        ArrayList<Asignatura> listaAsignatura=new ArrayList<>();
        listaAsignatura.add(asignatura1);
        listaAsignatura.add(asignatura2);
        listaAsignatura.add(asignatura3);
        
        //PROFESORES
        Profesor profesor1=new Profesor();
        profesor1.setNombre("Manolo");
        profesor1.setListaProfesorAsignatura(listaAsignatura);
        profesor1.setNf(NivelFormativo.TITULADO_SUPERIOR);
        
        Profesor profesor2=new Profesor();
        profesor2.setNombre("Aurelio");
        profesor2.setListaProfesorAsignatura(listaAsignatura);
        profesor2.setNf(NivelFormativo.TITULADO_MEDIO);
        
        Profesor profesor3=new Profesor();
        profesor3.setNombre("Avelino");
        profesor3.setListaProfesorAsignatura(listaAsignatura);
        profesor3.setNf(NivelFormativo.BACHILLER);
        
        //LISTA PROFESORES
        
        ArrayList<Profesor>listaProfesor=new ArrayList<>();
        listaProfesor.add(profesor1);
        listaProfesor.add(profesor2);
        listaProfesor.add(profesor3);


        //ALUMNOS
        Alumno alumno1=new Alumno("Forum","Aragon", 30, "Enero", null);
        Alumno alumno2=new Alumno("Patricio","Esponja", 32, "Febrero", null);
        
        ArrayList<Alumno>listaAlumno=new ArrayList<>();
        listaAlumno.add(alumno1);
        listaAlumno.add(alumno2);
        
        //CURSO
        Curso curso1=new Curso();
        curso1.setNombreCurso("Desarrollo Web");
        curso1.setFechaInicio("Enero");
        curso1.setFechaFin("Junio");
        curso1.setListaCursoAlumno(listaAlumno);
        curso1.setListaCursoAsignatura(listaAsignatura);
        curso1.setListaCursoProfesor(listaProfesor);
        curso1.imprimeAll();
*/
    }
    
}
