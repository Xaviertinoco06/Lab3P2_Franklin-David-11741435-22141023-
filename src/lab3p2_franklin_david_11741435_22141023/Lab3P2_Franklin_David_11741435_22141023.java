package lab3p2_franklin_david_11741435_22141023;

import java.util.ArrayList;
import java.util.Scanner;

public class Lab3P2_Franklin_David_11741435_22141023 {

    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {

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

                break;

            case 2:

                break;

            case 3:

                break;

            case 4:

                break;

            case 5:

                break;

        }
    }
}
