import java.util.*;


 class checknum
 {
 	public static void main(String args[])
 	{ 
 	   int num;
		System.out.println("enter the number");
		Scanner Input=new Scanner(System.in);
		num=Input.nextInt();
		if(num>0)
		{
			System.out.println("the number is positive ");
		}
		else if(num==0)
		{
			System.out.println("the number is zero");
		}
    	else
		{
			System.out.println("the number is negative");
		}
		}
 }
