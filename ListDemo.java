package com.linkedlist;

public class ListDemo
{
	  public static void main(String[] args)
	    {  
	          
	    	LinkedListNodeCreation sList = new LinkedListNodeCreation();  
	          
	        sList.addNode(100);  
	        sList.addNode(10);  
	        sList.display();
	        sList.addFirst(5);
	        sList.display();
	        sList.addInGivenPos(sList.head.next,3);
	        sList.display();
	        sList.addLast(99);
	        sList.display();

	    }  
	

}
