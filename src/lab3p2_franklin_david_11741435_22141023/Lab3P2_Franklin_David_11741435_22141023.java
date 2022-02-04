package lab3p2_franklin_david_11741435_22141023;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Lab3P2_Franklin_David_11741435_22141023 {

    static Scanner scan = new Scanner(System.in);
    static ArrayList persona = new ArrayList();
    static ArrayList clases = new ArrayList();
    static ArrayList ruta = new ArrayList();
    static ArrayList trans = new ArrayList();

    public static void main(String[] args) {

        persona.add(new Alumno(11741435, clases, "David Reyes", 1, "13/04/1999"));
        persona.add(new Alumno(11741435, clases, "Franklin Rodriguez", 2, "06/10/2004"));
        persona.add(new Transportista(5, "Don Jose", "Jose Alvarado", 3, "10/05/1980"));
        do {

            Opciones(menu());

        } while (menu() != 0);

    }

    public static int menu() {

        System.out.println("\n0. Salir\n1. Crear Clase\n2. Crear Ruta\n3. Crear Alumno\n4. Agregar Clase a Alumno\n5. Crear Transpartista\n6.Crear Trasporte\n7.Simulacion\n8.Listar Clase "
                + "\n9,Listar Rutas\n10.Listar Alumnos \n11.Listar Trasportista\n12.Listar Transportes\nIngrese una opcion: ");

        return scan.nextInt();

    }

    public static void Opciones(int opcion) {

        switch (opcion) {

            case 1:
                CrearClase();
                break;

            case 2:
                CrearRuta();
                break;

            case 3:
                CrearAlumno();
                break;

            case 4:
                agregarClase();
                break;

            case 5:
                CrearTransportista();
                break;
            case 6:
                CrearTransporte();
                break;
            case 7:

                break;
            case 8:

                break;
            case 9:

                break;
            case 10:

                break;
            case 11:

                break;
            case 12:

                break;
            case 0:
                System.exit(0);
        }
    }

    public static void CrearRuta() {

        System.out.print("Ingrese Estacion: ");

        String nombre = scan.next();

        System.out.print("Ingrese Coordenada X: ");

        int x = scan.nextInt();

        System.out.println("Inrgese Coordenada Y: ");

        int y = scan.nextInt();
        ruta.add(new Estacion(nombre, x, y));
    }

    public static void agregarClase() {
        for (Object o : clases) {
            System.out.println(clases.indexOf(o) + ". " + o);
        }
        System.out.println("Ingrese la opcion que desea elegir");
        int opcion = scan.nextInt();
        for (Object object : persona) {
            if (object instanceof Alumno) {
                System.out.println(persona.indexOf(object) + ". " + object);
            }
        }
        System.out.println("Ingrese al alumno que desea agregarle la clase");
        int al = scan.nextInt();

    }

    public static void CrearTransporte() {

        System.out.print("Ingrese numero de placa: ");

        String placa = scan.next();
        for (int i = 0; i < trans.size(); i++) {
            for (Object t : trans) {
                if (t instanceof Transporte) {
                    if (placa.equals(((Transporte) t).getPlaca())) {
                        System.out.println("Placa ocupada");
                        System.out.print("Ingrese numero de placa: ");
                        placa = scan.next();
                        break;
                    }
                }
            }
        }

        System.out.print("Ingrese su color del vehiculo: ");

        String color = scan.next();

        System.out.print("Ingrese Transportista: ");

        String transportista = scan.next();

        trans.add(new Transporte(placa, color, transportista, ruta));
    }

    public static void CrearTransportista() {

        System.out.print("Ingrese cantidad de Tiempo en experiencia: ");

        int timexp = scan.nextInt();

        System.out.print("Ingrese su Apodo: ");

        String apodo = scan.next();
        System.out.println("Ingrese el nombre");
        String name = scan.next();
        System.out.println("Ingrese el id");
        Long id = scan.nextLong();
        for (int i = 0; i < persona.size(); i++) {
            for (Object object : persona) {
                if (object instanceof Persona) {
                    if (id == ((Persona) object).id) {
                        System.out.println("Id Ocupada");
                        System.out.println("Ingrese el id");
                        id = scan.nextLong();
                        break;
                    }
                }
            }
        }
        System.out.println("Ingrese la fecha de nacimiento dd/mm/yyyy: ");
        String fecha = scan.next();
        persona.add(new Transportista(timexp, apodo, name, id, fecha));
    }

    public static void CrearClases() {

        System.out.print("Nombre de las clase ");

        String Name = scan.next();

        System.out.print("Ingrese codigo de la clase: ");

        long codigo = scan.nextLong();

        for (int i = 0; i < clases.size(); i++) {
            for (Object object : clases) {
                if (object instanceof Persona) {
                    if (codigo == ((Clase) object).codigo) {
                        System.out.println("Codigo Ocupado");
                        System.out.println("Ingrese el codigo");
                        codigo = scan.nextLong();
                        break;
                    }
                }
            }
        }
        clases.add(new Clase(codigo, Name));
    }

    public static void CrearAlumno() {
        System.out.println("Ingrese su nombre de alumno ");

        String nombreaalumno = scan.next();

        System.out.println("Ingrese su id de estudiante ");

        Long ids = scan.nextLong();
        for (int i = 0; i < persona.size(); i++) {
            for (Object object : persona) {
                if (object instanceof Persona) {
                    if (ids== ((Persona) object).id) {
                        System.out.println("id Ocupado");
                        System.out.println("Ingrese el id de estudiante ");
                        ids = scan.nextLong();
                        break;
                    }
                }
            }
        }
        System.out.println("Ingrese el nombre");
        String name = scan.next();
        System.out.println("Ingrese el id");
        Long id = scan.nextLong();
        for (int i = 0; i < persona.size(); i++) {
            for (Object object : persona) {
                if (object instanceof Persona) {
                    if (id == ((Persona) object).id) {
                        System.out.println("Id Ocupada");
                        System.out.println("Ingrese el id");
                        id = scan.nextLong();
                        break;
                    }
                }
            }
        }
        System.out.println("Ingrese la fecha de nacimiento dd/mm/yyyy: ");
        String fecha = scan.next();
        persona.add(new Alumno(ids,clases, name, id, fecha));
    }
    public static void CrearClase(){
        
    }

}
