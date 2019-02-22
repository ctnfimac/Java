```java
	public static Integer MultiplicarElementos(List<Integer> v){
		if(v.size() == 1 ) return v.get(0);
		Integer value = v.get(0);
		v.remove(0);
		return value * MultiplicarElementos(v);
	}
```
Lógica:
> Primero verifica si el vector tiene un solo elemento,si es asi retorna el valor en la posicion 0

> Si hay más de un elemento en el vector entonces guardo el elemento de la posición "0" en una variable.

> Borro el elemento de posición cero del vector

> Retorno el valor guardado multiplicado con el mismo método con parámetro el vector (el cual ya no tiene el elemento de posición cero)
