import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.io.*;
import java.util.*;

    public class GestorArchivo {


        public void crearDirectorio() {

            Path directorio = Paths.get("C:\\Planner");

            if (Files.exists(directorio)) {
                System.out.println("El directorio ya existe");
            } else {
                try {
                    Files.createDirectories(directorio);
                    System.out.println("El directorio fue creado");
                } catch (IOException e) {
                    System.out.println("El directorio no pudo ser creado");
                }
            }
        }

        public void crearArchivo(String donde, String mensaje ) {
            Path archivo = Paths.get("C:\\Planner\\"+donde+".txt");
            System.out.println("Ingrese el texto a guardar en el archivo");
            String texto = mensaje;
            try {
                Files.write(archivo, texto.getBytes());
                System.out.println("Se ha guardado el archivo");
            } catch (IOException e) {
                System.out.println("El archivo no pude ser guardado");
            }
        }

        public String leerArchivo(String donde) {
            Path archivo = Paths.get("C:\\Planner\\"+donde+".txt");
            String texto = "";
            try {
                texto = new String(Files.readAllBytes(archivo));
                System.out.println("El contenido del archivo es:\n" + texto);
            } catch (IOException e) {
                System.out.println("El archivo no pudo ser leido");
            }
            return texto;
        }


        public void eliminarArchivos(String donde) {
            Path archivo = Paths.get("C:\\Planner\\"+donde+".txt");

            try {
                Files.deleteIfExists(archivo);
                System.out.println("El archivo fue eliminado exitosamente");
            } catch (IOException e) {
                System.out.println("El archivo no  pudo ser eliminado");
            }
        }

        public static void GuardarArchivo(String donde, Vector lineas){
            try
            {

                FileWriter fichero = new FileWriter("C:\\Planner\\"+donde+".txt");
                PrintWriter escribe = new PrintWriter(fichero);
                for(int i=0;i<lineas.size();i++){
                    escribe.println(lineas.elementAt(i));
                }
                fichero.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }


        public static Vector BorrarLinea(int numero, String donde){
            Vector lineas=new Vector();

            try {

                File archivo = new File ("C:\\Planner\\"+donde+".txt");
                FileReader fr = new FileReader (archivo);
                BufferedReader  br = new BufferedReader(fr);
                String linea; int cont=0;
                String completo="";
                while((linea=br.readLine())!=null){
                    cont++;
                    if(cont!=numero){
                        lineas.addElement(linea);//AGREGAR LINEASS A UN VECTOR
                    }
                }
                br.close();
                fr.close();
            } catch (Exception e) {
                System.out.println(e);
            }
            return lineas;
        }

       public int ContarLineas(String donde) {
            int contadorL=0;

            File fichero = new File("C:\\Planner\\"+donde+".txt");
            try {
                BufferedReader fich = new BufferedReader(new FileReader("C:\\Planner\\"+donde+".txt"));
                String linea;
                try {
                    while ((linea = fich.readLine()) != null) {
                        contadorL++;
                    }
                    System.out.println("El número de líneas :" + contadorL);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
            return contadorL;
        }
    }








