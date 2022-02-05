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
    static ArrayList buses = new ArrayList();
    static ArrayList taxi = new ArrayList();
    static ArrayList mototaxi = new ArrayList();
    static ArrayList rapidito = new ArrayList();
    

    public static void main(String[] args) {
        clases.add(new Clase("1302", "Español"));
        clases.add(new Clase("1239", "Algebra"));
        clases.add(new Clase("1415", "Historia"));
        clases.add(new Clase("1516","Filosofia"));
        persona.add(new Alumno("43823490",clases, "David Reyes", "901231814", "13/04/1999"));
        persona.add(new Alumno("12893741", clases, "Franklin Rodriguez", "1238914413", "06/10/2004"));
        persona.add(new Transportista(5, "Don Jose", "Jose Alvarado", "1293012412", "10/05/1980"));
        do {

            Opciones(menu());

        } while (menu() != 0);

    }

    public static int menu() {
        System.err.println("Advertencia, En caso que el listar no sirva vuelva a hacer la opcion");
        System.out.println("0. Salir\n1. Crear Clase\n2. Crear Ruta\n3. Crear Alumno\n4. Agregar Clase a Alumno\n5. Crear Transpartista\n6.Crear Trasporte\n7.Simulacion\n8.Listar Clase "
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
                agregarClaseAlumno();
                break;

            case 5:
                CrearTransportista();
                break;
            case 6:
                CrearTransporte();
                break;
            case 7:
                simulacion();
                break;
            case 8:
                listar();
                break;
            case 9:
                listarestaciones();
                break;
            case 10:
                listarAlummnos();
                break;
            case 11:
                listarTransportista();
                break;
            case 12:
                listarTransporte();
                break;
            case 0:
                System.exit(0);
        }
    }

    public static void CrearRuta() {

        System.out.print("Ingrese Estacion: ");
        scan.next();
        String nombre = scan.nextLine();

        System.out.print("Ingrese Coordenada X: ");

        int x = scan.nextInt();

        System.out.println("Inrgese Coordenada Y: ");

        int y = scan.nextInt();
        ruta.add(new Estacion(nombre, x, y));
    }

    public static void agregarClaseAlumno() {
        listarAlummnos();
        System.out.println("Ingrese la posicion del Alumno en la lista");

        int posicion1 = scan.nextInt();
        listar();
        System.out.println("Ingrese el nombre de la clase en la lista");

        String Name = scan.next();
        System.out.println("Ingrese el codigo de la clase en la lista");
        String codigo = scan.next();
        ((Alumno) persona.get(posicion1)).getClases().add(new Clase(codigo, Name));
        System.out.println("Clase ingresada correctamente");

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
        System.out.println("Ingrese el tipo de transporte 1.Buses\n2.Rapidito\n3.Taxi\n4.Mototaxi");
        int opcion = scan.nextInt();
        switch (opcion) {
            case 1:
                System.out.println("Ingrese el numero de sillas");
                int sillas = scan.nextInt();
                System.out.println("Ingrese la capacidad de las personas en pie");
                int pie = scan.nextInt();
                int max=sillas+pie;
                for (int i = 0; i < max; i++) {
                    buses.add(new Buses(persona, sillas, pie));
                }
                
                trans.add(new Transporte(placa, color, transportista, ruta, buses));
                break;
            case 2:
                System.out.println("Ingrese el numero de sillas");
                 sillas = scan.nextInt();
                for (int i = 0; i < sillas; i++) {
                    rapidito.add(new Rapidito(sillas, persona));
                }
                trans.add(new Transporte(placa, color, transportista, ruta, rapidito));
                break;
            case 3:
                System.out.println("Ingrese el id del taxi");
                String idt = scan.next();
                for (int i = 0; i < 3; i++) {
                    taxi.add(new Taxi(persona,idt));
                }
                trans.add(new Transporte(placa, color, transportista, ruta, taxi));
                break;
            case 4:
                mototaxi.add(new MotoTaxi());
                trans.add(new Transporte(placa, color, transportista, ruta, mototaxi));
                break;
        }

    }

    public static void CrearTransportista() {

        System.out.print("Ingrese cantidad de Tiempo en experiencia: ");

        int timexp = scan.nextInt();

        System.out.print("Ingrese su Apodo: ");

        String apodo = scan.next();
        System.out.println("Ingrese el nombre");
        String name = scan.next();
        System.out.println("Ingrese el id");
        String id = scan.next();
        for (int i = 0; i < persona.size(); i++) {
            for (Object object : persona) {
                if (object instanceof Persona) {
                    if (id.equals(((Persona) object).id)) {
                        System.out.println("Id Ocupada");
                        System.out.println("Ingrese el id");
                        id = scan.next();
                        break;
                    }
                }
            }
        }
        System.out.println("Ingrese la fecha de nacimiento dd/mm/yyyy: ");
        String fecha = scan.next();
        persona.add(new Transportista(timexp, apodo, name, id, fecha));
    }

    public static void CrearClase() {

        System.out.print("Nombre de las clase ");

        String Name = scan.next();

        System.out.print("Ingrese codigo de la clase: ");

        String codigo = scan.next();

        for (int i = 0; i < clases.size(); i++) {
            for (Object object : clases) {
                if (object instanceof Clase) {
                    if (codigo.equals(((Clase) object).codigo)) {
                        System.out.println("Codigo Ocupado");
                        System.out.println("Ingrese el codigo");
                        codigo = scan.next();
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

        String ids = scan.next();
        for (int i = 0; i < persona.size(); i++) {
            for (Object object : persona) {
                if (object instanceof Persona) {
                    if (ids.equals(((Persona) object).id)) {
                        System.out.println("id Ocupado");
                        System.out.println("Ingrese el id de estudiante ");
                        ids = scan.next();
                        break;
                    }
                }
            }
        }
        System.out.println("Ingrese el id");
        String id = scan.next();
        for (int i = 0; i < persona.size(); i++) {
            for (Object object : persona) {
                if (object instanceof Persona) {
                    if (id.equals(((Persona) object).id)) {
                        System.out.println("Id Ocupada");
                        System.out.println("Ingrese el id");
                        id = scan.next();
                        break;
                    }
                }
            }
        }
        System.out.println("Ingrese la fecha de nacimiento dd/mm/yyyy: ");
        String fecha = scan.next();
        persona.add(new Alumno(ids, clases, nombreaalumno, id, fecha));
    }

    public static void listar() {
        for (Object clase : clases) {
            System.out.println(clases.indexOf(clase) + ". " + clase);
        }
    }

    public static void listarestaciones() {
        for (Object object : ruta) {
            System.out.println(ruta.indexOf(object) + "" + object);
        }
    }

    public static void listarAlummnos() {
        for (Object object : persona) {
            if (object instanceof Alumno) {
                System.out.println(persona.indexOf(object) + " " + ((Alumno) object).nombre + " " + ((Alumno) object).fecha + " " + " " + ((Alumno) object).id + " " + object);
            }

        }
    }

    public static void listarTransportista() {

        for (Object object : persona) {

            if (object instanceof Transportista) {

                System.out.println(persona.indexOf(object) + "" + ((Transportista) object).nombre + " " + ((Transportista) object).fecha + " " + ((Transportista) object).id + object);

            }
        }
    }

    public static void listarTransporte() {

        for (Object object : trans) {

            System.out.println(trans.indexOf(object) + "" + object);

        }
    }

    public static void simulacion() {

    }
}
