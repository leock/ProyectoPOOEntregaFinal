package ClasesPrincipales;

import java.io.*;
import java.util.*;

public class Grupo {

	private String nombre;
	private Asignatura asignaturo;
	private HorarioGrupo horario;
	private Profesor profesor;

        public String getNombre() {
            return nombre;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public Asignatura getAsignaturo() {
            return asignaturo;
        }

        public void setAsignaturo(Asignatura asignaturo) {
            this.asignaturo = asignaturo;
        }

        public HorarioGrupo getHorario() {
            return horario;
        }

        public void setHorario(HorarioGrupo horario) {
            this.horario = horario;
        }

        public Profesor getProfesor() {
            return profesor;
        }

        public void setProfesor(Profesor profesor) {
            this.profesor = profesor;
        }

	public Grupo(String n, Asignatura a, Profesor p, HorarioGrupo h) {
		this.asignaturo = a;
                this.horario = h;
                this.nombre = n;
                this.profesor = p;
	}
        
        public String[] toArrayString(){
            String informacion[] = {this.asignaturo.getNombre(), this.horario.getDia(), 
                this.horario.getHoraInicio(), this.horario.getHoraFinal()};
            return informacion;
        }

}
