package soru5;

import java.util.Random;

public class soru5 {
	
	public static void main(String[]args) {
		
		int[] array=new int[100];
		
		Random rn=new Random();
		
		for (int i=0;i<100;i++) {
		
			array[i]=rn.nextInt(100)+1;
		
			if(array[i]%2==0)
			{
				System.out.println((i+1)+".sayı= "+array[i]+" = Çift");
			}
			else
			{
				System.out.println((i+1)+".sayı= "+array[i]+" = Tek");
			}
		}
	}
}
