//EJERCICIO 01

package ejerciciosResueltos;

import java.util.*;
public class Arreglos_UniDimensionales 
{
	public static void main(String[] args) 
	{
		//1. Declaracion de variables
		Scanner consola=new Scanner(System.in);
		//final int N = 15;
		int longitud;
		int [] numeros;
		int suma = 0;
		double promedio;
		//Ingresamos el tamaño del arreglo
		System.out.println("Ingrese la cantidad de elementos : ");
		longitud = consola.nextInt();
		
		numeros = new int[longitud];
		for(int index = 0;index < longitud; index++)
		{
			System.out.println("Ingrese el numero "+ (index + 1) + ":");
			numeros[index] = consola.nextInt();		
		}
		
		//3. Mostrar datos
		for(int indice =0 ; indice< longitud;indice++)
		{
			System.out.println("Posicion: "+ indice + "\t");
			System.out.println("Número: " + numeros[indice]);
		}
		
		//4. Calculamos el promedio
		for( int ind = 0;ind <longitud; ind++)
			suma += numeros[ind];
		
		promedio = (double)suma/(double)longitud;
		System.out.println("La suma es : " + suma);
		System.out.println("El promedio es : " + promedio);

	}

}
