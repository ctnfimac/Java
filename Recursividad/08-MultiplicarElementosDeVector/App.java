/**
  @description: Programar un algoritmo recursivo que permita multiplicar los elementos de un vector
  @author: Christian Peralta
  @fecha: 22-02-2019
 */
import java.util.*;

public class App{

	public static void main(String Args[]){
		List<Integer> vector = new ArrayList<Integer>();
		vector.add(2);
		vector.add(5);
		vector.add(3);
		System.out.println("Multiplicacion de valores del vector: " + MultiplicarElementos(vector));

	}

	public static Integer MultiplicarElementos(List<Integer> v){
		if(v.size() == 1 ) return v.get(0);
		Integer value = v.get(0);
		v.remove(0);
		return value * MultiplicarElementos(v);
	}
}