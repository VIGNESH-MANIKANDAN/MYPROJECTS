package com.polymorphism.casestudy3;

import java.util.Scanner;

public class Machine 
{
   int sugar;
   public void pushBigButton()
   {
	   System.out.println("Enter the quantity of sugar to be used as ingredient");
	   Scanner s=new Scanner(System.in);
	   this.sugar=s.nextInt();
	   System.out.printf("%d kgs of candy is generated for %d quantity of sugar",(int)(this.sugar/2),this.sugar );
	   
   }
}
