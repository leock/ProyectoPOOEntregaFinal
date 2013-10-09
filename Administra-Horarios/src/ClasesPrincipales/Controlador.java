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
    //lista con los grupos que tienen choque de horarios
    private LinkedList<Grupo> listaGruposChoques = new LinkedList<>();
    
    /*--------------------------- variables ----------------------------*/
    
    //Nombre de usuario logueado
    public static String usuarioActual = "";
    //Tipo de usuario logueado
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
    
    /**
     * Insertar la cantidad de semestres
     * @param cs cantidad total de semestres
     */
    public void insertarCantidadSemestres( int cs){
        //inserta los semestres
        for (int i = 0; i < cs; i++){
            Semestre ns = new Semestre(i);
            listaSemestres.add(ns);
        }
        insertarCursosSemestre();
    }
    
    /**
     * Busca un semestre por su nombre
     * @param s numero que identifica el semestre
     * @return posicion del semestre en la lista
     */
    private int buscarSemestre(int s){
        for (int i = 0, l = listaSemestres.size(); i < l; i++){
            if (listaSemestres.get(i).getNumero() == s){
                return i;
            }
        }
        return -1;
    }
    
    /*
     * Se insertan los datos en el sistema
     */
    public void insertarCursosSemestre(){
        AsignaturaPractica as1 = new AsignaturaPractica("apollo", "windows", "Fundamentos",
                4, 12, "computacion");
        listaSemestres.get(buscarSemestre(1)).agregarAsignatura(as1);
        Profesor p1 = new Profesor("Oscar", "2-2222-2222", "Computacion", "oviquez", "123");
        HorarioGrupo h1 = new HorarioGrupo("Lunes", "7:00", "11:30");
        Grupo g1 = new Grupo("G50", as1, p1, h1);
        listagrupo.add(g1);
        
        AsignaturaPractica as2 = new AsignaturaPractica("apollo", "windows", "Intro",
                4, 12, "computacion");
        listaSemestres.get(buscarSemestre(1)).agregarAsignatura(as2);
        HorarioGrupo h2 = new HorarioGrupo("Martes", "7:00", "11:30");
        Grupo g2 = new Grupo("G50", as2, p1, h2);
        listagrupo.add(g2);
        
        
        AsignaturaPractica as3 = new AsignaturaPractica("apollo", "windows", "Taller",
                4, 12, "computacion");
        listaSemestres.get(buscarSemestre(1)).agregarAsignatura(as3);
        HorarioGrupo h3 = new HorarioGrupo("Miercoles", "7:00", "11:30");
        Grupo g3 = new Grupo("G50", as3, p1, h3);
        listagrupo.add(g3);
        
        
        AsignaturaPractica as4 = new AsignaturaPractica("apollo", "windows", "Comunicacion",
                2, 6, "ciencias");
        listaSemestres.get(buscarSemestre(1)).agregarAsignatura(as4);
        HorarioGrupo h4 = new HorarioGrupo("Lunes", "7:00", "11:30");
        Grupo g4 = new Grupo("G50", as4, p1, h4);
        listagrupo.add(g4);
        
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
    
    /**
     * Busca los cursos de un semestre determinado
     * @param s semestre a buscar
     * @return arreglo con la informacion del semestre
     */
    public String[] obtenerCursosSemestreX(int s){
        Semestre semestre = listaSemestres.get(buscarSemestre(s));
        LinkedList<Asignatura> asignaturas = semestre.getAsignaturas();
        String cursos[] = new String[asignaturas.size()];
        for (int i = 0, l = cursos.length; i < l; i++){
            cursos[i] = asignaturas.get(i).toString();
        }
        return cursos;
    }
    
    /**
     * Obtiene en una matriz, la informacion de cada uno de los cursos 
     * pertenecientes al semestre seleccionado
     * @param s numero del semestre
     * @return Una matriz con la informacion de todos los cursos pertenecientes 
     * a un semestre
     */
    public String[][] obtenerArrayCursosSemestreX(int s){
        Semestre semestre = listaSemestres.get(buscarSemestre(s));
        LinkedList<Asignatura> asignaturas = semestre.getAsignaturas();
        String cursos[][] = new String[asignaturas.size()][4];
        for (int i = 0, l = cursos.length; i < l; i++){
            cursos[i] = asignaturas.get(i).toArrayString();
        }
        return cursos;
    }
    
    /**
     * Obtiene en una matriz el horario de los cursos de un semestre
     * @param s numero de semestre
     * @return Una matriz con el horario generado para un semestre determinado
     */
    public String[][] obtenerArrayHorario(int s){
        listaGruposChoques = new LinkedList<>();
        Semestre semestre = listaSemestres.get(buscarSemestre(s));
        LinkedList<Asignatura> asignaturas = semestre.getAsignaturas();
        String horario[][] = {  {"7:00-7:50","","","","",""},
                                {"7:55-8:45","","","","",""},
                                {"8:50-9:40","","","","",""},
                                {"9:45-10:35","","","","",""},
                                {"10:40-11:30","","","","",""},
                                {"12:30-1:20","","","","",""},
                                {"1:25-2:15","","","","",""},
                                {"2:20-3:10","","","","",""},
                                {"3:15-4:05","","","","",""}};
        
        for (int i = 0, l = asignaturas.size(); i < l; i++){
            Grupo grupo = obtenerGrupo(asignaturas.get(i).getNombre());
            int c = calcularColumna(grupo.getHorario().getDia());
            int hI = calcularFila(grupo.getHorario().getHoraInicio());
            int hF = calcularFila(grupo.getHorario().getHoraFinal());
            if (validarDisponibilidadHora(horario, c, hI, hF)){
                for (; hI <= hF; hI++){
                    System.out.println(grupo.getAsignaturo().getNombre()+"->"+hI+" "+hF);
                    horario[hI][c] = grupo.getAsignaturo().getNombre();
                }
            }else{
                System.out.println("choque");
                listaGruposChoques.add(grupo);
            }
        }
        return horario;
    }
    
    /**
     * Busca un grupo en la lista de grupos
     * @param n nombre de la asignatura del grupo
     * @return el grupo encontrado
     */
    private Grupo obtenerGrupo(String n){
        Grupo g = null;
        for (int i = 0, l = listagrupo.size(); i < l; i++){
            if (listagrupo.get(i).getAsignaturo().getNombre().equals(n)){
                return listagrupo.get(i);
            }
        }
        return g;
    }
    
    /**
     * Calcula la columna en la matriz de horarios con base en el dia de la semana
     * @param d dia de la semana a calcular
     * @return El numero de la columna que representa el dia de la semana
     */
    private int calcularColumna(String d){
        int c = 0;
        if (d.equals("Lunes")){
            c = 1;
        }else if (d.equals("Martes")){
            c = 2;
        }else if (d.equals("Miercoles")){
            c = 3;
        }else if (d.equals("Jueves")){
            c = 4;
        }else if (d.equals("Viernes")){
            c = 5;
        }else{
            System.out.println("estas mamando");
        }
        return c;
    }
    
    /**
     * Valida la disponibilidad de horario para asignar un curso
     * @param h Matriz de horario
     * @param c Numero de la columna que representa el dia de la semana
     * @param hI Numero de la fila que representa la hora de iniio del curso
     * @param hF Numero de la fila que representa la hora de finalizacion del curso
     * @return True en caso de estar disponible el horario consultado, y false
     * en caso de estar asignado ese horario a otro curso
     */
    private boolean validarDisponibilidadHora(String[][] h, int c, int hI, int hF){
        boolean resultado = true;
        for (; hI <= hF; hI++){
            if (!h[hI][c].equals("")){
                //System.out.println(h[hI][c]);
                resultado = false;
            }
        }
        return resultado;
    }
    
    /**
     * Calcula la fila que representa la hora de inicio o de final de un curso en 
     * la matriz de horario
     * @param hI Hora a calcular la posicion
     * @return retorna la fila que representa la hora correspondiente en la matriz
     * del horario
     */
    private int calcularFila(String hI){
        int inicio = 0;
        if (hI.equals("7:00") || hI.equals("7:50")){
            inicio = 0;
        }else if (hI.equals("7:55") || hI.equals("8:45")){
            inicio = 1;
        }else if (hI.equals("8:50") || hI.equals("9:40")){
            inicio = 2;
        }else if (hI.equals("9:45") || hI.equals("10:35")){
            inicio = 3;
        }else if (hI.equals("10:40") || hI.equals("11:30")){
            inicio = 4;
        }else if (hI.equals("12:30") || hI.equals("1:20")){
            inicio = 5;
        }else if (hI.equals("1:25") || hI.equals("2:15")){
            inicio = 6;
        }else if (hI.equals("2:20") || hI.equals("3:10")){
            inicio = 7;
        }else if (hI.equals("3:15") || hI.equals("4:05")){
            inicio = 8;
        }
        System.out.println(hI);
        return inicio;
    }
    
    /**
     * Obtiene la informacion de los cursos que no fueron asignados por causa de
     * choque de horarios
     * @return Matriz con la informacion de todos los cursos a los que no se les
     * pudo asignar en el horario
     */
    public String[][] obtenerArrayChoqueHorarios(){
        String cursos[][] = new String[listaGruposChoques.size()][4];
        for (int i = 0, l = listaGruposChoques.size(); i < l; i++){
            cursos[i] = listaGruposChoques.get(i).toArrayString();
        }
        return cursos;
    }
}
