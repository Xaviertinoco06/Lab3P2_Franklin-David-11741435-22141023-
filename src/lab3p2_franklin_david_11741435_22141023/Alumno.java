package lab3p2_franklin_david_11741435_22141023;

import java.util.ArrayList;
import java.util.Date;

public class Alumno extends Persona{
    long estudentid;
    ArrayList <Clase> clases;

    public Alumno(long estudentid, ArrayList<Clase> clases, String nombre, long id, String fecha) {
        super(nombre, id, fecha);
        this.estudentid = estudentid;
        this.clases = clases;
    }

    public Alumno() {
    }

    public long getEstudentid() {
        return estudentid;
    }

    public void setEstudentid(long estudentid) {
        this.estudentid = estudentid;
    }

    public ArrayList<Clase> getClases() {
        return clases;
    }

    public void setClases(ArrayList<Clase> clases) {
        this.clases = clases;
    }

    @Override
    public String toString() {
        return "Alumno " + "estudiante identidad= " + estudentid + ", clases= " + clases ;
    }
    
    
}
