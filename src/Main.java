public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");
        Alumno a1= new Alumno();
        Alumno a2= new Alumno("11.111.111-A", 200111, "Asdas asdasd aadad");

        System.out.println("a1: " + a1.toString()); //"00...  0 "nombre   "
        System.out.println("a2: " + a2.toString());//"11 123 Asdas asdasd aadad"

        /* System.out.println("a1 universidad: " + a1.getUniversidad());
        Los métodos de clase como NO son métodos de instancia, no pueden ser invocados
        a partir de un objeto
         */

        //Los métodos de clase (static) pueden ser invocados a partir de la clase
        System.out.println("Universidad: " + Alumno.getUniveridad());

        Alumno a3= a2;
        System.out.println("a3: " + a3.toString());//"11 123 Asdas asdasd aadad"
        Alumno a4= new Alumno("11.111.111-A", 200111, "Asdas asdasd aadad");
        System.out.println("a4: " + a4.toString());//"11 123 Asdas asdasd aadad"

        //a2.DNI="22.222.222-L"; //No es posible modificar directamente el valor del atributo
        //a4.setDNI("A2.222.222-B"); //No es posible asignar un DNI que comience por una letra
        //a4.setNP(-3); //No es posible asignar un NP negativo
        int a=19;
        int b=a;

        if (a==b){
            System.out.println("a y b son enteros que tienen el mismo valor");
        }

        if (a1 == a2) {
            System.out.println("a1 y a2 son referencias que tienen el mismo valor");
        }else{
            System.out.println("a1 y a2 son referencias que no tienen el mismo valor");
        }

        if (a2 == a3) {
            System.out.println("a2 y a3 son referencias que tienen el mismo valor");
        }else{
            System.out.println("a2 y a3 son referencias que no tienen el mismo valor");
        }

        if (a2 == a4) {
            System.out.println("a2 y a4 son referencias que tienen el mismo valor");
        }else{
            System.out.println("a2 y a4 son referencias que no tienen el mismo valor");
        }

        if(a2.equals(a4)){
            System.out.println("a2 y a4 son objetos que se consideran iguales porque tienen el mismo DNI" );
        }else{
            System.out.println("a2 y a4 son objetos que no se consideran iguales porque no tienen el mismo DNI\" ");
        }
        if(a2.hashCode() == a4.hashCode()){
            System.out.println("a2 y a4 son objetos que tienen el mismo hashCode" );
        }else{
            System.out.println("a2 y a4 son objetos que no tienen el mismo hashCode");
        }

        if(a1.equals(a4)){
            System.out.println("a1 y a4 son objetos que se consideran iguales porque tienen el mismo DNI" );
        }else{
            System.out.println("a1 y a4 son objetos que no se consideran iguales porque no tienen el mismo DNI\" ");
        }
        if(a1.hashCode() == a4.hashCode()){
            System.out.println("a1 y a4 son objetos que tienen el mismo hashCode" );
        }else{
            System.out.println("a1 y a4 son objetos que no tienen el mismo hashCode");
        }



    }
}