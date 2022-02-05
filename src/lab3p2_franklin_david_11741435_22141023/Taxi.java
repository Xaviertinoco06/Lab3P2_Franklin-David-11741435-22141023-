package lab3p2_franklin_david_11741435_22141023;

import java.util.ArrayList;

public class Taxi {

    int capacidad;
    ArrayList<Alumno> alumnos = new ArrayList(capacidad);
    String id;

    public Taxi() {
    }

    public Taxi(ArrayList alumnos, String id) {
        this.alumnos = alumnos;
        this.id = id;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Taxi " + "capacidad= " + capacidad + ", id= " + id;
    }

}
