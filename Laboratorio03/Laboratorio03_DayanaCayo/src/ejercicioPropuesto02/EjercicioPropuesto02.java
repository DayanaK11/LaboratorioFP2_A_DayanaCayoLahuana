//Laboratorio Nro 3 - Ejercicio2
//Autor: Dayana Katherine Cayo Lahuana 
package ejercicioPropuesto02;
import java.util.*;
public class EjercicioPropuesto02 {

	public static void main(String[] args) {
		final int N = 21;

        Jugador[] equipo1 = new Jugador[N];
        Jugador[] equipo2 = new Jugador[N];

        inicializarEquipo(equipo1);
        inicializarEquipo(equipo2);

        System.out.println("----------EQUIPO1----------");
        mostrarEquipo(equipo1);
        System.out.println("----------EQUIPO2----------");
        mostrarEquipo(equipo2);

        System.out.println("----------TITULARES EQUIPO1----------");
        mostrarEquipo(seleccionarTitulares(equipo1));
        System.out.println("----------TITULARES EQUIPO2----------");
        mostrarEquipo(seleccionarTitulares(equipo2));

        int golesEquipo1 = generarGoles();
        int golesEquipo2 = generarGoles();

        System.out.println("--------------MARCADOR---------------");
        System.out.println("EQUIPO1 : " + golesEquipo1 + " VS " + "EQUIPO2 :  " + golesEquipo2);

        System.out.println("--------------GANADOR---------------");
        System.out.println(determinarGanador(golesEquipo1, golesEquipo2));
        
        String nombre = "Jugador12";
        
        ordenarPorNombre(equipo1);
        mostrarEquipo(equipo1);
        buscarPorNombre(equipo1, nombre);
        

        ordenarPorNombre(equipo2);
        mostrarEquipo(equipo2);
        buscarPorNombre(equipo1, nombre);
        

	}
	public static void inicializarEquipo(Jugador[] equipo) {
        String nombre = "Jugador";
        for (int i = 0; i < equipo.length; i++) {
            equipo[i] = new Jugador(nombre + (i + 1));
        }
    }

    public static void mostrarEquipo(Jugador[] equipo) {
        for (int i = 0; i < equipo.length; i++) {
            System.out.println(equipo[i].getNombre());
        }
    }

    public static Jugador[] seleccionarTitulares(Jugador[] equipo) {
        Random random = new Random();
        Jugador[] titulares = new Jugador[11];
        boolean[] seleccionados = new boolean[equipo.length];

        for (int i = 0; i < 11; i++) {
            int index;
            do {
                index = random.nextInt(equipo.length);
            } while (seleccionados[index]);

            titulares[i] = equipo[index];
            seleccionados[index] = true;
        }
        return titulares;
    }

    public static int generarGoles() {
        Random random = new Random();
        return random.nextInt(8);
    }

    public static String determinarGanador(int golesEquipo1, int golesEquipo2) {
        if (golesEquipo1 > golesEquipo2) {
            return "EQUIPO 1";
        } else if (golesEquipo2 > golesEquipo1) {
            return "EQUIPO 2";
        } else {
            return "EMPATE";
        }
    }
    // Método para ordenar el arreglo de jugadores por nombre usando el método de burbuja
    public static void ordenarPorNombre(Jugador[] equipo) {
        for (int i = 0; i < equipo.length - 1; i++) {
            for (int j = 0; j < equipo.length - i - 1; j++) {
                if (equipo[j].getNombre().compareToIgnoreCase(equipo[j + 1].getNombre()) > 0) {
                    // Intercambiar elementos si están en el orden incorrecto
                    Jugador temp = equipo[j];
                    equipo[j] = equipo[j + 1];
                    equipo[j + 1] = temp;
                }
            }
        }
    }
    // Método para buscar un jugador por nombre usando la búsqueda binaria
    public static void buscarPorNombre(Jugador[] equipo, String nombre) {
        ordenarPorNombre(equipo); // Es necesario ordenar el arreglo primero para utilizar la búsqueda binaria
        int inicio = 0;
        int fin = equipo.length - 1;
        while (inicio <= fin) {
            int medio = inicio + (fin - inicio) / 2;
            int comparacion = equipo[medio].getNombre().compareToIgnoreCase(nombre);
            if (comparacion == 0) {
                System.out.println("Jugador encontrado:");
                System.out.println("Nombre: " + equipo[medio].getNombre());
                return;
            } else if (comparacion < 0) {
                inicio = medio + 1;
            } else {
                fin = medio - 1;
            }
        }
        System.out.println("Jugador con nombre '" + nombre + "' no encontrado.");
    }

}
