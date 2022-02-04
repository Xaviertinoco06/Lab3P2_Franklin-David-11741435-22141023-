package lab3p2_franklin_david_11741435_22141023;

import java.util.ArrayList;

public class Rapidito {
int sillas;
ArrayList<Alumno> alummnos;

    public Rapidito() {
    }

    public Rapidito(int sillas, ArrayList<Alumno> alummnos) {
        this.sillas = sillas;
        this.alummnos = alummnos;
    }

    public int getSillas() {
        return sillas;
    }

    public void setSillas(int sillas) {
        this.sillas = sillas;
    }

    public ArrayList<Alumno> getAlummnos() {
        return alummnos;
    }

    public void setAlummnos(ArrayList<Alumno> alummnos) {
        this.alummnos = alummnos;
    }

    @Override
    public String toString() {
        return "Rapidito " + "sillas= " + sillas + ", alummnos= " + alummnos ;
    }
    
}
