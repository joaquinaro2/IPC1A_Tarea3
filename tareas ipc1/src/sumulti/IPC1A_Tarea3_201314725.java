package sumulti;

import java.util.Scanner;

public class IPC1A_Tarea3_201314725 {

	public static void main(String[] args) {
		int num=0;
	
	
	System.out.println("Ingrese un numero:");
	Scanner s = new Scanner(System.in);
	num=s.nextInt();
	
	if(num%2==0){
			System.out.println("El numero "+(num)+" es par");
			} else { 
			System.out.println("El numero "+(num)+" es impar");
			}
		
	

	}

}
