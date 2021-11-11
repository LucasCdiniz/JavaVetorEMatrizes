package pkgarrays;

import java.util.Scanner;

public class exercicio02 {

	public static void main(String[] args) {

/*Faça um programa que receba 6 números inteiros e mostre: 
• Os números pares digitados;  
• A soma dos números pares digitados; 
• Os números ímpares digitados; 
• A quantidade de números ímpares digitados
*/
		
		int [] vetor = new int[6];
		int qtdPar=0, qtdImpar=0, somaPar=0, numImp=0;
		Scanner ler = new Scanner(System.in);
		
		for(int i=0;i<6;i++) {
			System.out.print("Informe os números: ");
			vetor[i] = ler.nextInt();
			
			if(vetor[i]%2==0) {
				somaPar+=vetor[i];
				qtdPar++;
			}else {
				
				qtdImpar++;
			}
		}// fim for
		
		System.out.println();
		System.out.println("Números ímpares informados no vetor são os seguintes: ");
		
		for(int i=0;i<6;i++) {
			if(vetor[i]%2 !=0) {
				System.out.println(vetor[i]);
			}
		}
		
		System.out.println();
		System.out.println("A soma dos números pares é: " + somaPar);
		System.out.println("A quantidade de números pares digitados é de " + qtdPar + " números");
		System.out.println("A quantidade de números ímpares digitados é de " + qtdImpar + " números");
	}

}
