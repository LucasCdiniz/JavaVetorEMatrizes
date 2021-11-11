package pkgarrays;

import java.util.Scanner;

public class exercicio03 {

	public static void main(String[] args) {
		
/*Leia uma matriz 3 x 3, conte e escreva quantos valores maiores que 10 ela possui.*/
		
		int [][] matriz = new int [3][3];
		int linha, coluna, somaValor=0;
		
		Scanner ler = new Scanner(System.in);
		
		for(linha=0;linha<3;linha++) {
			for(coluna=0;coluna<3;coluna++) {
				System.out.print("Entre com um valor: ");
				matriz[linha][coluna] = ler.nextInt();
				
			}
		}
		
		System.out.println();
		
		System.out.println("A matriz ficará da seguinte forma: ");
		
		for(linha=0;linha<3;linha++) {
			for(coluna=0;coluna<3;coluna++) {
				System.out.print(matriz[linha][coluna] + " ");
			}
			System.out.println("\n");
		}
		
		
		System.out.println();
		
		System.out.println("Números maiores que 10: ");
		
		for(linha=0;linha<3;linha++) {
			for(coluna=0;coluna<3;coluna++) {
				if(matriz[linha][coluna] > 10) {
					System.out.print(matriz[linha][coluna] + " ");
					somaValor++;
				}
			}
			
			System.out.println("\n");
		}
			System.out.println("Existem " + somaValor + " números maiores que 10 inseridos em sua matriz 3x3");
		
		
	}// fim main

}
