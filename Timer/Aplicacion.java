/*
  @description:uso de la clase Timer y TimerTask  
		Lanzamos un mensaje cada segundo durante 5 segundos
  @author: Christian Peralta
  @fecha: 11-08-2017		
*/

import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;

class Aplicacion{
	private static int contador = 0;
	public static void main(String[] args){
	
    Timer timer;
    timer = new Timer();

    TimerTask task = new TimerTask() {
        int tic = 0;
        @Override
        public void run(){
        	contador++;
            if (tic%2==0)	System.out.println("TIC");
            else			System.out.println("TOC");
            tic++;
            if(contador >= 5){
            	timer.cancel();
            	println("Fin del temporizador");
            }
        }
    };
    //Empezamos dentro de 10ms y luego lanzamos la tarea cada 1000ms
    timer.schedule(task, 10, 1000);
	}

	public static void print(String s){
		System.out.print(s);
	}

	public static void println(String s){
		System.out.println(s);
	}
}
