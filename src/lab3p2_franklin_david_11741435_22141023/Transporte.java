package lab3p2_franklin_david_11741435_22141023;

import java.util.ArrayList;

public class Transporte {
String placa;
String color;
String transportista;
ArrayList<Estacion> rutas;
ArrayList tipo;

    public Transporte() {
    }

    public Transporte(String placa, String color, String transportista, ArrayList<Estacion> rutas, ArrayList tipo) {
        this.placa = placa;
        this.color = color;
        this.transportista = transportista;
        this.rutas = rutas;
        this.tipo = tipo;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getTransportista() {
        return transportista;
    }

    public void setTransportista(String transportista) {
        this.transportista = transportista;
    }

    public ArrayList<Estacion> getRutas() {
        return rutas;
    }

    public void setRutas(ArrayList<Estacion> rutas) {
        this.rutas = rutas;
    }

    public ArrayList getTipo() {
        return tipo;
    }

    public void setTipo(ArrayList tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Transporte " + "placa= " + placa + ", color= " + color + ", transportista= " + transportista + ", rutas= " + rutas + ", tipo= " + tipo ;
    }


}
