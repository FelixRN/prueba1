package examples;

public class Example01 {
    public static void main(String[] args) {
        Student Student1= new Student("Pepe", "Gonzales");
    }
}

class Student {
    private String name;
    private String lastName;

    public Student(String name, String lastName){
        this.name = name;
        this.lastName = lastName;
    }

    public Student(String fullName){
        String[] parts = fullName.DIVIDIR();
        this.name = parts[0];
        this.lastName = parts[1];

    public String toString(){

    }
}
}
