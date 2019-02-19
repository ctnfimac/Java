

## Lógica 

> Si el número ingresado es el 789 entonces la lógica para invertirlo
  seria hacer 900 + 80 + 7 = 987.
  si descomponemos quedaría: 

` 9 * 10^2  *+*  8 * 10^1  *+*  7 `       
` 789 % 10 * 10^2  *+*  78 % 10 * 10^1  *+*  7 `     
` 789 % 10 * 10^(n1 - 1) *+*  78 % 10 * 10^(n2 - 1)  *+*  7 `     

- recordar que el módulo de un número (789 % 10) da el resto o sea en este caso 9.

- n1 es la cantidad de digitos de 789,
- n2 es la cantidad de dígitos de 78,
- el 7 está solo (no se le multiplica por 10^0) por que al ser el último número solo se lo retorna lo cual tambien indica la finalización de la recursividad.
