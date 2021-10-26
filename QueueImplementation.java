package com.stack.queue.programs;
class Queue
{
	int front,rear;
	int max=5;
	int [] queueArray=new int[max];
	
	boolean isEmpty()
	{
		return (front==0 && rear==0);
	}
	Queue()
	{
		front=rear=0;
	}
	public void enqueElemnts(int data)
	{
		if(max==rear)
			System.out.println("queue full");
		else
		{
			queueArray[rear]=data;
			rear++;
			
		}
	}
	public void dequeElemnts()
	{
		if(front==rear)
			System.out.println("queue is empty");
		else
		{
			System.out.println("deleted elemnt is :"+queueArray[front]);
            for (int i = 0; i < rear - 1; i++) 
            {
            	queueArray[i] = queueArray[i + 1];
            }
 
            rear--;
        }

	}
	public void displayQueue()
	{
		for(int i=front;i<rear;i++)
			System.out.println(queueArray[i]);
	}

}
public class QueueImplementation 
{
	public static void main(String[] args) 
	{
		Queue q=new Queue();
		System.out.println("queue is empty "+ q.isEmpty());
		q.enqueElemnts(10);
		q.enqueElemnts(100);
		q.enqueElemnts(1000);
		q.enqueElemnts(10000);
		q.enqueElemnts(100000);
		System.out.println("Queue elemnts are:");
		q.displayQueue();
		q.dequeElemnts();
		System.out.println("after first dequeue elements  remaining in queue are:");
		q.displayQueue();
		System.out.println("again adding removed elemnt");
		q.enqueElemnts(10);
		q.displayQueue();
		q.enqueElemnts(100);
		q.enqueElemnts(1);
	
	
	}
	

}
