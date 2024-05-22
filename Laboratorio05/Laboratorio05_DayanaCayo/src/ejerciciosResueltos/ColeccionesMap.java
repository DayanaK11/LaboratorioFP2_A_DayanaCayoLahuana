package ejerciciosResueltos;
import java.util.*;

public class ColeccionesMap {
	
	static Scanner consola = new Scanner(System.in);
	//interfaz       implement
	Map diccionario1 = new HashMap();
	
	
	public void llenarHashMap() {
		//Insertar valores "key" - "value" al HashMap
		diccionario1.put("29458865", "Maria");
		diccionario1.put("28784599", "Jose");
		diccionario1.put("26558899", "Luis");
		diccionario1.put("45785214", "Juan");
		diccionario1.put("48889566", "Mariela");
		diccionario1.put("48889544", "Carlos");
		diccionario1.put("12389566", "Rosa");
		diccionario1.put("48889540", "Carlos");
		diccionario1.put("26558890", "Luis");
		
		//Definir Iterator para extraer o imprimir valores
		//recorremos y mostramos el diccionario
		for(Iterator iterador1 = diccionario1.keySet().iterator(); iterador1.hasNext();) {
			
			String key = (String)iterador1.next();
			String value = (String)diccionario1.get(key);
			System.out.println("DNI : " + key + "Alumno: " + value);
		}
		
		//Mostramos el tamaño del diccionario
		System.out.println("Tamaño : " + diccionario1.size());

	}
	
	public void buscarEnHashMap() {
		
		//buscamos un valor en el diccionario
		System.out.println("Ingrese un Nombre  a buscar: ");
		String nombre = consola.next();
		if(diccionario1.containsValue(nombre))
			System.out.println(nombre + " Se encuentra en el diccionario");
		else
			System.out.println(nombre + " No se encuentra!!");
	}
	
	public void eliminarEnHashMap() {
		
		//eliminamos un valor en el diccionario
		System.out.println("Ingrese un código a eliminar : ");
		String llave = consola.next();
		diccionario1.remove(llave);
		
		for(Object key : diccionario1.keySet()) {
			String llave2 = (String)key;
			String value2 = (String)diccionario1.get(llave2);
			System.out.println("DNI: " + llave2 + " Alumno: "+ value2);
					
		}
	}
	
	
	public void reemplazarEnHashmap() {
		
		//Reemplazamos un valor en el diccionario
		System.out.println("Ingrese un codigo a reemplazar : ");
		String llave2 =  consola.next();
		System.out.println("Ingrese el nuevo valor : ");
		String valorNuevo = consola.next();
		
		diccionario1.replace(llave2, valorNuevo);
		
		for(Object key3 : diccionario1.keySet()) {
			String llave3 = (String)key3;
			String value3 = (String)diccionario1.get(llave3);
			System.out.println("DNI: " + llave3 + " Alumno: " + value3);
		}
	}
		
}












