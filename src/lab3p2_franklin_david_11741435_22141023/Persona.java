package lab3p2_franklin_david_11741435_22141023;

import java.util.Date;

public class Persona {
String nombre;
int id;
Date fecha;

    public Persona() {
    }

    public Persona(String nombre, int id, Date fecha) {
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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    @Override
    public String toString() {
        return "nombre= " + nombre + ", id= " + id + ", fecha= " + fecha ;
    }
    
}
