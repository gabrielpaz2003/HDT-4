import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author 
 * Gabriel paz
 * Seccion 10 estructura de datos
 * Clase principal del proyecto
 */
public class Principal {
    
    /** 
     * @param args
     * @return void
     * Realiza la ejecucion del programa
     */
    public static void main(String[] args) {
        CalculadoraStack miCalculadora = new CalculadoraStack();
        StackFactory factory = new StackFactory();
        Scanner scan = new Scanner(System.in);
        System.out.println("----------------CALCULATOR SIMULATOR--------------");
        System.out.println("Porfavor ingrese la ruta de su archivo: "); //Solicita al usuario que ingrese la ruta del arcichvo
        String fileString = scan.nextLine();
        System.out.println("Porfavor seleccione un tipo de stack a utilizar \n 1. ArrayList \n 2. Vector \n 3. List \n 4. Salir");
        int opcion = scan.nextInt(); //Solicita al usuario que ingrese la opcion que desea utilizar y al mismo tiempo asigna el stack que sera utilizado
        
    while (opcion != 4) {
            
        switch (opcion) {
            case 1: //Si el usuario ingresa 1 se ejecutara el stack de ArrayList
                ArrayList<String> datos = miCalculadora.importArchivo(fileString);
                ArrayList<Integer> resultados = miCalculadora.calcular(datos,factory.getStack(opcion));
        
                for (int i = 0; i < resultados.size(); i++) {
                    System.out.println("El resultado de la operacion " + (i+1) + " es: " + resultados.get(i));
                }
                break;
            case 2: //Si el usuario ingresa 2 se ejecutara el stack de Vector
                datos = miCalculadora.importArchivo(fileString);
                resultados = miCalculadora.calcular(datos,factory.getStack(opcion));
        
                for (int i = 0; i < resultados.size(); i++) {
                    System.out.println("El resultado de la operacion " + (i+1) + " es: " + resultados.get(i));
                }
                break;
            case 3: //Si el usuario ingresa 3 se ejecutara el stack de List
                System.out.println("Porfavor seleccione el tipo de lista que utilizara \n 1. Encadenada \n 2. Doblemente encadenada ");
                int list = scan.nextInt();
                if (list == 1) { //Si el usuario ingresa 1 se ejecutara el stack de List encadenada
                    datos = miCalculadora.importArchivo(fileString);
                    resultados = miCalculadora.calcular(datos,factory.getList(list));
        
                    for (int i = 0; i < resultados.size(); i++) {
                        System.out.println("El resultado de la operacion " + (i+1) + " es: " + resultados.get(i));
                    }
                }
                if (list == 2) { //Si el usuario ingresa 2 se ejecutara el stack de List doblemente encadenada
                    datos = miCalculadora.importArchivo(fileString);
                    resultados = miCalculadora.calcular(datos,factory.getList(list));
        
                    for (int i = 0; i < resultados.size(); i++) {
                        System.out.println("El resultado de la operacion " + (i+1) + " es: " + resultados.get(i));
                    }
                }
                break;
            default:
                break;
        }
        System.out.println("Porfavor seleccione un tipo de stack a utilizar \n 1. ArrayList \n 2. Vector \n 3. List \n 4. Salir");
        opcion = scan.nextInt();


    }
            



            

        }
}
