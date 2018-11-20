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
		String s;
		int n;
		Scanner sc=new Scanner(System.in);
		s=sc.next();
		n=sc.nextInt();
		String h=new StringBuffer(s).reverse().toString();
		char f[]=h.toCharArray();
		n=n-1;
		for(int i=0;i<f.length;i++)
		{
			if(i==n)
			{
				System.out.println(f[i]);
			}
		}
		
	}
}
