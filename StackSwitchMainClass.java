package com.stack.queue.programs;

import java.util.Scanner;

public class StackSwitchMainClass 
{
	public static void main(String[] args) 
	{
		StackSwitchClass st=new StackSwitchClass();
		Scanner sc=new Scanner(System.in);
		int choice;
		do 
		{
			System.out.println("Enter choice=1 "+"\t"+"for pushing elemnts");
			System.out.println("Enter choice=2 "+"\t"+"for pop or deleting top elemnt");
			System.out.println("Enter choice=3 "+"\t"+" for displaying Stack  elemnts");	
			System.out.println("Enter the choice");
			choice=sc.nextInt();
			switch(choice)
			{
				case 1:
						st.pushStackElements(sc);
						break;
				case 2:							
						st.popStackElements();
						break;
				case 3: 
						st.display();
						break;
				default:System.out.println("Warning:Please select Mentioned Choice");
						break;
			}
	
		}while(choice!=4);

	}


}
