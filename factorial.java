package com.type1;

import java.util.Scanner;


// factorial 5! == 5!*4!*3!*2!*1! ==

public class Facgtorial {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number");
		int n=sc.nextInt(); //5
		
		int ans=1;  
		
		while(n>0) //loop start  1=5>0  true
			       //2 iteration 2=4>0  true
			       //3 iteration 3=3>0  true
			       //4 iteration 4=2>0  true
			       //5 iteration 5=1>0  true
			       //6 iteration 5=0>0  false
		{
			ans=ans*n; // 5=1*5   
			           // 20=5*4
			           // 60=20*3
			           //120=60*2
			           //120=120*1
			
			
			
			n=n-1;     //4=5-1
			           //3=4-1
			           //2=3-1
			           //1=2-1
			           //0=1-1
			
		}
		
		System.out.println("factorial="+ans);
		
	}

}