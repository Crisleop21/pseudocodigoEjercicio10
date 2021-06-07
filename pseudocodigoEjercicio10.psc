Algoritmo pseudocodigoEjercicio10
Repetir
	Escribir "Ingrese un numero : "
	Leer N
	suma=suma+N
	Si N MOD 6 == 0 Entonces
		contador=contador+1
		Escribir "El numero es multiplo de 6: ",N
		
	FinSi
	Si N>0 Y N<11 Entonces
		
		sumaRango=sumaRango+N
	FinSi
Hasta Que suma>=1000

Escribir "La suma total es: ",suma
Escribir "Sumaran del rango entre 1 y 10",sumaRango
Escribir "El contador  ",contador
	
FinAlgoritmo
