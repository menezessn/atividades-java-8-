package atividade3;

import java.util.Scanner;

public class atividade3 {

	public static void main(String[] args) {
		Scanner grava = new Scanner (System.in);
		
		double []preco = new double [5];
		int [] cod = new int [5];
		float soma = 0;
		float divisao = 0;
		
		int contmenor = 0, contmedio= 0, contmaior = 0 ;
		
		
		for(int x = 0 ; x<5 ; x++) {
			
			System.out. println("Digite o valor do produto " +(x+1) );
			preco[x] = grava.nextDouble();
			System.out. println("Digite o c�digo do produto " +(x+1) );
			cod[x] = grava.nextInt();
			
			if(preco[x]<50) {
				
				System.out.println("Pre�o menor que R$50,00");
				contmenor++;
			}
			if(preco[x]>=50 && preco[x]<=100) {
				
				System.out.println("Pre�o entre R$50,00 e R$100,00");
				contmedio++;
			}
			if(preco[x]>100) {
				
				System.out.println("Pre�o maior que R$100,00");
				contmaior++;
				
			}
			}
			
			System.out.println(contmenor + " produtos custam menos que R$50,00");
			System.out.print("\nOs c�digos dos produtos que custam entre R$50,00 e R$100,00 s�o: ");
			
			for(int y=0 ; y<5; y++) {
				
				if(preco[y] >=50 && preco[y]<=100) {
					
					System.out.print( cod[y]+" / ");
					
				}
				
				
			}
			
	
			for(int z = 0; z<5 ; z++) {
				
				if(preco[z]>100) {
					
					soma+=preco[z];
					divisao++;
					
				}
				
			}
			
			System.out.println("\nA m�dia de pre�o dos produtos acima de R$100,00 � R$" + (soma/divisao) );
			
		

	}

}
