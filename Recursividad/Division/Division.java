/*
  *description:Programar un algoritmo recursivo que permita 
  *hacer la división por restas sucesivas.
*/

import java.util.Scanner;

class Division{

	public static void main(String[] args){
		Scanner teclado;
		int divisor, dividendo, cociente;

		teclado = new Scanner(System.in);

		try{
			print("Ingrese el dividendo: ");
			dividendo = teclado.nextInt();
			print("Ingrese el divisor: ");
			divisor = teclado.nextInt();
			cociente = division (dividendo, divisor);
			println("El resuldato de la division es "+ cociente);
		}catch(java.util.InputMismatchException e){
			println("Error! No ingreso un numero entero");
		}finally{
			println("Fin del programa");
		}
		
	}

	public static int division( int c , int d){
		if( c < d) return 0;
		return 1 + division( c - d , d);
	}

	public static void print(String s){
		System.out.print(s);
	}

	public static void println(String s){
		System.out.println(s);
	}
}