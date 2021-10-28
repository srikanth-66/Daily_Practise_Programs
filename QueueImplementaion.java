package com.stack.queue.programs;

public class QueueImplementaion
{
	static int front=-1;
		static int rear=-1;
		int max=5;
		int []arr=new int[max];
				
		boolean isEm()
		{
			return (front==-1 &&rear==-1);
		}
		QueueImplementaion()
		
		{
			front=rear=0;
		}
		public void enque(int data)
		{
			if(max==rear)
				System.out.println("queue full");
			else
			{
				arr[rear]=data;
				rear++;			
			}
		}
		public void deque()
		{
			if(front==rear)
				System.out.println("queue is empty");
			else
			{
				System.out.println("deque or deleted elemnt is:"+arr[front]);
	            for (int i = 0; i < rear - 1; i++) 
	            {
	                arr[i] = arr[i + 1];
	            }
	            rear--;
	        }

		}
		public void dis()
		{
			if(front==rear)
				System.out.println("queue is empty");
			
			
			for(int i=front;i<rear;i++)
			{
				System.out.println(arr[i]);
			}
			
			
		}
	}


