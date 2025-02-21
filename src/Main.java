public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");
        Alumno a1= new Alumno();
        Alumno a2= new Alumno("11", 123, "Asdas asdasd aadad");

        System.out.println("a1: " + a1.toString()); //"00...  0 "nombre   "
        System.out.println("a2: " + a2.toString());//"11 123 Asdas asdasd aadad"
    }
}