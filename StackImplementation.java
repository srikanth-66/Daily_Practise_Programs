package com.stack.queue.programs;

class Stack
{
	int top;   
	int maxsize = 10;  
	int[] arr = new int[maxsize];  
  
  
	boolean isEmpty()  
	{  
		return (top < 0);  
	}  
	Stack()  
	{  
		top = -1;  
	} 
	public void pushStackElements(int data)
	{
		if(top==maxsize-1)
			System.out.println("Stack is  overflow");
		else
		{
			top++;
			arr[top]=data;
			System.out.println("Item pushed to stack Array  " +"["+ data+"]");
		}
		
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
		
	}
	public void display()
	{
		System.out.println("Stack array elemts are:");
		for(int i=top;i>=0;i--)
		{
			System.out.println("["+arr[i]+"]");
		}
	}
}
public class StackImplementation //using Arrays
{
	public static void main(String[] args)
	{
		Stack s=new Stack();
		s.pushStackElements(10);
		s.pushStackElements(100);
		s.pushStackElements(1000);
		s.pushStackElements(10000);
		s.pushStackElements(100000);
		s.display();
		s.popStackElements();
		s.display();	
	}
	
}

