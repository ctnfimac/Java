class Lista{
	private Nodo inicio;
	private Nodo fin;

	public Lista(){
		inicio = null;
		fin = null;
	}


	public void agregarElemento(int dato){
		if(inicio == null){
			inicio = fin = new Nodo(dato);
		}else{
			Nodo nuevo = new Nodo(dato);
			nuevo.siguiente = inicio;
			inicio = nuevo;
		}
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