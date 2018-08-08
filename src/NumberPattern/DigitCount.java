package NumberPattern;

import java.util.Scanner;

public class DigitCount {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number");
		int number=sc.nextInt();
		if(number!=0)
		{   
			int count=0;
			while(number>0)
			{
				int rem=number%10;
			    number=number/10;
			    count=count+1;
			}	
			System.out.println("you have entered "+count+" digit number");
		}
		
	}
}

