/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
public class test
{
	public static void main (String[] args) 
	{
		// your code goes here
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		for (int i = 0; i < t; i++) {
		    String a = scan.next();
		    String b = scan.next();
		    int n = a.length();
		    
		    int min = 0, max = 0;
		    for (int j = 0; j < n; j++) {
		        char aJ = a.charAt(j);
		        char bJ = b.charAt(j);
		        
		        if (aJ != '?' && bJ != '?' && aJ != bJ) {
		            min += 1;
		            max += 1;
		        } else if (aJ == '?' || bJ == '?') {
		            max += 1;
		        }
		    }
		    System.out.println(min + " " + max);
		}
	}
}


    
