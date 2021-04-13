package com.selenium.ssp;

public class New {

	public static void main(String[] args)
	{
		int i=12345;
		               
		
		       long rev =0;
		       
		       while(i!=0) {
		    	   rev = rev*10 + i%10;
		    	   i = i/10;
		       }
		       
		       System.out.println("Reverse Integer number: "+rev);
	}

}
