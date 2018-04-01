import javax.swing.JOptionPane;

public class Main{
	static final int SALIR = 0;
	static final int AGREGAR_AL_INICIO = 1;
	static final int AGREGAR_AL_FINAL  = 2;
	static final int MOSTRAR_LISTA  = 3;

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
		   +"3. Mostrar Lista\n"
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
			case MOSTRAR_LISTA:
				lista.mostrarLista();
				break;
			default:
				break;
		}
	}

}


/*
"1. Agregar un Nodo al Inicio\n"
+"2. Agregar in Nodo al Final\n"
+"3. Mostrar la lista de inicio a fin\n"
+"4. Mostrar la lista de fin a inicio\n"
+"5. Eliminar un nodo del inicio\n"
+"6. Eliminar un nodo del final\n"
+"7. salir\n"

*/