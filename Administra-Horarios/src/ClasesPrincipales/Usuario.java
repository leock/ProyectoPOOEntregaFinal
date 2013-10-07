package ClasesPrincipales;

import java.io.*;
import java.util.*;

public class Usuario {

	private String usuario;
	private String clave;
	private String tipo;

        public String getUsuario() {
            return usuario;
        }

        public void setUsuario(String usuario) {
            this.usuario = usuario;
        }

        public String getClave() {
            return clave;
        }

        public void setClave(String clave) {
            this.clave = clave;
        }

        public String getTipo() {
            return tipo;
        }

        public void setTipo(String tipo) {
            this.tipo = tipo;
        }

	public Usuario(String u, String c, String t) {
		this.clave = c;
                this.tipo = t;
                this.usuario = u;
	}

}
