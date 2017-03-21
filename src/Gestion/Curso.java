
package Gestion;

import Humanos.Alumno;
import Humanos.Profesor;
import Utilidades.Imprime;
import java.util.ArrayList;


public class Curso implements Imprime{
    
    private int idCurso;
    private String nombreCurso;
    private String fechaInicio;
    private String fechaFin;
    //Relaciones entre alumnos, materias y profesores
    private ArrayList<Profesor> listaCursoProfesor;
    private ArrayList<Alumno> listaCursoAlumno;
    private ArrayList<Asignatura> listaCursoAsignatura;

    public int getIdCurso() {
        return idCurso;
    }

    public void setIdCurso(int idCurso) {
        this.idCurso = idCurso;
    }

    public String getNombreCurso() {
        return nombreCurso;
    }

    public void setNombreCurso(String nombreCurso) {
        this.nombreCurso = nombreCurso;
    }
    

    public String getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(String fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public String getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(String fechaFin) {
        this.fechaFin = fechaFin;
    }

    public ArrayList<Profesor> getListaCursoProfesor() {
        return listaCursoProfesor;
    }

    public void setListaCursoProfesor(ArrayList<Profesor> listaCursoProfesor) {
        this.listaCursoProfesor = listaCursoProfesor;
    }

    

    public ArrayList<Alumno> getListaCursoAlumno() {
        return listaCursoAlumno;
    }

    public void setListaCursoAlumno(ArrayList<Alumno> listaCursoAlumno) {
        this.listaCursoAlumno = listaCursoAlumno;
    }

    public ArrayList<Asignatura> getListaCursoAsignatura() {
        return listaCursoAsignatura;
    }

    public void setListaCursoAsignatura(ArrayList<Asignatura> listaCursoAsignatura) {
        this.listaCursoAsignatura = listaCursoAsignatura;
    }

    @Override
    public void imprimeAlumnoProfesor() {
        
    }

    @Override
    public void imprimeProfesorAsignatura() {
        
    }

    @Override
    public void imprimeCursoProfesor() {
        
        //System.out.println("Datos del curso:"+this.getNombreCurso());
        for (int i = 0; i < listaCursoProfesor.size(); i++) {
            Profesor profesor = listaCursoProfesor.get(i);
            System.out.println("Listado profesores del curso:"+profesor.getNombre()+".."+profesor.getApellidos());
       
            
        }
  
    }

    @Override
    public void imprimeCursoAlumno() {
      
        //System.out.println("Datos del curso:"+this.getNombreCurso());
        for (int i = 0; i < listaCursoAlumno.size(); i++) {
            Alumno alumno = listaCursoAlumno.get(i);
            System.out.println("Listado Alumnos del curso:"+alumno.getNombre()+".."+alumno.getApellidos());
        }
        
    }

    @Override
    public void imprimeCursoAsignatura() {
        System.out.println("Datos del curso:"+this.getNombreCurso());
        for (int i = 0; i < listaCursoAsignatura.size(); i++) {
            Asignatura asignatura = listaCursoAsignatura.get(i);
            System.out.println("Listado Asignaturas del curso: "+asignatura.getNombreAsignatura());
        }
        
    }

    @Override
    public void imprimeCursoCurso() {
        System.out.println("Nombre del Curso: "+this.getNombreCurso());
        System.out.println("Fecha de Inicio: "+this.getFechaInicio());
        System.out.println("Fecha de Fin: "+this.getFechaFin());
    }

    @Override
    public void imprimeAll() {
        imprimeCursoCurso();
                
        imprimeCursoProfesor();
       
        imprimeCursoAlumno();
       
        imprimeCursoAsignatura();
    }
    
    
}
