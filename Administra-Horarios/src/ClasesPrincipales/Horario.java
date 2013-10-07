package ClasesPrincipales;

import java.io.*;
import java.util.*;

public class Horario {

	private Grupo grupo;
	private Aula aula;

        public Grupo getGrupo() {
            return grupo;
        }

        public void setGrupo(Grupo grupo) {
            this.grupo = grupo;
        }

        public Aula getAula() {
            return aula;
        }

        public void setAula(Aula aula) {
            this.aula = aula;
        }

	public Horario(Grupo g, Aula a) {
		this.aula = a;
                this.grupo = g;
	}

}
