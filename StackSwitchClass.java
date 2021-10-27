package com.stack.queue.programs;

import java.util.Scanner;

public class StackSwitchClass
{
	int top;   
	int maxsize=5;  
	int[] arr = new int[maxsize];  
  
	boolean isEmpty()  
	{  
		return (top < 0);  
	}  
	StackSwitchClass()  
	{  
		top = -1;  
	} 
	public void pushStackElements(Scanner sc)
	{
		if(top==maxsize-1)
			System.out.println("Stack is  overflow");
		else
		{
			System.out.println("enter the number of elemnts you want to push");
			int number=sc.nextInt();
			
			if(maxsize>number-1)
			{	
				for(int i=top;i<=number-1;i++)
				{
					System.out.println("enter value");
					int data=sc.nextInt();
					top++;
					arr[top]=data;
					System.out.println("Item pushed to stack Array  " +"["+ data+"]");

				}	
			}
			else
			{
				System.out.println("Array size is "+maxsize+" and array starts from 0 ");
				System.out.println("entered size is "+number+" and it should be "+number+"-1"+" only");
			}						
		}
		System.out.println("_______________________________________________________");
	}
	public void popStackElements()
	{
		if(top==-1)
			System.out.println("Stack is Underflow");
		else
		{
			System.out.println("elemnt is poped from the Stack Array  "+"[" +arr[top]+"]");
			top--;
		}
		System.out.println("_______________________________________________________");

	}
	public void display()
	{
		System.out.println("Stack array elemts are:");
		for(int i=top;i>=0;i--)
		{
			System.out.println("["+arr[i]+"]");
		}
		System.out.println("_______________________________________________________");
	}

}

