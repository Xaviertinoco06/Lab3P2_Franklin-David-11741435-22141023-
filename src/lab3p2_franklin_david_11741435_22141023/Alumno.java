package lab3p2_franklin_david_11741435_22141023;

import java.util.ArrayList;
import java.util.Date;

public class Alumno extends Persona{
   String estudentid;
    ArrayList <Clase> clases;

    public Alumno(String estudentid, ArrayList<Clase> clases, String nombre, String id, String fecha) {
        super(nombre, id, fecha);
        this.estudentid = estudentid;
        this.clases = clases;
    }

    public Alumno() {
    }

    public String getEstudentid() {
        return estudentid;
    }

    public void setEstudentid(String estudentid) {
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
        return "id de estudiante= " + estudentid + ", clases= " + clases ;
    }
    
    
}
