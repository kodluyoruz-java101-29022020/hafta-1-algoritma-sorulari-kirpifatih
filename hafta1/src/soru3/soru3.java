package soru3;

import java.util.Random;

public class soru3 {
	
	public static float average(int[] number){
		int count=0;
		for(int i=0;i<number.length;i++) {
			count+=number[i];
		}
		return count/number.length;
	}
	public static void main(String[]args) {
		
		int[] array=new int[100];
		
		Random rn=new Random();
		
		for (int i=0;i<100;i++) {
			
			array[i]=rn.nextInt(100)+1;
			
			System.out.println((i+1)+".sayı:"+array[i]);
		}
		System.out.println("Average:"+average(array));
	}
}
