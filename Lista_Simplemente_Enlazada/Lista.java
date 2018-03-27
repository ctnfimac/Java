class Lista{
	private Nodo inicio;
	private Nodo fin;

	public Lista(){
		inicio = null;
		fin = null;
	}


	public void agregarAlInicio(int dato){
		if(inicio == null){
			inicio = fin = new Nodo(dato);
		}else{
			Nodo nuevo = new Nodo(dato);
			nuevo.siguiente = inicio;
			inicio = nuevo;
		}
	}

	public void agregarAlFinal(int dato){
		if(inicio == null){
			inicio = fin = new Nodo(dato);
		}else{
			Nodo nuevo = new Nodo(dato);
			fin.siguiente = nuevo;
			fin = nuevo;
		}
	}


	public int cantidadDeElementos(){
		int contador = 0;
		if(!estaVacia()){
			Nodo aux = inicio;
			while(aux != null){
				contador++;
				aux = aux.siguiente;
			}
		}
		return contador;
	}


	public int eliminarDelInicio(){
		int dato = inicio.dato;
		if( inicio == fin ) inicio = fin = null;
		else inicio = inicio.siguiente;
		return dato;
	}

	public int eliminarDelFinal(){
		int dato = fin.dato;
		if( inicio == fin ) inicio = fin = null;
		else{
			Nodo temporal = inicio;
			while( temporal.siguiente != fin ){
				temporal = temporal.siguiente;
			}
			fin = temporal;
			fin.siguiente = null;
		}
		
		return dato;
	}

	public boolean estaVacia(){
		return inicio == null;
	}

	public void imprimirLista(){
		Nodo temporal = inicio;
		System.out.println("");
		while(temporal != null){
			System.out.print("["+temporal.dato+"]-->");
			temporal = temporal.siguiente;
		}
	}
}