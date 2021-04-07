package atividade2;

import java.util.Scanner;

public class atividade2 {

	public static void main(String[] args) {
		
Scanner grava = new Scanner (System.in);
		
		int []a = new int[5];
		int []b = new int[5];
		int []c = new int[5];
		
		int y = 4;
		
		for(int x = 0 ;x <5 ; x++) {
			
			System.out.println("Digite o valor " + (x+1) + " de A" );
			a[x] = grava.nextInt();
			System.out.println("Digite o valor " + (x+1) + " de B" );
			b[x] = grava.nextInt();
			
			
		}
		
		for(int z = 0; z<5 ; z++) {
			
			c[z] = (a[z]-b[y]);
			y--;
			
			System.out.println("A subtração do valor " + (z+1) + " de A pelo valor " + (y+2) + " de B é igual a: " + c[z]);
			
		}

	}

}
