import java.util.*;

public class Ejercicio10{

	public static void main(String[] args) {
		//Inicializamos scanner y declaramos variables	
		Scanner scanner = new Scanner(System.in);
		double n,suma, contador, sumaRango;
		suma = 0;
		contador = 0;
		sumaRango = 0;
		

		do {
			System.out.println("Ingrese un numero: ");
			n = scanner.nextDouble();
			suma = suma+n;
			if (n%6==0) {
				contador = contador+1;
				System.out.println("El numero es multiplo de 6: "+n);				
			}
			if (n>0 && n<11) {
				sumaRango = sumaRango+n;
			}
		}
		while (suma<1000);
		System.out.println("La suma total es: "+suma);
		System.out.println("Sumaran del rango entre 1 y 10"+sumaRango);
		System.out.println("El contador  "+contador);
	}	
}