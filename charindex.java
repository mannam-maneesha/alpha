/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here'
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		int d=sc.nextInt();
		String h=new StringBuffer(s).reverse().toString();
		char f[]=h.toCharArray();
		d=d-1;
		for(int i=0;i<f.length;i++)
		{
			if(i==d)
			{
			    System.out.println(f[i]);
		    }
		}
	}
}
