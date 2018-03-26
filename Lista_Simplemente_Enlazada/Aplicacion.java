/*
  @description: Lista simplemente enlazada
  @author: Christian Peralta
  @fecha: 24-03-2018
*/

import java.util.Scanner;
import javax.swing.JOptionPane;

class Aplicacion{
	public final static int AGREGAR = 1;
	public final static int MOSTRAR = 2;
	public static Lista lista;
	public static int elemento;

	public static void main(String[] args){
		int opcion = 0;
		lista = new Lista();
		
		do{
			try{
				opcion = menuDeOpciones();
				handler(opcion);
			}catch(Exception e){
				System.out.println("Mensaje de error: "+e.getMessage());
			}
		}while( opcion != 3);
	}

	

   private static void handler(int opcion){
   	 switch(opcion){
   	 	case AGREGAR:
   	 		mensaje("ingresar el elemento");
   	 		break;
   	 	case MOSTRAR:
   	 		lista.imprimirLista();
   	 		break;
   	 	default:
   	 		break;
   	 }
   }

   private static void mensaje(String msj){
   		int valor = Integer.parseInt(JOptionPane.showInputDialog(
   			null,
   			msj,
   			"Ingresando nodo al inicio",
   			JOptionPane.INFORMATION_MESSAGE
   			));
   		lista.agregarElemento(valor);
   }

   private static int menuDeOpciones(){
   		int opcion = Integer.parseInt(JOptionPane.showInputDialog(null,
   				"1. Agregar Elemento a la lista\n"
			   +"2. Mostrar Lista\n"
			   +"3. Salir",
   				"Menu de opciones",
   				JOptionPane.INFORMATION_MESSAGE));
   		return opcion;	
   }
}