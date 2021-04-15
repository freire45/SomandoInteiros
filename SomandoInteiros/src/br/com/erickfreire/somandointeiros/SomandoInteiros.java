package br.com.erickfreire.somandointeiros;

/**
 * Programa que soma inteiros usando um laço for
 * @author Erick Freire
 * @version 1 - Criado em 15-04-2021 as 15:00
 */

public class SomandoInteiros {
	public static void main(String[] args) {
		int total = 0;
		
		for(int numero = 2; numero <= 20; numero += 2) {
			total += numero;
			
			System.out.printf("A Soma é: %d%n", total);
		}
	}

}
