import javax.swing.JOptionPane;

class Lista{
	Nodo inicio, fin;

	public Lista(){
		this.inicio = null;
		this.fin = null;
	}

	public void agregarAlInicio(int dato){
		if(this.estaVacia()){
			inicio = fin = new Nodo(dato);
		}else{
			Nodo temporal = new Nodo(dato);
			temporal.anterior = inicio;
			inicio.siguiente = temporal;
			inicio = temporal;
		}
	}

	public void agregarAlFinal(int dato){
		if(this.estaVacia()){
			inicio = fin = new Nodo(dato);
		}else{
			Nodo temporal = new Nodo(dato);
			temporal.siguiente = fin;
			fin.anterior = temporal;
			fin = temporal;
		}
	}

	public void mostrarListaDeInicioAfin(){
		if(!this.estaVacia()){
			Nodo temporal = inicio;
			System.out.println("");
			String msj = "";
			while(temporal != null){
				System.out.print("["+temporal.dato+"]<==>");
				msj += "["+temporal.dato+"]<==>";
				temporal = temporal.anterior;
			}
			JOptionPane.showMessageDialog(null,msj);
		}
	}

	public void mostrarListaDeFinAinicio(){
		if(!this.estaVacia()){
			Nodo temporal = fin;
			System.out.println("");
			String msj = "";
			while(temporal != null){
				System.out.print("["+temporal.dato+"]<==>");
				msj += "["+temporal.dato+"]<==>";
				temporal = temporal.siguiente;
			}
			JOptionPane.showMessageDialog(null,msj);
		}
	}


	public int eliminarDelInicio(){
		int resultado = inicio.dato;
			if( inicio == fin ){
				inicio = fin = null;
			}else{
				inicio.anterior.siguiente = null;
				inicio = inicio.anterior;
			}
		return resultado;
	}

	public int eliminarDelFinal(){
		int resultado = fin.dato;
		if( inicio == fin ){
			inicio = fin = null;
		}else{
			fin.siguiente.anterior = null;
			fin = fin.siguiente;
		}
	return resultado;
	}

	public int cantidadDeElementos(){
		int cantidad = 0;
		if(!this.estaVacia()){
			Nodo temporal = inicio;
			while(temporal != null){
				cantidad++;
				temporal = temporal.anterior;
			}
		}
		return cantidad;
	}

	public boolean estaVacia(){
		return inicio == null;
	}
}