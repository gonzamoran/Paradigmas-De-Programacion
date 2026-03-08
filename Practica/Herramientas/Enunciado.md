# Ejercicio: Herramientas

## Introduccion:

Estamos comenzando a desarrollar un juego similar a World of Warcraft.

Vamos a omitir detalles irrelevantes a los efectos de nuestro ejercicio de modelado y nos enfocaremos en los requerimientos que listo a continuación.

## Contexto:

Los **aldeanos** utilizan herramientas: (1) **Hacha**, (2) **Pico** y (3) **Azada**. Estas herramientas se desgastan cada vez que el aldeano las usa.

El **hacha** se desgasta de forma lineal. Ej.: Primer uso reduce durabilidad en 1. Segundo uso reduce la durabilidad en 2, etc.

El **pico** no se desgasta. 

La **azada** se desgasta siguiendo la sucesión de Fibonacci. Ej.: Primer uso reduce durabilidad en 0, segundo uso reduce la durabilidad en 1, tercer uso reduce la durabilidad en 1, etc. Serie de Fibonacci: 0, 1, 1, 2, 3, 5, 8, 13, 21, ….

Todas las herramientas tienen una durabilidad de 10 unidades.

## Casos de uso:

1. Un aldeano utiliza hacha 3 veces y puede utilizarla una cuarta vez sin ningún problema.
2. Un aldeano utiliza pico 10 veces y puede utilizarla una vez 11.
3. Un aldeano utiliza azada 4 veces y puede utilizarla una 5 vez.
4. Un aldeano utiliza azada 5 veces y la ves 6ta. no la puede utilizar (está gastada).

## Nuevos requisitos:

1. Agregar un herrero que ahora es el encargado de construir las herramientas para realizar su trabajo.
2. El herrero puede reparar cada una de las herramientas. La reparación reduce su uso a 0.
3. El herrero puede templar cada una de las herramientas cambiando la forma en la que se desgastan de la siguiente manera:
    * El Hacha templada pasa a no perder durabilidad.
    * El Pico templado se desgasta al 8vo uso.
    * La Aza templada pasa a perder un punto de durabilidad cada vez que se usa.

## Ayuda:

```s
serieFibonacciElementoNro: n 
	| b a |
	(n = 1) ifTrue: [^0].
	(n <= 3) ifTrue: [^1].
	a := b := 1.
	(n - 2) timesRepeat: [a := b + (b := a)].
	^b.
```