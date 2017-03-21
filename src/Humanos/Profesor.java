
package Humanos;

import Gestion.Asignatura;
import Utilidades.Imprime;
import Utilidades.NivelFormativo;
import java.util.ArrayList;


public class Profesor extends Persona implements Imprime{
    
    private int idProfesor;
    private String direccion;
    private String telefono;
    private Enum<NivelFormativo> nf;
    //relación entre profesores y asignaturas
    private ArrayList<Asignatura> listaProfesorAsignatura;

    public Profesor() {
    }

    public Profesor(String direccion, String telefono, Enum<NivelFormativo> nf, ArrayList<Asignatura> listaProfesorAsignatura, String nombre, String apellidos, int edad) {
        super(nombre, apellidos, edad);
        this.direccion = direccion;
        this.telefono = telefono;
        this.nf = nf;
        this.listaProfesorAsignatura = listaProfesorAsignatura;
    }

    
    

    public ArrayList<Asignatura> getListaProfesorAsignatura() {
        return listaProfesorAsignatura;
    }

    public void setListaProfesorAsignatura(ArrayList<Asignatura> listaProfesorAsignatura) {
        this.listaProfesorAsignatura = listaProfesorAsignatura;
    }
    

    public Enum<NivelFormativo> getNf() {
        return nf;
    }

    public void setNf(Enum<NivelFormativo> nf) {
        this.nf = nf;
    }
         
    public int getIdProfesor() {
        return idProfesor;
    }

    public void setIdProfesor(int idProfesor) {
        this.idProfesor = idProfesor;
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
    
    
    
    
}
