package ClasesPrincipales;

import java.io.*;
import java.util.*;

public class Controlador {
    
    /*--------------------------- listas ----------------------------*/
    
    //lista que contiene todos los usuarios del sistema
    private LinkedList<Usuario> listaUsuarios = new LinkedList();
    //lista que contiene todos los semestres de la carrera
    private LinkedList<Semestre> listaSemestres = new LinkedList();
    //lista que contiene todos los profesosres registrados en el sistema
    private LinkedList<Profesor> listaProfesores = new LinkedList();
    //lista que contiene todas las aulas de tipo teoricas
    private LinkedList<AulaTeorica> listaAulasTeoricas = new LinkedList();
    //lista que contiene todas las aulas de tipo laboratorios
    private LinkedList<Laboratorio> listalaboratorio = new LinkedList();
    //lista que contiene todos los departamentos
    private LinkedList<Departamento> listaDepartamento = new LinkedList();
    //lista que contiene todas las asignaturas practicas
    private LinkedList<AsignaturaPractica> listaAsignaturaPractica = new LinkedList();
    //lista que contiene todas las asignaturas teoricas
    private LinkedList<AsignaturaTeorica> listaAsignaturaTeoricas = new LinkedList<>();
    //lista que contiene todos los grupos del sistema
    private LinkedList<Grupo> listagrupo = new LinkedList<>();
    
    /*--------------------------- variables ----------------------------*/
    
    public static String usuarioActual = "";
    public static String tipoUsuarioActual = "";
    
    /**
     * inserta usuarios en la lista de usuarios
     * @param u usuario a insertar
     */
    public void insertarUsuario(Usuario u){
        listaUsuarios.add(u);
    }
    
    /**
     * inserta semestres en la lista de semestres
     * @param s semestre a insertar
     */
    public void insertarSemestre(Semestre s){
        listaSemestres.add(s);
    }
    
    /**
     * valida que el usuario a ingresar al sistema exista y que todos los datos 
     * ingresados sean correctos
     * @param nU nombre de usuario
     * @param cU clave de usuario
     * @param tU tipo de usuario
     * @return mensaje relacionado con la busqueda del usuario
     */
    public String validarUsuario(String nU, String cU, String tU){
        
        for (int l = listaUsuarios.size(), i = 0; l > i; i++){
            if (listaUsuarios.get(i).getUsuario().equals(nU) &&
                    listaUsuarios.get(i).getClave().equals(cU)){
                if (listaUsuarios.get(i).getTipo().equals(tU)){
                    return "correcto";
                }else{
                    return "Tipo de Usuario Incorrecto";
                }
            }
        }return "no se encuentra el usuario";
    }
    
    /**
     * inserta profesores en la lista de profesores
     * @param p profesor a insertar
     */
    public void insertarProfesor(Profesor p){
        listaProfesores.add(p);
    }
    /**
     * Inserta aula teoricas en la lista de aulas teoricas
     * @param a aula a insertar
     */
    public void insertarAulaTeorica(AulaTeorica a){
        listaAulasTeoricas.add(a);
    }
    
    /**
     * Inserta laboratorios en la lista de laboratorios
     * @param l laboratorio a insertar
     */
    public void insertarLaboratorio(Laboratorio l){
        listalaboratorio.add(l);
    }
    
    /**
     * Inserta departamento en la lista de departamentos
     * @param D departamento a insertar
     */
    public void insertarDepartamento(Departamento d){
        listaDepartamento.add(d);
    }
    /**
     * Inserta Asignaturas Practicas en la lista de Asignaturas
     * @param AP asignatura práctica a insertar
     */
    public void insertarAsignaturaPractica(AsignaturaPractica ap){
      listaAsignaturaPractica.add(ap);
    }
    /**
     * Inserta Asignatura Teórica en la lista de Asignaturas
     * @param AT  asignatura teórica a insertar
     */
    public void insertarAsignaturaTeorica(AsignaturaTeorica at){
    listaAsignaturaTeoricas.add(at);
    }
    
    /**
     * Inserta un grupo en la lista de grupos
     * @param g objeto de tipo gurupo
     */
    public void insertargrupo(Grupo g){
    listagrupo.add(g);
    }
    
    public void insertarCantidadSemestres( int cs){
        //inserta los semestres
        for (int i = 0; i < cs; i++){
            Semestre ns = new Semestre(i);
            listaSemestres.add(ns);
        }
        insertarCursosSemestre();
    }
    
    private int buscarSemestre(int s){
        for (int i = 0, l = listaSemestres.size(); i < l; i++){
            if (listaSemestres.get(i).getNumero() == s){
                return i;
            }
        }
        return -1;
    }
    
    public void insertarCursosSemestre(){
        AsignaturaPractica as1 = new AsignaturaPractica("apollo", "windows", "Fundamentos",
                4, 12, "computacion");
        listaSemestres.get(buscarSemestre(1)).agregarAsignatura(as1);
        
        AsignaturaPractica as2 = new AsignaturaPractica("apollo", "windows", "Intro",
                4, 12, "computacion");
        listaSemestres.get(buscarSemestre(1)).agregarAsignatura(as2);
        
        AsignaturaPractica as3 = new AsignaturaPractica("apollo", "windows", "Taller",
                4, 12, "computacion");
        listaSemestres.get(buscarSemestre(1)).agregarAsignatura(as3);
        
        AsignaturaPractica as4 = new AsignaturaPractica("apollo", "windows", "Comunicacion",
                2, 6, "ciencias");
        listaSemestres.get(buscarSemestre(1)).agregarAsignatura(as4);
        //imprime los semestres y los cursos
        for (int i = 0, l = listaSemestres.size(); i < l; i++){
            System.out.println(listaSemestres.get(i).toString());
        }
        
    }
    
    /**
     * se encarga de meter en un arreglo los semestres
     * @return arreglo con los numeros de los semestres 
     */
    public String[] obtenerSemestres(){
        String semestres[] = new String[listaSemestres.size()];
        for (int i = 0, l = semestres.length; i < l; i++){
            semestres[i] = String.valueOf(listaSemestres.get(i).getNumero());
        }
        return semestres;
    }
    
    public String[] obtenerCursosSemestreX(int s){
        Semestre semestre = listaSemestres.get(buscarSemestre(s));
        LinkedList<Asignatura> asignaturas = semestre.getAsignaturas();
        String cursos[] = new String[asignaturas.size()];
        for (int i = 0, l = cursos.length; i < l; i++){
            cursos[i] = asignaturas.get(i).toString();
        }
        return cursos;
    }
    
    public String[][] obtenerArrayCursosSemestreX(int s){
        Semestre semestre = listaSemestres.get(buscarSemestre(s));
        LinkedList<Asignatura> asignaturas = semestre.getAsignaturas();
        String cursos[][] = new String[asignaturas.size()][4];
        for (int i = 0, l = cursos.length; i < l; i++){
            cursos[i] = asignaturas.get(i).toArrayString();
        }
        return cursos;
    }
    
}
