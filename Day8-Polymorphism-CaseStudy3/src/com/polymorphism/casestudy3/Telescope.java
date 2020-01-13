package com.polymorphism.casestudy3;

import java.util.Scanner;

public class Telescope 
{
   int[][] pattern;
   public void pushBigButton()
   {
	  
	   int n;
	   System.out.println("Please enter number of stars in your constellation  ");
	   Scanner s=new Scanner(System.in);
	   n=s.nextInt();
	   pattern=new int[n][2];
	   System.out.println("Please feed me the co-ordinates of stars(x,y)");
	   for(int i=0;i<n;i++)
	   {
		   System.out.println("Please enter the x,y coordinated of start-"+i+1);
		   pattern[i][0]=s.nextInt();
		   pattern[i][1]=s.nextInt();
	   }
	   System.out.println("Here is your Information about the co-ordinates of your constellation of stars\n=================================\n\tlat\tlon\n");
	   for(int i=0;i<n;i++)
	   {
		   System.out.printf("\nStart-%d\t%d\t%d",i+1,pattern[i][0],pattern[i][1]);
	   }
	   
   }
}
