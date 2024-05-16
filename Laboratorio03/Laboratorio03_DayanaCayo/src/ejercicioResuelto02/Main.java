package ejercicioResuelto02;
import ejercicioResuelto02.BubbleSort;
import java.util.*;

public class Main {
	
	//Valores que tiene el arreglo desordenado.
	static final int N = 5000;
	static int arregloEnteros[] = new int [N];
	
	private void generarNumeros(int [] arreglo) {
		//generamos numeros aleatorio
		Random generador = new Random();
		for(int i=0; i<arreglo.length-1; i++) 
			arreglo[i] = generador.nextInt(arreglo.length)+1;
	}
	
	public void imprimirArreglo(int [] arreglo) {
		for(int i=0; i<arreglo.length; i++)
			System.out.print(arreglo[i] + " - ");
		//salto de linea
		System.out.println("");
	}
	
	public static void main(String[] args) {
		Main objPrincipal = new Main();
		objPrincipal.generarNumeros(arregloEnteros);
		//1. IMPRIMIR ARREGLO DESORDENADO
		System.out.print("Arreglo Desordenado\n-----------------------\n");
		objPrincipal.imprimirArreglo(arregloEnteros);
		//2. ORDENAMOS POR METODO BURBUJA
		BubbleSort objMetodoBurbuja = new BubbleSort();
		objMetodoBurbuja.Ordenamiento_BubbleSort(arregloEnteros, 1);
		//3. IMPRIMIR ARREGLO ORDENADO - METODO BURBUJA
		System.out.print("Arreglo Ordenado\n-------------------------\n");
		objPrincipal.imprimirArreglo(arregloEnteros);
	}

}
