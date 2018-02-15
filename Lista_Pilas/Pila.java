class Pila{
 private Nodo raiz;

 public Pila(){
 	raiz = null;
 }

 public void insertar(int dato){
 	Nodo nuevo = new Nodo();
 	nuevo.info = dato;
 	if(vacia()){
 		nuevo.sig = null;
 		raiz = nuevo;
 	}else{
 		nuevo.sig = raiz;
 		raiz = nuevo;
 	}
 }

 public int extraer(){
 	int valor;
 	
 	if( raiz != null ){
 		valor = raiz.info;
 		raiz = raiz.sig;
 		return valor;
 	}else return 99;//Integer.MAX_VALUE;
 }

 public void imprimir(){
 	Nodo recorre = raiz ;

 	while(recorre!=null){
 		System.out.print(recorre.info+", ");
 		recorre = recorre.sig;
 	}
 }

 public boolean vacia(){
 	if( raiz == null ) return true;
 	else return false;
 }

 //clase privada
 private class Nodo{
 	int info;
 	Nodo sig;
 }	
}