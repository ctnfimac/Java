/*
 * description:Programar un algoritmo recursivo que calcule el factorial de un número.
*/

import java.util.Scanner;

class Factorial{

	public static void main(String[] args){
		Scanner teclado;
		int entrada, resultado;

		teclado = new Scanner(System.in);


		try{
			print("Ingrese un numero entero:");
		    entrada = teclado.nextInt();
		    resultado = factorial(entrada);
		    //print(Integer.toString(resultado));
		    print("El factorial de "+entrada+" es "+resultado);
		}catch(java.util.InputMismatchException e){
			println("Error! No ingreso un numero entero");
		}finally{
			println("Fin del programa");
		}
		
	}

	public static int factorial(int d){
		if(d == 1) return 1;
		return d * factorial(d-1);
	}

	public static void print(String s){
		System.out.print(s);
	}

	public static void println(String s){
		System.out.println(s);
	}

}



