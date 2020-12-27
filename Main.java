import java.util.Scanner;
import java.util.InputMismatchException;

public class Main {

        boolean estado;
        public void elegirOpcion() {
            estado = true;
            int opcion=0;
            while (estado) {
                Scanner teclado = new Scanner(System.in);
                do {
                    try {
                        System.out.println("Seleccione la operacion a realizar");
                        System.out.println("1 - ");
                        System.out.println("2 - ");
                        System.out.println("3 - ");
                        System.out.println("4 - ");
                        System.out.println("5 - ");
                        System.out.println("6 - ");
                        System.out.println("7 - Salir");
                        opcion = teclado.nextInt();
                        ejecutarOpcion(opcion);
                    }catch (InputMismatchException e) {
                        teclado.next();
                        System.out.println("Dato ingresado erroneo");
                    }
                } while (opcion < 1 || opcion > 7);
            }
        }


        public void ejecutarOpcion ( int opc){

            switch (opc) {
                case 1:
                    //opcion a hacer 1;
                    break;
                case 2:
                    //opcion a hacer 2;
                    break;
                case 3:
                    //opcion a hacer 3;
                    break;
                case 4:
                    //opcion a hacer 4;
                    break;
                case 5:
                    //opcion a hacer 5;
                    break;
                case 6:
                    //opcion a hacer 6;
                    break;
                case 7:
                    estado = false;
                    break;
                default:
                    break;

            }
        }

    }
