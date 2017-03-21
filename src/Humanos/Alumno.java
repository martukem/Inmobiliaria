
package Humanos;

import java.util.ArrayList;

// Este es un pojo porque tienen dependecias
public class Alumno extends Persona{
    
    private int idAlumno;
    private String direccion;
    private String telefono;
    private String fechaAlta;
    //Establece la relacion entre alumnos y profesores ( Es una dependecia)
    private ArrayList<Profesor> listaAlumnoProfesor;
    
    

    public Alumno() {
    }

    public Alumno(String fechaAlta, ArrayList<Profesor> listaAlumnoProfesor) {
        this.fechaAlta = fechaAlta;
        this.listaAlumnoProfesor = listaAlumnoProfesor;
    }
    
    public Alumno(String nombre, String apellido, int edad, String fechaAlta, ArrayList<Profesor> listaAlumnoProfesor) {
        super();
        this.fechaAlta = fechaAlta;
        this.listaAlumnoProfesor = listaAlumnoProfesor;
    }

    public int getIdAlumno() {
        return idAlumno;
    }

    public void setIdAlumno(int idAlumno) {
        this.idAlumno = idAlumno;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getFechaAlta() {
        return fechaAlta;
    }

    public void setFechaAlta(String fechaAlta) {
        this.fechaAlta = fechaAlta;
    }

    public ArrayList<Profesor> getListaAlumnoProfesor() {
        return listaAlumnoProfesor;
    }

    public void setListaAlumnoProfesor(ArrayList<Profesor> listaAlumnoProfesor) {
        this.listaAlumnoProfesor = listaAlumnoProfesor;
    }

    public Alumno(int idAlumno, String telefono, String fechaAlta, ArrayList<Profesor> listaAlumnoProfesor, String nombre, String apellidos, int edad) {
        super(nombre, apellidos, edad);
        this.idAlumno = idAlumno;
        this.telefono = telefono;
        this.fechaAlta = fechaAlta;
        this.listaAlumnoProfesor = listaAlumnoProfesor;
    }

    
    
    
}
