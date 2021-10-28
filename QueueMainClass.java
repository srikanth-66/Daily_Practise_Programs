package com.stack.queue.programs;

public class QueueMainClass 
{
	public static void main(String[] args) 
	{
		QueueImplementaion q=new QueueImplementaion();
		q.dis();
		q.enque(10);
		q.enque(100);
		q.enque(1000);
		q.enque(10000);
		q.enque(100000);
		System.out.println("Displaying Queue Elemnts");
		q.dis();
		System.out.println("After deleting element remaining values are:");
		q.deque();
		System.out.println();
		q.dis();
		System.out.println("after adding to the queue ");
		q.enque(12);
		System.out.println();
		q.dis();
		System.out.println();
		q.enque(0);
		
	}


}
