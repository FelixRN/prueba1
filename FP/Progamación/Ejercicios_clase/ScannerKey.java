package Ejercicios_clase;
//Uso de Scanner
//Para escribir en la terminal "Ctrl + ," y luego buscar "code runner run in terminal"

import java.util.Scanner;

public class ScannerKey {
	public static void main(String[] args) {
        
        int calor = 41;
        int frio = 2;
        Scanner input = new Scanner(System.in); //Se crea el lector para leer la entrada del usuario
        
        // Solicitar al usuario que ingrese la temperatura
        System.out.println("Por favor ingrese la temperatura actual");
        
        int temperatura = input.nextInt(); // Leer la temperatura ingresada

        if ( temperatura > calor ){
			System.out.printf("Hace mucho calor, me voy a la ducha");
        }
            else if (temperatura < frio){
                System.out.printf("Hace mucho frío, me quedo en la cama");
            }
            else {
                    System.out.printf("Hace buen tiempo, voy a salir");
                }
                // Cerrar el scanner para evitar fugas de recursos
                input.close();
    }
}