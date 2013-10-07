package ClasesPrincipales;

import java.io.*;
import java.util.*;

public class AulaTeorica extends Aula {

	private boolean aireAcondicionado;
	private boolean equipoMultimedia;

        public boolean isAireAcondicionado() {
            return aireAcondicionado;
        }

        public void setAireAcondicionado(boolean aireAcondicionado) {
            this.aireAcondicionado = aireAcondicionado;
        }

        public boolean isEquipoMultimedia() {
            return equipoMultimedia;
        }

        public void setEquipoMultimedia(boolean equipoMultimedia) {
            this.equipoMultimedia = equipoMultimedia;
        }

	public AulaTeorica(boolean aA, boolean eM, int num, String nom, String u, int c) {
		super(num, nom, u, c);
                this.aireAcondicionado = aA;
                this.equipoMultimedia = eM;
	}

}
