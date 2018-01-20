/*
  @description:Programar un algoritmo recursivo que permita 
  			   hacer una multiplicación, utilizando el método 
  			   Ruso	
  @author: Christian Peralta
  @fecha: 05-06-2017
*/

import java.util.Scanner;

class Multipicacion{

	public static void main(String[] args){
	
		println("resultado: "+ multiplicacion(6,8));	
	}

	public static int multiplicacion( int multiplicador , int multiplicado){
		//println("multiplicador:"+(multiplicado *  (multiplicador % 2))+", multiplicado:"+multiplicado);
		if(multiplicador == 1) return multiplicado;
		
		return ((multiplicado * ( multiplicador % 2)) + multiplicacion( multiplicador/2 , multiplicado * 2 ));
		
	}

	public static void print(String s){
		System.out.print(s);
	}

	public static void println(String s){
		System.out.println(s);
	}
}