import javax.swing.JOptionPane;

public class Main{
	static final int SALIR = 0;
	static final int AGREGAR_AL_INICIO = 1;
	static final int AGREGAR_AL_FINAL  = 2;
	static final int MOSTRAR_LISTA_INICIO_A_FIN  = 3;
	static final int MOSTRAR_LISTA_FIN_A_INICIO = 4;
	static final int ELIMINAR_DEl_INCICIO = 5;
	static final int ELIMINAR_DEl_FINAL = 6;

	private static Lista lista;

	public static void main(String[] args){
		lista = new Lista();
		int opcion;
		do{
			opcion = menu();
			opcionSeleccionada(opcion);
		}while(opcion!=SALIR);
	}


	public static Integer mensajeDeEntrada(String mensaje, String titulo){
		Integer dato = Integer.valueOf(JOptionPane.showInputDialog(null,mensaje,titulo,JOptionPane.PLAIN_MESSAGE));
		return dato;
	}

	public static void mensajeDeInformacion(String mensaje){
		JOptionPane.showMessageDialog(null,mensaje);
	}

	public static Integer menu(){
		Integer opcion = Integer.valueOf(JOptionPane.showInputDialog(
			null,
			"1. Agregar valor al inicio de la lista\n"
		   +"2. Agregar valor al final de la lista\n"
		   +"3. Mostrar la Lista de inicio a fin\n"
		   +"4. Mostrar la Lista de fin a inicio\n"
		   +"5. Eliminar Nodo del inicio de la lista\n"
		   +"6. Eliminar Nodo del final de la lista\n"
		   +"0. Salir",
		   "Menu de opciones",
		   JOptionPane.PLAIN_MESSAGE));
		return opcion;
	}

	public static void opcionSeleccionada(Integer opcion){
		switch(opcion){
			case AGREGAR_AL_INICIO:
				lista.agregarAlInicio(mensajeDeEntrada("Ingrese el valor", "Ingresando valor al inicio de la lista"));
				break;
			case AGREGAR_AL_FINAL:
				lista.agregarAlFinal(mensajeDeEntrada("Ingrese el valor", "Ingresando valor al inicio de la lista"));
				break;
			case MOSTRAR_LISTA_INICIO_A_FIN:
				lista.mostrarListaDeInicioAfin();
				break;
			case MOSTRAR_LISTA_FIN_A_INICIO:
				lista.mostrarListaDeFinAinicio();
				break;
			case ELIMINAR_DEl_INCICIO:
				if(!lista.estaVacia()){
					mensajeDeInformacion("Elemento eliminado :" + lista.eliminarDelInicio());
				}else{
					mensajeDeInformacion("La lista esta vacia");
				}
				break; 
			case ELIMINAR_DEl_FINAL:
				if(!lista.estaVacia()){
					mensajeDeInformacion("Elemento eliminado :" + lista.eliminarDelFinal());
				}else{
					mensajeDeInformacion("La lista esta vacia");
				}
				break;
			default:
				break;
		}
	}

}
