import java.util.*;
import java.io.*;
import java.lang.*;
class Ourexception extends Exception
{
	Ourexception()
	{
		System.out.println("Error");
	}
	Ourexception(int x)
	{
	System.out.println("Error"+x);
	}
}
class Excepuser
{
	public static void main(String args[])throws Ourexception
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
			
		try
		{
		int a=sc.nextInt();
			if(a<0)
			throw new Ourexception();
			if(a>10 && a<20)
			throw new Ourexception(1000);
		}catch(Exception e)
			{
		}
	}
}