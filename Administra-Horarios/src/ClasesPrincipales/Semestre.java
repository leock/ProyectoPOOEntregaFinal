package ClasesPrincipales;

import java.io.*;
import java.util.*;

public class Semestre {

	private int numero;
	private LinkedList<Asignatura> asignaturas;

        public int getNumero() {
            return numero;
        }

        public void setNumero(int numero) {
            this.numero = numero;
        }

        public LinkedList<Asignatura> getAsignaturas() {
            return asignaturas;
        }

        public void setAsignaturas(LinkedList<Asignatura> asignaturas) {
            this.asignaturas = asignaturas;
        }

        public void agregarAsignatura(Asignatura a){
            asignaturas.add(a);
        }
        
        /**
         * busca por el nombre una signatura en la lista de asignaturas
         * @param n nombre de la asignatura
         * @return asignatura buscada
         */
        public Asignatura buscarAsignatura(String n){
            for (int i = 0, l = asignaturas.size(); i < l; i++){
                if (asignaturas.get(i).getNombre().equals(n)){
                    return asignaturas.get(i);
                }
            }
            return null;
        }
        
	public Semestre(int n) {
		this.numero = n;
                this.asignaturas = new LinkedList();
	}

    @Override
    public String toString() {
        String informacion = "";
        informacion += this.numero + "\n";
        for (int i = 0, l = this.asignaturas.size(); i < l; i++){
            informacion += "\t" + this.asignaturas.get(i).getNombre() + "\n";
        }
        return informacion; //To change body of generated methods, choose Tools | Templates.
    }

        
        
}
