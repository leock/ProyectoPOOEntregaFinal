package ClasesPrincipales;

import java.io.*;
import java.util.*;

public abstract class Asignatura {

	private String nombre;
	private int numeroCreditos;
	private int horasDedicadas;
	private String categoriaCurso;

	public Asignatura(String nom, int num, int hD, String cC) {
		this.categoriaCurso = cC;
                this.horasDedicadas = hD;
                this.nombre = nom;
                this.numeroCreditos =num;
	}
        
        public String getNombre() {
            return nombre;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public int getNumeroCreditos() {
            return numeroCreditos;
        }

        public void setNumeroCreditos(int numeroCreditos) {
            this.numeroCreditos = numeroCreditos;
        }

        public int getHorasDedicadas() {
            return horasDedicadas;
        }

        public void setHorasDedicadas(int horasDedicadas) {
            this.horasDedicadas = horasDedicadas;
        }

        public String getCategoriaCurso() {
            return categoriaCurso;
        }

        public void setCategoriaCurso(String categoriaCurso) {
            this.categoriaCurso = categoriaCurso;
        }
        
        public abstract String[] toArrayString();
        
        public abstract String obtenerTipoAsignatura(int p);
}
