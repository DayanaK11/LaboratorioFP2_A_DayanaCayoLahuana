package ejercicioResuelto02;

public class BubbleSort {
	
	public void Ordenamiento_BubbleSort(int [] arreglo, int tipo) {
		//TIPO == 1 ===>ASCENDENTE
		//TIPO == = ===>DESCENDENTE
		int auxiliar;
		for(int i = 0; i<arreglo.length-1; i++) {//bucle externo
			for(int j = i +1; j < arreglo.length; j++){//buvle interno
				//swap
				if(arreglo[i] > arreglo[j]) {
					auxiliar = arreglo[j];
					arreglo[j] = arreglo[i];
					arreglo[i] = auxiliar;
				}
				
			}
		}

	}

}
