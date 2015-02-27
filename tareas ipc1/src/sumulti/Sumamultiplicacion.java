package sumulti;

import java.util.Scanner;

public class Sumamultiplicacion {
	public static void main (String [] args){
			int num1=0;
			int num2;
			int num3;
			int num4;
			int num5;
			
			System.out.println("Ingrese 5 números:");
			Scanner s = new Scanner(System.in);
			num1=s.nextInt();
			num2=s.nextInt();
			num3=s.nextInt();
			num4=s.nextInt();
			num5=s.nextInt();
			
			System.out.println("La suma es "+(num1+num2+num3+num4+num5)+ " y la multiplicación es "+ (num1*num2*num3*num4*num5));

			
	}
}
