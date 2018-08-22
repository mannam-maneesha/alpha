/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{          
		String Rock,paper,Scissor;
		Scanner sc=new Scanner(System.in);
		int p1=sc.nextInt();
	            int p2=sc.nextInt();
	            switch(p1)
	            {
	            	case 1:System.out.println("Rock");
	            	       break;
	            	case 2 :System.out.println("paper");
	            	       break;
	            	default:System.out.println("Scissor");
	            }
	            switch(p2)
	            {
	            	case 1:System.out.println("Rock");
	            	       break;
	            	case 2 :System.out.println("paper");
	            	       break;
	            	default:System.out.println("Scissor");
	            }
	            if(p1==1 && p2==3)
	            {
	            System.out.println("Rock will wins");	
	            }
	            else if(p1==1&&p2==2)
	            {
	            System.out.println("paper will wins");	
	            }
	            else 
	            {
	            System.out.println("Scissor will wins");	
	            }
	 }
}
