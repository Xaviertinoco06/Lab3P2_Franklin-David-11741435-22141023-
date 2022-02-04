package lab3p2_franklin_david_11741435_22141023;

public class Taxi {
int capacidad;
int id;

    public Taxi() {
    }

    public Taxi(int capacidad, int id) {
        this.capacidad = capacidad;
        this.id = id;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Taxi " + "capacidad= " + capacidad + ", id= " + id ;
    }

}
