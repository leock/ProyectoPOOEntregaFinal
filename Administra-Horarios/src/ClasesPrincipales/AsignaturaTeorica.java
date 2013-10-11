package ClasesPrincipales;

import java.io.*;
import java.util.*;

public class AsignaturaTeorica extends Asignatura {

	private String pagina;

        public String getPagina() {
            return pagina;
        }

        public void setPagina(String pagina) {
            this.pagina = pagina;
        }
        
	public AsignaturaTeorica(String p, String nom, int num, int hD, String cC) {
            super(nom, num, hD, cC);
            this.pagina = p;
	}

    @Override
    public String toString() {
        String informacion = super.getNombre();
        informacion += "    " + super.getCategoriaCurso();
        informacion += "    " + super.getHorasDedicadas();
        informacion += "    " + super.getNumeroCreditos();
        return informacion;
    }

    public String[] toArrayString() {
        String informacion[] = {
            super.getNombre(),super.getCategoriaCurso(),
            String.valueOf(super.getHorasDedicadas()),String.valueOf(super.getNumeroCreditos())
        };
        return informacion;
    }  

    @Override
    public String obtenerTipoAsignatura(int p) {
        return "Teorica";
    }
}
