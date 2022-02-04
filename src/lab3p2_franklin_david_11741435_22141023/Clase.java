package lab3p2_franklin_david_11741435_22141023;

public class Clase {
Long codigo;
String Name;

    public Clase(Long codigo, String Name) {
        this.codigo = codigo;
        this.Name = Name;
    }

    public Long getCodigo() {
        return codigo;
    }

    public void setCodigo(Long codigo) {
        this.codigo = codigo;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    @Override
    public String toString() {
        return "Clase " + "codigo = " + codigo + ", Nombre= " + Name ;
    }

}
