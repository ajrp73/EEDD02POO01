import java.util.Objects;

public class Alumno { //Los identificadores (nombres) de las clases comienzan por MAY y van en singular
    private String DNI;  //Atributos de instancia: son aquellos atributos de los que cada objeto va a tener un valor
    private int NP;
    private String nombreCompleto;

    public Alumno(){ //Método constructor por defecto
                     //Si no se indica nada, se asignan valores por defecto
        DNI="00.000.000-E";
        NP=0;
        nombreCompleto="Nombre Apellido1 Apellido2";
    }

    public Alumno(String DNIp, int NPp, String nc ){
        char primerDigito= DNIp.charAt(0);
        if ( !Character.isDigit(primerDigito)){
            throw new IllegalArgumentException("DNI incorrecto");
        }
        if (NPp<0){
            throw new IllegalArgumentException("NP incorrecto");
        }
        DNI= DNIp;
        NP= NPp;
        nombreCompleto= nc;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        char primerDigito= DNI.charAt(0);
        if ( !Character.isDigit(primerDigito)){
            throw new IllegalArgumentException("DNI incorrecto");
        }
        this.DNI = DNI;
    }

    public int getNP() {
        return NP;
    }

    public void setNP(int NP) {
        if (NP<0){
            throw new IllegalArgumentException("NP incorrecto");
        }
      this.NP = NP;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || this.getClass() != o.getClass()) return false;
        Alumno alumno = (Alumno) o;
        //return this.NP == alumno.NP ; //mejor utilizar los métodos definidos
        return this.getNP() == alumno.getNP() ;
    }

    @Override
    public int hashCode() {
        return Objects.hash(DNI);
    }

    @Override
    public String toString() {
        return "Alumno{" +
                "DNI='" + DNI + '\'' +
                ", NP=" + NP +
                ", nombreCompleto='" + nombreCompleto + '\'' +
                '}';
    }
}
