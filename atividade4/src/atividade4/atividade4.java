package atividade4;

import java.util.Scanner;

public class atividade4 {

	public static void main(String[] args) {
		Scanner grava = new Scanner (System.in);
		
		
		int []codigovend = new int [10];
		float []percvend = new float [10];
		float [] totvend = new float [10];
		
		
		for(int x = 0; x<10 ; x++) {
			
			System.out.println("Digite  o c�digo do vendedor " + (x+1) + ":");
			codigovend[x] = grava.nextInt();
			System.out.println("Digite  a comiss�o em porcentagem do vendedor " + (x+1)+":");
			percvend[x] = grava.nextFloat();
			percvend[x] = percvend[x]/100;
			System.out.println("Digite  o total das vendas do vendedor "+ (x+1)+":");
			totvend[x] = grava.nextFloat();
			
			
			
		}
		
		for (int y=0; y<10 ; y++) {
		
		System.out.println("O vendedor de c�digo " + codigovend[y] + " vendeu R$ " + totvend[y] + " e vai receber no total R$ " + (totvend[y]*percvend[y]) );
		}
		
		double menorval = totvend[1];
		double maiorval = 0;
		int maiorcod = 0;
		int menorcod = 0;
		
		for (int z = 0 ; z<10 ; z++ ) {
			
			if((totvend[z]*percvend[z])< menorval) {
				
				menorval=totvend[z]*percvend[z];
				menorcod = codigovend[z];
				
			}
			
			if((totvend[z]*percvend[z])> maiorval) {
				
				maiorval=totvend[z]*percvend[z];
				maiorcod = codigovend[z];
				
			}
			
		}
		
		System.out.println("\nO vendedor de c�digo " + maiorcod + " foi o que mais recebeu: R$ " + maiorval );
		System.out.println("O vendedor de c�digo " + menorcod + " foi o que menos recebeu: R$ " + menorval );
		

		}
		
	}


