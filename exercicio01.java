package pkgarrays;

public class exercicio01 {

	public static void main(String[] args) {

/*Faça um programa que possua um vetor denominado A que armazene 6 números inteiros. 
 * O programa deve executar os seguintes passos: 
 * 
(a) Atribua os seguintes valores a esse vetor: 1, 0, 5, -2, -5, 7. 

(b) Armazene em uma variável inteira (simples) a soma entre os valores das posições 
	A[0], A[1] e A[5] do vetor e mostre na tela esta soma. 
	
(c) Modifique o vetor na posição 4, atribuindo a esta posição o valor 100. 

(d) Mostre na tela cada valor do vetor A, um em cada linha.
*/
		
		
		int[] vetorA = new int[] {1,0,5,-2,-5,7};
		int soma;
		
		soma = vetorA[0] + vetorA[1] + vetorA[5];
		
		System.out.println("Valores iniciais do vetorA:");
		
		for(int vet:vetorA) {
			System.out.println(vet);
		}
		
		System.out.println();
		System.out.println("A soma das posições A[0], A[1] e A[5] é igual a: " + soma);
		
		vetorA[4]=100;
		System.out.println();
		
		System.out.println("Valores do vetorA após a mudança na posição A[4]:");
		
		for(int vet:vetorA) {
			System.out.println(vet);
		}
		
	}

}
