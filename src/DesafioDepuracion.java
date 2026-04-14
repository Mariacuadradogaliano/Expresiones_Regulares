/**
 * Clase que representa la depuracion de un array, con esta clase se pueden realizar diferentes operaciones en el array introducido
 *  @author Maria
 *  
 */
import java.util.Scanner;

public class DesafioDepuracion {
/**
 *  Método que calcula el promedio de los números en un arreglo
 * @param numeros
 * @return suma 
 */
    public static double calcularPromedio(int[] numeros) {
        int suma = 0;
        for (int i = 0; i < numeros.length; i++) {  // Error: el bucle tiene un acceso fuera de los límites del arreglo
            suma += numeros[i];  // Error: posible excepción aquí si el bucle accede fuera de los límites
        }
        return suma / (double) numeros.length;  // Error: división de enteros puede no ser precisa, debería ser "suma / (double) numeros.length"
    }
    /**
     * Método que busca un número en el arreglo y devuelve su posición
     * @param numeros
     * @param objetivo
     * @return posicion del numero 
     */
    
    public static int buscarNumero(int[] numeros, int objetivo) {
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] == objetivo) {
                return i;  // Error: Si no encuentra el número, el método no devuelve nada (debe devolver -1)
            }
        }
        return -1;
    }
  /**
   * Método que invierte una cadena (al revés)
   * @param cadena
   * @return cadena invertida
   */
    public static String invertirCadena(String cadena) {
        String invertida = "";
        for (int i = 0; i <= cadena.length(); i++) {  // Error: Bucle fuera de los límites (i <= cadena.length() en lugar de i < cadena.length())
            invertida += cadena.charAt(i);  // Error: el uso de + para concatenar strings dentro de un bucle es ineficiente
        }
        return invertida;
    }
/**
 *  Método principal para la interacción con el usuario
 * @param args
 */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        /**
         *  Parte 1: Promedio de un arreglo
         */
        System.out.print("Ingrese el tamaño del arreglo de números: ");
        int tamanioArreglo = scanner.nextInt();
        int[] numeros = new int[tamanioArreglo];

        System.out.println("Ingrese los números del arreglo:");
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = scanner.nextInt();
        }

        double promedio = calcularPromedio(numeros);
        System.out.println("El promedio de los números es: " + promedio);

		/**
		 * // Parte 2: Búsqueda de un número en el arreglo
		*/
        System.out.print("Ingrese un número para buscar en el arreglo: ");
        int objetivo = scanner.nextInt();
        int posicion = buscarNumero(numeros, objetivo);
        if (posicion != -1) {
            System.out.println("El número se encuentra en la posición: " + posicion);
        } else {
            System.out.println("El número no se encuentra en el arreglo.");
        }

        
        scanner.nextLine();  // Limpiar el buffer de entrada
        System.out.print("Ingrese una cadena para invertir: ");
        String cadena = scanner.nextLine();
        String cadenaInvertida = invertirCadena(cadena);
        System.out.println("La cadena invertida es: " + cadenaInvertida);

       
        scanner.close();
        System.out.println("Fin del programa");
        
        
        
    }
}
