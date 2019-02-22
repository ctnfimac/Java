/**
  @description: Programar un algoritmo recursivo que permita sumar los elementos de un vector.
  @author: Christian Peralta
  @fecha: 21-02-2019
 */
import java.util.*;

public class SumarNumeroDeArray {

	public static void main(String Args[]){
		List<Integer> vector = new ArrayList<Integer>();
		vector.add(2);
		vector.add(7);
		vector.add(1);
		vector.add(8);
		vector.add(10);
		System.out.println("Suma de valores del vector: " + sumarNumeros(vector,vector.size()));
		System.out.println("Suma de valores del vector con el otro metodo: " + sumarNumeros(vector));

	}

	public static Integer sumarNumeros(List<Integer> v){
		if(v.size() == 1 ) return v.get(0);
		Integer value = v.get(0);
		v.remove(0);
		return value + sumarNumeros(v);
	}

	public static Integer sumarNumeros(List<Integer> v, int n){
		n--;
		if(n == 0 ) return v.get(n);
		return v.get(n) + sumarNumeros(v,n);
	}
	
}