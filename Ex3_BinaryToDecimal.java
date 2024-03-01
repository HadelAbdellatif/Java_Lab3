package com.sun;

import java.util.Scanner;

public class Ex3_BinaryToDecimal {

	public static void main(String[] args) {

		int num;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a Binary number");
		num = input.nextInt();
		
		while(num >-1)
		{
			BinarToDicimal(num);
			System.out.println("\nEnter a Binary number");
			num = input.nextInt();
		}
		
		input.close();

		
	}
	
	public static void BinarToDicimal(int num)
	{
		int NumOfDigits = 0;
		int num2 = num;
		int num3 = num;
		int sum = 0;
		int digit;
		
		while(num2 != 0)
		{
			NumOfDigits+=1;
			num2/=10;
		}
		
		//System.out.println("Number of digits is "+NumOfDigits);
		
		
		for(int i=0 ; i<NumOfDigits ; i++)
		{
			digit = num % 10;
			sum += (digit*Math.pow(2, i));
			num/=10;
		}
		
		System.out.println("The dicimal number of  "+num3+" is "+sum);

	}

}
