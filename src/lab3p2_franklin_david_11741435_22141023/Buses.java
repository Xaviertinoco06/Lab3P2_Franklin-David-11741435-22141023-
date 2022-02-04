package lab3p2_franklin_david_11741435_22141023;

import java.util.ArrayList;

public class Buses {
ArrayList<Alumno> alumnos;
int sillas;
int pie;

    public Buses(ArrayList<Alumno> alumnos, int sillas, int pie) {
        this.alumnos = alumnos;
        this.sillas = sillas;
        this.pie = pie;
    }

    public Buses() {
    }

    public ArrayList<Alumno> getAlumnos() {
        return alumnos;
    }

    public void setAlumnos(ArrayList<Alumno> alumnos) {
        this.alumnos = alumnos;
    }

    public int getSillas() {
        return sillas;
    }

    public void setSillas(int sillas) {
        this.sillas = sillas;
    }

    public int getPie() {
        return pie;
    }

    public void setPie(int pie) {
        this.pie = pie;
    }

    @Override
    public String toString() {
        return "Buses " + "alumnos= " + alumnos + ", sillas= " + sillas + ", pie= " + pie ;
    }

}
