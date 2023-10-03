package es_marquesdecomares.daw.ed;

import java.util.Scanner;

public class HolaMundo {

	public static void main(String[] args) {
		System.out.println("Soy Alejandro Esteban");
		System.out.println("Soy Sergio Arroyo");
		System.out.println("WEnas");

		int num, sumneg = 0, sumpos = 0, repeat;
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("¿Cuantos numeros vas a sumar?");
		repeat = sc.nextInt();
		System.out.println("Dame un número");
		for (int i = 0; i < repeat; i++) {

			num = sc.nextInt();
			if (num < 0) sumneg += 1;
			if (num > 0) sumpos += 1;
			
	}
		System.out.println("Se han introducido " + sumpos + " números positivos");
		System.out.println("Se han introducido " + sumneg + " números negativos");
	}
	
}
