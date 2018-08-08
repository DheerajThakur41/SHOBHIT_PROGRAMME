package NumberPattern;

import java.util.Scanner;

public class CheckEvenNo {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number");
		int number=sc.nextInt();
		int count=0;
		
			if(number%2==0)
			{
				System.out.println(number+  "Is even no");
			}
			else
			{
				System.out.println(number+ "Is  not even no");
			}
	}

}
