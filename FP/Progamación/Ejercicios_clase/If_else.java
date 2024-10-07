package Ejercicios_clase;
class If_else
{
	public static void main(String[] args) {
	    int count = args.length;
	    int x = 5;
	    int y = 4;
	    int result = x + y;
		
		if (count ==1 ){
			System.out.printf("%d + %d es = %d %s \n %s",x, y, result, args[0]);
		    System.out.println("\n Tiene elementos");
		} 
		else if (count ==0) {
		    System.out.println("\n No iene elementos");
		}
		else{
		    System.out.println("\n Demasiados argumentos");
		}
	}
}