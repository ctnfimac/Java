/*
  @description: Programar un algoritmo recursivo que permita sumar los dígitos 
  				de un número. Ejemplo: Entrada: 123 Resultado:6
  @author: Christian Peralta
  @fecha: 05-06-2017
*/

import java.util.Scanner;

class SumaDigitos{

	public static void main(String[] args){
		println("suma de digitos: "+ sumaDigitos(123));
	}

	public static int sumaDigitos(int param){
		if( param < 10 ) return param ;
		return (( param % 10 ) + sumaDigitos( param / 10 )); 
	}

	public static void print(String s){
		System.out.print(s);
	}

	public static void println(String s){
		System.out.println(s);
	}
}