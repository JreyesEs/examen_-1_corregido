/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package examen_.pkg1_corregido;
import java.util.Scanner;

/**
 *
 * @author Javier Reyes
 */
public class Examen_1_corregido {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String historial = "";
        int opcion;
            
        do {
            System.out.println("");
            System.out.println("Menu del primer examen de programacion: ");
            System.out.println("1. Ejercicios String");
            System.out.println("2. Respuestas a preguntas");
            System.out.println("3. Mostrar historial del menú");
            System.out.println("4. Salir");
            System.out.print("Escoja su opcion: ");
            opcion = entrada.nextInt();
                   
            switch (opcion) {
            
                case 1:
                    historial += "Ejercicios String - ";
                    ejerciciosString(entrada);
                    break;
                    
                case 2:
                    historial += "Respuestas a preguntas - ";
                    respuestasPreguntas();
                    break;
                    
                case 3:
                    System.out.println("Historial del menu: " + historial);
                    break;
                    
                case 4:
                    System.out.println("Fin del programa...");
                    break;
                    
                default:
                    System.out.println("Opción no valida. escoja una opcion nuevamente 1 y 4.");       
            }
        } while (opcion != 4);   
    }
        
    public static void ejerciciosString(Scanner scanner) {
        System.out.println("Ingrese una cadena (de al menos 3 caracteres):");
        scanner.nextLine(); 
        String cadena = scanner.nextLine();

        if (cadena.length() < 3) {
            System.out.println("La cadena debe tener al menos 3 caracteres.");
            return;
        }

        if (cadena.length() % 2 != 0) { // Tamaño impar
            System.out.println("Ingrese una nueva cadena:");
            String nuevaCadena = scanner.nextLine();
            String cadenaResultante = cadena.substring(0, cadena.length() / 2) +
                    nuevaCadena +
                    cadena.substring(cadena.length() / 2);
            System.out.println("Cadena resultante: " + cadenaResultante);
            System.out.println("Tamaño de la nueva cadena: " + cadenaResultante.length());
        } else { // Tamaño par
            String primeraMitad = cadena.substring(0, cadena.length() / 2);
            String segundaMitad = cadena.substring(cadena.length() / 2);
            String cadenaResultante = "";
            for (int i = 0; i < primeraMitad.length(); i++) {
                cadenaResultante += primeraMitad.charAt(i);
                if (i != primeraMitad.length() - 1) {
                    cadenaResultante += "-";
                }
            }
            cadenaResultante += "/";
            for (int i = 0; i < segundaMitad.length(); i++) {
                cadenaResultante += segundaMitad.charAt(i);
                if (i != segundaMitad.length() - 1) {
                    cadenaResultante += "/";
                }
            }
            System.out.println("Cadena resultante: " + cadenaResultante);
        }
        System.out.println("");
    }
        
    public static void respuestasPreguntas() {
        System.out.println("a. El if se utiliza para tomar decisiones en condiciones booleanas,");
        System.out.println("mientras que el switch case se utiliza para seleccionar una de ");
        System.out.println("multiples opciones basadas en un valor dado.");
        System.out.println("");
        System.out.println("b.El substring() se utiliza para extraer una subcadena de una cadena dada,");
        System.out.println("equalsIgnoreCase() se utiliza para comparar dos cadenas ignorando las diferencias de mayúsculas y minúsculas,");
        System.out.println("y equals() se utiliza para comparar dos cadenas teniendo en cuenta las diferencias de mayúsculas y minúsculas.");
        System.out.println("");
        System.out.println("c. La concatenación se refiere a la operación de unir dos o más cadenas para formar una nueva cadena más larga.");
        System.out.println("");
    }
    
    
}
