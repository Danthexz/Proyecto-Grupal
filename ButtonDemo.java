/*
import java.io.*;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
import java.util.Scanner;

public class ButtonDemo {
        public static void main(String[] args) {
            GestorArchivo gestorArchivo = new GestorArchivo();
           // gestorArchivo.crearDirectorio();
            /*gestorArchivo.leerArchivo("Metas");
            gestorArchivo.eliminarArchivos("Metas");
            gestorArchivo.eliminarLinea("Metas","2");

        }
        */
import java.io.*;
import java.util.*;
    public class ButtonDemo{
       // private static File archivo = null;
        // private static FileWriter fichero =null;
       // private static FileReader fr = null;
       // private static BufferedReader br = null;
        //private static PrintWriter escrive =null;
        //private static Vector lineas=new Vector();

        public static void main(String []args){
            GestorArchivo gestorArchivo= new GestorArchivo();
            gestorArchivo.ContarLineas("Metas");
            gestorArchivo.GuardarArchivo("Metas",gestorArchivo.BorrarLinea(26,"Metas"));
            gestorArchivo.ContarLineas("Metas");

    }}



