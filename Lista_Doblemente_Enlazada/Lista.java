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

	public void mostrarLista(){
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

	public boolean estaVacia(){
		return inicio == null;
	}
}