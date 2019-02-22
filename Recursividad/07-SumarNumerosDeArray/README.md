#### Primer método 

```java
	public static Integer sumarNumeros(List<Integer> v){
		if(v.size() == 1 ) return v.get(0);
		Integer value = v.get(0);
		v.remove(0);
		return value + sumarNumeros(v);
	}
```
Lógica:
> Primero verifica si el vector tiene un solo elemento,si es asi retorna el valor en la posicion 0

> Si hay mas de un elemento en el vector entonces guardo el elemento de la posición "0" en una variable.

> Borro el elemento de posición cero del vector

> Retorno el valor guardado sumado con el mismo método con parámetro el vector (el cual ya no tiene el elemento de posición cero)

#### Segundo método 

```java
	public static Integer sumarNumeros(List<Integer> v, int n){
		n--;
		if(n == 0 ) return v.get(n);
		return v.get(n) + sumarNumeros(v,n);
	}
```
Lógica:
> Primero disminuyo el parametro n (tamaño del vector) en 1

> Si n vale 0 retorno el valor del vector en la posicion n

> Retorno el valor del vector en la posición n y le sumo el mismo método con el vector y el valor n como parámetros;
