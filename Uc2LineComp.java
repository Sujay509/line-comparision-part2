package com.bridgelabz;
import java.util.Scanner;
public class Uc2LineComp {
	public static void main(String args[]) {
		float x1, x2, y1, y2;
		Scanner sc = new Scanner(System.in);
		System.out.println(" for line 1 :");
		System.out.print("Enter the value of x1 : ");
		x1 = sc.nextFloat();
		System.out.print("Enter the value of y1 : ");
		y1 = sc.nextFloat();
		
		System.out.print("Enter the value of x2 : ");
		x2 = sc.nextFloat();
		System.out.print("Enter the value of y2 : ");
		y2 = sc.nextFloat();
		
		float length1;
		
		length1 = (float)Math.sqrt(((x2-x1)*(x2-x1))+((y2-y1)*(y2-y1)));
		
		
		
//		line 2
		System.out.print("Length of L1 is : "+length1);
		float x3, x4, y3, y4;
		System.out.println(" for line 2 :");
		System.out.print("Enter the value of x3 : ");
		x3 = sc.nextFloat();
		System.out.print("Enter the value of y3 : ");
		y3 = sc.nextFloat();
		
		System.out.print("Enter the value of x4 : ");
		x4 = sc.nextFloat();
		System.out.print("Enter the value of y4 : ");
		y4 = sc.nextFloat();
		
		float length2;
		
		length2 = (float)Math.sqrt(((x4-x3)*(x4-x3))+((y4-y3)*(y4-y3)));
		
		System.out.println("Length of L2 is : "+length2);
		
		
		if (length1 == length2)
			System.out.println("both are equal");
		
		else {
			System.out.println("they are not equal");
		}
		
	    sc.close();
	}
}
