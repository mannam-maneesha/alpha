/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int f=0;
		for(int i=2;i<n;i++)
		{
			if(n%i==0)
			{
			 f=1;
			 break;
			}
		}
	if(f==1)
	{
		System.out.println("yes");
	}
	else
	{
		System.out.println("no");
	}
	}
}
