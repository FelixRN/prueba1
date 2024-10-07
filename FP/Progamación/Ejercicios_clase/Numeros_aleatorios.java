package Ejercicios_clase;
public class Numeros_aleatorios {
        public static void main(String[] args) {
            // Generar un número aleatorio entre 0 y 43
            int temperatura = (int)(Math.random() * 44); // Math.random() genera un número entre 0.0 y 1.0, lo multiplicamos por 44 para obtener entre 0 y 43
            
            // Mostrar la temperatura generada
            System.out.println("La temperatura generada es: " + temperatura);
            
            // Verificar la temperatura y mostrar el mensaje correspondiente
            if (temperatura > 30) {
                System.out.println("Hace mucho calor, me voy a la ducha.");
            } else if (temperatura < 14) {
                System.out.println("Hace mucho frío, me quedo en la cama.");
            } else {
                System.out.println("Hace buen tiempo, voy a salir.");
            }
        }
    }
