package com.day4.inheritence;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String dname,type;
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER THE SPECIES NAME");
		dname=sc.nextLine();
		System.out.println("ENTER THE LOCOMOTIVE TYPE");
		type=sc.nextLine();
        LavaDino breed=new LavaDino("Raptors","Land",false);
        breed.display();
        breed=new LavaDino(dname,type,true);
        breed.display();
	}

}
