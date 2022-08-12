package com.bridgelabz;
import java.util.Scanner;

public class Uc4LineComp {
	
	
        static float line1() {
        	 
        	Scanner sc = new Scanner(System.in);
    		System.out.println(" for line 1 :");
    		float x1,x2,y1,y2;
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
    		return length1;
        }
        
          static float line2() {
        	  Scanner sc = new Scanner(System.in);
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
      		return length2;
      		
          }
        
          public void compareTo(float l1, float l2) {
      		if (l1 > l2)
      			System.out.println("line 1 greater");
      		else if 
      		    (l1 < l2)
      		{
      			System.out.println("line 2 is greater");
      		}
      		else {
      			System.out.println("they are equal");
      		}
      	
      	} 
          public static void main(String[] args) {
        	  // TODO Auto-generated method stub
        	  
        	  Uc4LineComp uc4 = new Uc4LineComp();
        	  float length1 = uc4.line1();
        	  System.out.println("length of line 1 is : " +length1);
        	  float length2 = uc4.line2();
        	  System.out.println("Length of line 2 is : "+length2);
        	  
        	  uc4.compareTo(length1 , length2);
        	 
          }
}
          
          
          
          
          
          
          
          
          
          
          
          
          
          
        
        
        
        
        
        
        
        
        
        
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
