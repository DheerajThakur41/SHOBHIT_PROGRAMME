package starPattern;

public class HALFREVERSEPYRAMID {

	public static void main(String[] args)
	{   
		for (int i = 1; i <=3; i++) 
		{   
		for (int j =1; j <=i-1; j++)
			 {
				System.out.print(" ");
				}
		
			for (int j =5; j >=(i*2)-1; j--)
			{
				System.out.print("*");
			}
			System.out.println();
				
				 }	
			
		
		
	}

}
