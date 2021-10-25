package com.linkedlist;

public class LinkedListNodeCreation 
{
	class Node
	{
		int data;
		Node next;
		
		public Node(int data)
		{
			this.data=data;
			this.next=null;
		}
	}
	
		public Node head=null;
		public Node tail=null;
		
		public void addNode(int data)
		{
			Node newNode=new Node(data);
			
			if(head==null)
			{
				head=newNode;
				tail=newNode;
			}
			else
			{
				tail.next=newNode;
				tail=newNode;	
			}
		}
		
		public void addFirst(int new_data)
		{
		    Node new_node = new Node(new_data);
		    new_node.next = head;
		    head= new_node;
		}
		
		public void addInGivenPos(Node prev_node, int new_data)
		{
		    if (prev_node == null)
		    {
		        System.out.println("The given previous node cannot be null");
		        return;
		    }
		    Node new_node = new Node(new_data);
		    new_node.next = prev_node.next;
		    prev_node.next = new_node;
		}
		
		public void addLast(int new_data)
		{
		    Node new_node = new Node(new_data);
		    
		    if (head== null)
		    {
		        head = new Node (new_data);
		        return;
		    }
		    
		    new_node.next = null;
		    Node last = head;
		    while (last.next != null)
		    {
		        last = last.next;
		    }
		    last.next = new_node;
		    return;
		}
		
		public void display()
		{
			Node cu=head;
			
			if(head==null)
			{
				System.out.println("list is empty");
			}
			while(cu!=null)
				{
					System.out.println(cu.data);
					cu=cu.next;	
				}
				 System.out.println(); 
		} 
		      
}
