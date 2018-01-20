/*
  * description:
  * Programar un algoritmo recursivo que calcule un número 
  * de la serie fibonacci. 
*/

import java.util.Scanner;

class Fibonacci{

	public static void main(String[] args){
		Scanner teclado;
		int entrada, resultado;

		teclado = new Scanner(System.in);
		print("Ingrese un numero:");
		entrada = teclado.nextInt();
		resultado = fibonacci(entrada);
		println("El resultado es "+resultado);
	}

	public static int fibonacci(int d){
		if( d  == 0 ) return 0; 
		if( d == 1 || d == 2 ) return 1;
		return fibonacci( d - 1 ) + fibonacci( d - 2);
	}

	public static void print(String s){
		System.out.print(s);
	}

	public static void println(String s){
		System.out.println(s);
	}
}