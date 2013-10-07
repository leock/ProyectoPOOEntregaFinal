package ClasesPrincipales;

import java.io.*;
import java.util.*;

public class HorarioProfesor {

	private String dia;
	private String horaInicio;
	private String horaFinal;

        public String getDia() {
            return dia;
        }

        public void setDia(String dia) {
            this.dia = dia;
        }

        public String getHoraInicio() {
            return horaInicio;
        }

        public void setHoraInicio(String horaInicio) {
            this.horaInicio = horaInicio;
        }

        public String getHoraFinal() {
            return horaFinal;
        }

        public void setHoraFinal(String horaFinal) {
            this.horaFinal = horaFinal;
        }

	public HorarioProfesor(String d, String hI, String hF) {
		this.dia = d;
                this.horaFinal = hF;
                this.horaInicio = hI;
	}

}
