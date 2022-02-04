package lab3p2_franklin_david_11741435_22141023;

import java.util.ArrayList;
import java.util.Date;

public class Alumno extends Persona{
    int estudentid;
    ArrayList <Clase> clases;

    public Alumno(int estudentid, ArrayList<Clase> clases, String nombre, int id, Date fecha) {
        super(nombre, id, fecha);
        this.estudentid = estudentid;
        this.clases = clases;
    }

    public Alumno() {
    }

    public int getEstudentid() {
        return estudentid;
    }

    public void setEstudentid(int estudentid) {
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
