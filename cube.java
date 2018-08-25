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
		int l=sc.nextInt();
		int b=sc.nextInt();
		int w=sc.nextInt();
	    int	tsr=2*(l*b+b*w+w*l);
	    int vol=l*b*w;
	    System.out.println(tsr+" "+vol);
	    
	}
}
