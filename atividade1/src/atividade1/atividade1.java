package atividade1;

import java.util.Scanner;

public class atividade1 {

	public static void main(String[] args) {
		Scanner grava = new Scanner (System.in);
		
		int []pecas = new int[10];
		double []valor = new double[10];
		double total = 0;
		int y = 0;
		
		for(int x = 0 ;x <10 ; x++) {
			
			System.out.println("Digite a quantidade de peças vendidas pelo vendedor " + (x+1));
			pecas[x] = grava.nextInt();
			System.out.println("Digite o preço das peças do vendedor " + (x+1));
			valor[x] = grava.nextDouble();
			total+=pecas[x];
			
		}
		
		for(int i = 0 ; i<10 ; i++) {
			
			System.out.println("O vendedor " + (i+1) + " vendeu "+ pecas[i]+ " peça(s),  totalizando R$ " + (valor[i]*pecas[i] ) );
			
		}
		
		System.out.println("O total de peças vendidas foi: " + total);

	}

}
