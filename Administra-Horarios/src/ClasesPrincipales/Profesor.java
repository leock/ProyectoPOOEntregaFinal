package ClasesPrincipales;

import java.io.*;
import java.util.*;

public class Profesor {

	private String nombre;
	private String cedula;
	private LinkedList<HorarioProfesor> horarioDisponibilidad;
	private Departamento departamento;
	private Usuario usuario;
	private LinkedList<Grupo> grupo;

        public String getNombre() {
            return nombre;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public String getCedula() {
            return cedula;
        }

        public void setCedula(String cedula) {
            this.cedula = cedula;
        }

        public LinkedList<HorarioProfesor> getHorarioDisponibilidad() {
            return horarioDisponibilidad;
        }

        public void setHorarioDisponibilidad(LinkedList<HorarioProfesor> horarioDisponibilidad) {
            this.horarioDisponibilidad = horarioDisponibilidad;
        }

        public Departamento getDepartamento() {
            return departamento;
        }

        public void setDepartamento(Departamento departamento) {
            this.departamento = departamento;
        }

        public Usuario getUsuario() {
            return usuario;
        }

        public void setUsuario(Usuario usuario) {
            this.usuario = usuario;
        }

        public LinkedList<Grupo> getGrupo() {
            return grupo;
        }

        public void setGrupo(LinkedList<Grupo> grupo) {
            this.grupo = grupo;
        }

	public Profesor(String nom, String ced, String d, String u, String c) {
		this.cedula = ced;
                this.nombre = nom;
                //buscar departamento y asignarlo "d"
                this.usuario = new Usuario(u, c, "Profesor");
                this.horarioDisponibilidad = new LinkedList();
                this.grupo = new LinkedList();
	}

}
