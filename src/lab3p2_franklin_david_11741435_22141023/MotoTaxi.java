package lab3p2_franklin_david_11741435_22141023;

public class MotoTaxi {
int capacidad;

    public MotoTaxi() {
    }

    public MotoTaxi(int capacidad) {
        this.capacidad = capacidad;
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
