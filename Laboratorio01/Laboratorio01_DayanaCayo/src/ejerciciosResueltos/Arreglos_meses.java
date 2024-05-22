//EJERCICIO 02
package ejerciciosResueltos;

import java.util.Scanner;

public class Arreglos_meses 
{
	public static void main(String[] args) 
	{
		//Declaración de variables
		Scanner teclado = new Scanner(System.in);
		int nroMes, nroDia;
		String[] meses = {"EENERO", "FEBRERO", "MARZO", "ABRIL", "MAYO", "JUNIO", "JULIO", 
				"AGOSTO", "SEPTIEMBRE", "OCTUBRE", "NOVIEMBRE", "DICIEMBRE"};

		String[] dias = {"DOMINGO", "LUNES", "MARTES", "MIERCOLES", "JUEVES", "VIERNES",
		"SABADO"};

		//Muestra el contenido del arreglo
		for(int ind = 0; ind<meses.length; ind++)
		{
			System.out.println("Mes "+ (ind + 1) + " : "+ meses[ind]);
		}

		//Muestra un mes segun el numero del mes
		System.out.println("Ingrese Número de Mes :");
		nroMes = teclado.nextInt();
		System.out.println("El Mes es:" + meses[nroMes - 1]);

		//Muestra el contenido del arreglo dias
		for(String dia : dias)
		{
			System.out.println("Dia :"+dia);
		}

		//Muestra un dia segun el nro del dia
		System.out.println("Ingrese Número del día de la Semana :");
		nroDia = teclado.nextInt();
		System.out.println("El Dia es:"+dias[nroDia - 1]);
	}
}
