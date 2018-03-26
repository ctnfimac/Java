/*
  @description: Lista simplemente enlazada
  @author: Christian Peralta
  @fecha: 24-03-2018
*/

import java.util.Scanner;
import javax.swing.JOptionPane;

class Aplicacion{
   public final static int AGREGAR_INICIO = 1;
   public final static int AGREGAR_FIN = 2;
   public final static int MOSTRAR = 3;
	public final static int CANTIDAD_DE_ELEMENTOS = 4;
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
		}while( opcion != 5 );
	}

	

   private static void handler(int opcion){
      int valor;
   	 switch(opcion){
   	 	case AGREGAR_INICIO:
            valor = mensaje("ingresar el elemento al inicio");
            lista.agregarAlInicio(valor);
            break;
         case AGREGAR_FIN:
   	 		valor = mensaje("ingresar el elemento al final");
            lista.agregarAlFinal(valor);
   	 		break;
   	 	case MOSTRAR:
   	 		lista.imprimirLista();
   	 		break;
          case CANTIDAD_DE_ELEMENTOS:
            valor = lista.cantidadDeElementos();
            mensajeInfo("La cantidad de elementos es de "+valor+" nodos");
            break;
   	 	default:
   	 		break;
   	 }
   }

   private static int mensaje(String msj){
   		int valor = Integer.parseInt(JOptionPane.showInputDialog(
   			null,
   			msj,
   			"Ingresando nodo",
   			JOptionPane.INFORMATION_MESSAGE
   			));
            return valor;	
   }

   private static void mensajeInfo(String msj){
         JOptionPane.showMessageDialog(null, msj);
   }

   private static int menuDeOpciones(){
   		int opcion = Integer.parseInt(JOptionPane.showInputDialog(null,
             "1. Agregar Elemento al inicio de la lista\n"
            +"2. Agregar Elemento al final de la lista\n"
            +"3. Mostrar Lista\n"
   			+"4. Mostrar cantidad de Elementos\n"
			   +"5. Salir",
   				"Menu de opciones",
   				JOptionPane.INFORMATION_MESSAGE));
   		return opcion;	
   }
}

/*
 "1. Agregar un Elemento al Inicio de la Lista\n"
  +"2. Agregar un Elemento al final de la lista\n"
  +"3. Mostrar los datos de la lista\n"
  +"4. Eliminar un elemento del inicio de la lista\n"
  +"5. Eliminar un elemento del final de la lista\n"
  +"6. Eliminar un elemento en específico\n"
  +"7. Buscar un elemento en la lista\n"
  +"8. Ordenar la lista\n"
  +"9. Cantidad de elementos\n"
  +"10. Salir", "Menú de Opciones",3));
*/