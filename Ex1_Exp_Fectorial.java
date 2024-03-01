package com.sun;

import java.util.Scanner;
import java.lang.Math;

public class Ex1_Exp_Fectorial {

	public static void main(String[] args) {

		int num;
		int fect;
		double exp;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter an integer number");
		num = input.nextInt();
		
		while (num > -1) 
		{	
		fect = fectorial(num);
		exp = exp(num);
		System.out.println("The fectorial of "+num+" is "+fect);
		System.out.println("The exponential of "+num+" is "+exp);
		
		System.out.println("\nEnter an integer number");
		num = input.nextInt();
		}
		
		if(num < 0)
			System.out.println("\nBye Bye !!!");

		input.close();


	}
	
	public static int fectorial(int num)
	{
		int fect = 1;
		
		if(num == 0)
		{
			fect = 1;
			return fect;

		}
		else
		{
		  for(int i=0 ; i<num ; i++)
		  {
			fect *= num-i;
		  }
		  return fect;
		}
	}

	public static double exp(int num)
	{
		double exp = 1;
	    int fect = 0; 	
		 for(int i=1 ; i<6 ; i++)
		  {
			fect = fectorial(i);
			exp += (Math.pow(num,i) / fect);
			//System.out.println(num+"^"+i+" / "+fect);
			//System.out.println(exp);
		  }
		  return exp;
		  
	}

}
