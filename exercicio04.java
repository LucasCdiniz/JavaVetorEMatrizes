package pkgarrays;

import java.util.Scanner;

public class exercicio04 {

	public static void main(String[] args) {
		
/*Fa�a um programa que leia duas matrizes 2 x 2 com valores reais. Ofere�a ao usu�rio um menu de op��es:
 * 
(1) somar as duas matrizes 
(2) subtrair a primeira matriz da segunda 
(3) adicionar uma constante as duas matrizes
(4) imprimir as matrizes 

Nas duas primeiras op��es uma terceira matriz 2 x 2 deve ser criada. 
Na terceira op��o o valor da constante deve ser lido e o resultado da adi��o da constante deve ser 
armazenado na pr�pria matriz.
*/
		
		float [][] array1 = new float [2][2];
		float [][] array2 = new float [2][2];
		float [][] array3 = new float [2][2];
		
		int linha, coluna, var, op;
		
		Scanner ler = new Scanner(System.in);
		
		for(linha=0;linha<2;linha++) {
			for(coluna=0;coluna<2;coluna++) {
				
				System.out.print("Entre com os valores do vetor 1: ");
				array1[linha][coluna] = ler.nextFloat();
				
				System.out.print("Entre com os valores do vetor 2: ");
				array2[linha][coluna] = ler.nextFloat();
				
				
				
			}// fim for coluna
		} // fim for linha
		
		do {
			
			System.out.println("\n\t\tMenu de Op��es ");
			System.out.println("\n(1) somar as duas matrizes ");
			System.out.println("\n(2) subtrair a primeira matriz da segunda  ");
			System.out.println("\n(3) adicionar uma vari�vel as duas matrizes ");
			System.out.println("\n(4) imprimir as matrizes ");
			System.out.println("\n(5) Sair do programa");
			System.out.println("\nDigite a sua op��o:");
			
			op = ler.nextInt();
			
			switch(op) {
			
			case 1: 
				for(linha=0;linha<2;linha++) {
				for(coluna=0;coluna<2;coluna++) {
					
					array3[linha][coluna] = array1[linha][coluna] + array2[linha][coluna];
					System.out.println("\nA soma � igual a :" + array3[linha][coluna]);
					
				} // fim for coluna
			}// fim for linha
			break;
			
			case 2:
				
				for(linha=0;linha<2;linha++) {
					for(coluna=0;coluna<2;coluna++) {
						
						array3[linha][coluna] = array1[linha][coluna] - array2[linha][coluna];
						System.out.println("\nA subtra��o � igual a :" + array3[linha][coluna]);
						
					} // fim for coluna
				}// fim for linha
				break;
				
			case 3:
				System.out.println("\nInforme um valor: ");
				var = ler.nextInt();
				
				for(linha=0;linha<2;linha++) {
					for(coluna=0;coluna<2;coluna++) {
						
						array1[linha][coluna] = array1[linha][coluna] + var;
						array2[linha][coluna] = array1[linha][coluna] + var;
						
						System.out.println("\nResultado da soma com o vetor 1 :" + array1[linha][coluna]);
						System.out.println("\nResultado da soma com o vetor 2 :" + array2[linha][coluna]);
					} // fim for coluna
				}// fim for linha
				break;
				
			case 4:
				for(linha=0;linha<2;linha++) {
					for(coluna=0;coluna<2;coluna++) {
						
						System.out.println("\nVetor 1 :" + array1[linha][coluna]);
						System.out.println("\nVetor 2 :" + array2[linha][coluna]);
					} // fim for coluna
				}// fim for linha
				break;
			case 5:
				System.out.println("\nObrigado e volte sempre!");
				break;
				default:
					System.out.println("\nOp��o inv�lida\nDigite uma outra op��o");
				
			}//fim switch
			 
			
		}while(op!=5);
		
		
	}// fim main

}// fim class
