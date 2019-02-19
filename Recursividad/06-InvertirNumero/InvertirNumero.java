/*
	@descripcion: Programar un algoritmo recursivo que permita invertir un número. 
				Ejemplo: Entrada: 789 Salida: 987
	@author: Christian Peralta
	@fecha: 18-02-2019
 */


public class InvertirNumero {

	public static void main(String Args[]){
		Integer numero = 789;
		System.out.println("numero ingresado: " + numero);
		System.out.println("numero invertido: " + invertirNumero(numero));
	}

	public static Integer invertirNumero(Integer n){
		if( n / 10 == 0 ) return n;
		return  n % 10  * (int) Math.pow(10, Integer.toString(n / 10).length()) + invertirNumero(n/10);
	} 
}