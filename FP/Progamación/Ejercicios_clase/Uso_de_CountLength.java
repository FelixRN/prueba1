package Ejercicios_clase;
class Uso_de_CountLength   
{
	public static void main(String[] args) {

	    int[] count = {1, 2, 3, 4, 5};
        int tamano = count.length;
        System.out.println("El tamano es " + tamano);
        
        if (count.length > 6)
            {
            System.out.println("No mi rey");
            }
                else
                {
                System.out.println("Si mi rey"); 
                }
    }
}
