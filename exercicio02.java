package pkgarrays;

import java.util.Scanner;

public class exercicio02 {

	public static void main(String[] args) {

/*Fa�a um programa que receba 6 n�meros inteiros e mostre: 
� Os n�meros pares digitados;  
� A soma dos n�meros pares digitados; 
� Os n�meros �mpares digitados; 
� A quantidade de n�meros �mpares digitados
*/
		
		int [] vetor = new int[6];
		int qtdPar=0, qtdImpar=0, somaPar=0, numImp=0;
		Scanner ler = new Scanner(System.in);
		
		for(int i=0;i<6;i++) {
			System.out.print("Informe os n�meros: ");
			vetor[i] = ler.nextInt();
			
			if(vetor[i]%2==0) {
				somaPar+=vetor[i];
				qtdPar++;
			}else {
				
				qtdImpar++;
			}
		}// fim for
		
		System.out.println();
		System.out.println("N�meros �mpares informados no vetor s�o os seguintes: ");
		
		for(int i=0;i<6;i++) {
			if(vetor[i]%2 !=0) {
				System.out.println(vetor[i]);
			}
		}
		
		System.out.println();
		System.out.println("A soma dos n�meros pares �: " + somaPar);
		System.out.println("A quantidade de n�meros pares digitados � de " + qtdPar + " n�meros");
		System.out.println("A quantidade de n�meros �mpares digitados � de " + qtdImpar + " n�meros");
	}

}
