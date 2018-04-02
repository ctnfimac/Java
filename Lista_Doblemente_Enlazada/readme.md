# Lista doblemente enlazadas

### Objeto Nodo
![nodo](https://user-images.githubusercontent.com/24881247/38172292-2fb4d36c-3580-11e8-9c99-2a3f0ccf6ade.png)

### Creando objeto Lista
Al crear un objeto Lista este contiene dos objetos Nodo (inicio y fin) los cuales se inicializan apuntando a null;

~~~
public Lista(){
  this.inicio = null;
  this.fin = null;
}  
~~~

![objetolista](https://user-images.githubusercontent.com/24881247/38172319-b94003ea-3580-11e8-800a-96ded8bd02b9.png)

### Ingresando el primer dato
en los métodos agregarAlInicio(int dato) y agregarAlFinal(int dato) tienen el siguiente bloque de código que se ejecuta si la lista esta vacia
~~~
inicio = fin = new Nodo(dato);
~~~
![primernodo](https://user-images.githubusercontent.com/24881247/38172344-0e800634-3581-11e8-973c-ee8c975b4596.png)

en este caso el primer dato ingresado es el 9. Tanto el siguiente como anterior del nodo creado apuntan a null, y los nodos inicio y fin de la lista apuntan al nodo creado.

### Ingresando un dato al principio
Se ingresa el dato 13
![agregandoalinicio](https://user-images.githubusercontent.com/24881247/38172514-d44b3cce-3583-11e8-8a76-7b4b907b01a9.png)
~~~
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
~~~

### Ingresando datos al final
primero ingreso el 30 y luego el 100


![agregandoalfinal](https://user-images.githubusercontent.com/24881247/38172535-44741a2a-3584-11e8-9f95-3b1e8edd86ff.png)

![agregandoalfinal2](https://user-images.githubusercontent.com/24881247/38172549-75110c42-3584-11e8-884a-a93856f2bf67.png)

~~~
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
~~~
