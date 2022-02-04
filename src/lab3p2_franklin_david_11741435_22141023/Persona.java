package lab3p2_franklin_david_11741435_22141023;

import java.util.Date;

public class Persona {
String nombre;
String id;
String fecha;

    public Persona() {
    }

    public Persona(String nombre, String id, String fecha) {
        this.nombre = nombre;
        this.id = id;
        this.fecha = fecha;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    @Override
    public String toString() {
        return "nombre= " + nombre + ", id= " + id + ", fecha= " + fecha ;
    }
    
}
