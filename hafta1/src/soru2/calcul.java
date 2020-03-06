package soru2;

import java.util.Scanner;

public class calcul {
	public static void main(String []args) {
		
		int firstCount , secondCount;
		
		
		Scanner input = new Scanner(System.in);
		System.out.println("1. sayıyı giriniz: ");
		
		firstCount=input.nextInt();
		
        System.out.println("2. sayıyı giriniz: ");
		
		secondCount=input.nextInt();
		
		int process ,result;
		System.out.println("Toplama işlemi için 1'e, çıkarma işlemi için 2'ye, çarpma için 3'e ve bölme işlemi için 4'e basınız.");

		process=input.nextInt();
		
		switch(process) {
		
		case 1: 
			result = firstCount + secondCount;
			System.out.printf("Toplama  sonuç=%d",result);
			
			break;
		case 2: 
			result = firstCount - secondCount;
			System.out.printf("Çıkarma  sonuç=%d",result);
			
			break;
		case 3: 
			result = firstCount * secondCount;
			System.out.printf("Çarpma  sonuç=%d",result);
			
			break;
		case 4: 
			result = firstCount / secondCount;
			System.out.printf("Bölme  sonuç=%d",result);
			
			break;
			default:
				System.out.println("yanlış giriş yapıldı yeni değer girin. ");
				break;
		}
		
	}

}
