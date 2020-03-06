package soru1;

import java.util.Scanner;

public class pass {

	
	public static void main(String []args) {
		
		String pass ="12345";
		
		 Scanner input = new Scanner(System.in);
	        
	        System.out.println("Şifre: ");
	        
	        String password= input.nextLine();
	        
	        System.out.println("Şifre: " + password);
	        
	       
	            if (password.equals(pass)){
	                System.out.println("Giriş başarılı");
	            }
	            else{
	                System.out.println("Giriş başarısız");
	            }	
		
		
		
	}
}
