package ClasesPrincipales;

import java.io.*;
import java.util.*;

public class Laboratorio extends Aula {

	private int cantidadEquipo;
	private String equipo;

        public int getCantidadEquipo() {
            return cantidadEquipo;
        }

        public void setCantidadEquipo(int cantidadEquipo) {
            this.cantidadEquipo = cantidadEquipo;
        }

        public String getEquipo() {
            return equipo;
        }

        public void setEquipo(String equipo) {
            this.equipo = equipo;
        }

	public Laboratorio(int cE, String e, int num, String nom, String u, int c) {
		super(num, nom, u, c);
                this.cantidadEquipo = cE;
                this.equipo = e;
	}

}
