public class Ejercicio_5 {
    public static void main(String[] args) {
    
        //Creamos una instancia de 3 alumnos 
    Alumno Felipe;
    Alumno Anastacia;
    Alumno Roberto;

        Felipe = new Alumno();
        /*Felipe.name = "Felipe";
        Felipe.lastName = "Gutierrez";
        Felipe.subjects = "Mates, Lengua";*/
        System.out.println(Felipe.toString());
        
        Anastacia = new Alumno();
        /*Anastacia.name = "Anastacia";
        Anastacia.lastName = "Riculina";
        Anastacia.subjects = "Psicologia, Agrupación social";*/
        System.out.println(Anastacia.toString());

        Roberto = new Alumno();
        /*Roberto.name = "Roberto";
        Roberto.lastName = "Makovich";
        Roberto.subjects = "Física nuclear, política";*/
        System.out.println(Roberto.toString());
        
    }
}
//CONSTRUCTOR
public Alumno (String name, String lastName, int subject){
    this.name = "Felipe";
    this.lastName = "Gutierrez";
    this.subject= "Mates, Lengua";
}
//this: para referirnos a las propiedades de una clase
//constructor:

/*public void setName (String name){
    this.name = name;
}
public void getName (){
    this.name = name;
} */

//Creamos la clase
class Alumno {
    String name;
    String lastName; 
    String subjects;

    public String toString(){
        String result = "El alumno: " + this.name
                + ", con apellido: " + this.lastName
                + ", esta cursando: " + this.subjects;
            return result;
    }
}