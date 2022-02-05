package lab3p2_franklin_david_11741435_22141023;

import java.util.ArrayList;

public class MotoTaxi {
int capacidad=2;
ArrayList<Alumno>alumno=new ArrayList(capacidad);

    public MotoTaxi() {
    }

    public MotoTaxi(ArrayList alumno) {
        this.alumno=alumno;
    }
    
    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    @Override
    public String toString() {
        return "MotoTaxi" + "capacidad= " + capacidad ;
    }

}
