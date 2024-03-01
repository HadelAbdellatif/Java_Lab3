package com.sun;

public class Ex2_PerfectNumber {

	public static void main(String[] args) {

		boolean PerfectNum = false;
		
		for(int i=1 ; i<1000 ; i++)
		{
			PerfectNum = isPerfectNumber(i);
			if(PerfectNum == true)
				System.out.println(i+" is perfect number");
			else
				System.out.println(i+" is not perfect number");

		}
	}
	
	public static boolean isPerfectNumber(int num)
	{
		int sum = 0;
		for(int i=1 ; i<num ; i++)
		{
			if(num % i == 0)
			{
				sum += i;

			}
		}
		
		if (sum == num)
		    return true;
		
		else
			return false;
			
	}

}
