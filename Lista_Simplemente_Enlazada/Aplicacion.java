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
    public final static int ELIMINAR_DEL_INICIO = 5;
	public final static int ELIMINAR_DEL_FINAL = 6;
	public final static int BUSCAR_ELEMENTO = 7;
	public final static int ELIMINAR_ELEMENTO = 8;
	public final static int ORDERNAR_MAYOR_A_MENOR = 9;
	public final static int ORDERNAR_MENOR_A_MAYOR = 10;
	public final static int ELIMINAR_TODOS = 11;
	public final static int VACIAR_LISTA = 12;
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
				System.out.println("\nMensaje de error: "+e.getMessage());
			}
		}while( opcion != 13 );
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
        case ELIMINAR_DEL_INICIO:
            if(!lista.estaVacia()){
               valor = lista.eliminarDelInicio();
               mensajeInfo("elemento eliminado :" + valor);
            }else mensajeInfo("La lista esta vacia");
            
            break;  
        case ELIMINAR_DEL_FINAL:
            if(!lista.estaVacia()){
               valor = lista.eliminarDelFinal();
               mensajeInfo("elemento eliminado :" + valor);
            }else mensajeInfo("La lista esta vacia");
            
            break;
        case CANTIDAD_DE_ELEMENTOS:
            valor = lista.cantidadDeElementos();
            mensajeInfo("La cantidad de elementos es de "+valor+" nodos");
			break;
			
		case BUSCAR_ELEMENTO:
			valor = mensaje("Ingresa el elemento a buscar");
			boolean resultado = lista.buscarElemento(valor);
			if(resultado) mensajeInfo("El elemento " + valor + " se encuentra en la lista");
			else mensajeInfo("El elemento " + valor + " no se encuentra en la lista");
			break;
		
		case ELIMINAR_ELEMENTO:
			valor = mensaje("Ingresar elemento a eliminar");
			if(lista.eliminarElemento(valor)){
				mensajeInfo("El elemento " + valor + " fue eliminado de la lista");
			}else mensajeInfo("El elemento " + valor + " no esta en la lista");
			break;
		case ORDERNAR_MAYOR_A_MENOR:
			lista.ordenarDeMayorAmenor();
			mensajeInfo("lista Ordenada de mayor a menor");
			break;
		
		case ORDERNAR_MENOR_A_MAYOR:
			lista.ordenarDeMenorAmenor();
			mensajeInfo("lista Ordenada de menor a mayor");
			break;

		case ELIMINAR_TODOS:
			valor = mensaje("Ingrese que dato quiere eliminar completamente de la lista");
			if(lista.eliminarTodosDeLaLista(valor)){
				mensajeInfo("El elemento " + valor + " fue eliminado de toda la lista");
			}else 
				mensajeInfo("El elemento " + valor + " no esta en la lista");
			break;
		
		case VACIAR_LISTA:
			lista.vaciarLista();
			mensajeInfo("Lista vaciada");
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
            +"5. Eliminar un elemento del inicio de la lista\n"
			+"6. Eliminar un elemento del final de la lista\n"
			+"7. Buscar un elemento en la lista\n" 
			+"8. Eliminar elemento especifico(el primero que encuentre)\n"
			+"9. Ordenar la lista de mayor a menor\n" 
			+"10. Ordenar la lista de menor a mayor\n"
			+"11. Eliminar elemento completamente de la lista\n" 
			+"12. Vaciar lista\n"    
		    +"13. Salir",
   				"Menu de opciones",
   				JOptionPane.INFORMATION_MESSAGE));
   		return opcion;	
   }
}
