package lab3p2_franklin_david_11741435_22141023;

import java.util.Date;

public class Transportista extends Persona {

    int timeexp;
    String apodo;

    public Transportista(int timeexp, String apodo, String nombre, int id, Date fecha) {
        super(nombre, id, fecha);
        this.timeexp = timeexp;
        this.apodo = apodo;
    }

    public Transportista() {
    }

    public int getTimeexp() {
        return timeexp;
    }

    public void setTimeexp(int timeexp) {
        this.timeexp = timeexp;
    }

    public String getApodo() {
        return apodo;
    }

    public void setApodo(String apodo) {
        this.apodo = apodo;
    }

    @Override
    public String toString() {
        return "Transportista" + "time de experiencia = " + timeexp + ", apodo = " + apodo;
    }
    
}
