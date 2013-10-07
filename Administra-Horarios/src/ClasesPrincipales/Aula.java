package ClasesPrincipales;

import java.io.*;
import java.util.*;

public abstract class Aula {

	private int numero;
	private String nombre;
	private String ubicacion;
	private int capacidad;

        public int getNumero() {
            return numero;
        }

        public void setNumero(int numero) {
            this.numero = numero;
        }

        public String getNombre() {
            return nombre;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public String getUbicacion() {
            return ubicacion;
        }

        public void setUbicacion(String ubicacion) {
            this.ubicacion = ubicacion;
        }

        public int getCapacidad() {
            return capacidad;
        }

        public void setCapacidad(int capacidad) {
            this.capacidad = capacidad;
        }

	public Aula(int num, String nom, String u, int c) {
		this.capacidad = c;
                this.nombre = nom;
                this.numero = num;
                this.ubicacion = u;
	}

}
