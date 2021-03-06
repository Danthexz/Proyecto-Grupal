package Clases_Dominio;
import java.util.Random;
import Manejo_Archivos.GestorArchivos;

public class Misiones {

    private String nombre;
    private int prioridad;
    private String descripcion;
    private String dia;
    private GestorArchivos gestorArchivos;

    public Misiones(String nombre, int prioridad, String descripcion, String dia) {
        this.nombre = nombre;
        this.prioridad = prioridad;
        this.descripcion = descripcion;
        this.dia = dia;
        this.gestorArchivos=new GestorArchivos();
    }

    public Misiones() {
        this.gestorArchivos=new GestorArchivos();
        this.nombre = "";
        this.prioridad = 1;
        this.descripcion = "";
        this.dia = "";
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPrioridad() {
        return prioridad;
    }

    public void setPrioridad(int prioridad) {
        this.prioridad = prioridad;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getDia() {
        return dia;
    }

    public void setDia(String dia) {
        this.dia = dia;
    }
    public String crearTextoMision(){

        String texto = this.gestorArchivos.contarLineas("Mision"+this.getDia())+"| "+setearPrioridad(this.prioridad) +" Nombre: "+this.nombre+ " Descripción: "+this.descripcion;

        return texto;
    }

    public String setearPrioridad(int prioridad){
        Random random= new Random();
        int azar;
        String frase="";

        if(prioridad==1){

            String prioridad1[]={"OJO, MUY IMPORTANTE!","POR QUÉ NO HAS COMENZADO???!!!","PONTE A TRABAJAR!!","SI NO ES AHORA, CUÁNDO?!?!","TIENES MIEDO!!??","POR QUÉ AUN ME PUEDES LEER!!?!","PONTE LAS PILAS!!!"};
            azar=random.nextInt(prioridad1.length);
            frase=prioridad1[azar];
        }
        if(prioridad==2){
            String prioridad2[]={"Vamos, comienza!","Dale, tú puedes!","Esto no se resolvera solo.","El esfuerzo lo valdrá.","Trabaja duro!","Fracasar no es una opción.","El tiempo corre.","Empieza de una vez.","Despierta!","No te duermas."};
            azar=random.nextInt(prioridad2.length);
            frase=prioridad2[azar];
        }
        if(prioridad==3){
            String prioridad3[]={"Podrías hacerlo hoy?","Ve a tu ritmo.","Tomalo con calma.","Yo sé quieres.","Deberias intentarlo.","No has pensado en comenzar?","Sigo aqui..."};
            azar=random.nextInt(prioridad3.length);
            frase=prioridad3[azar];
        }
        return frase;
    }

}
