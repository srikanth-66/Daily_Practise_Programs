package com.sorting.programs;

public class SelectionSort 
{
	public void slectionSortCode(int numbers[],int len)
	{
		int i,j;
		for (i=0;i<len-1;i++)
		{
			for (j=i+1;j<len-1;j++)
			{
				if(numbers[j]<numbers[i])
				{
					int temp = numbers[j];
					numbers[j]=numbers[i];
					numbers[i]=temp;

				}
			}
		}
	}
	public void display(int num[])
	{
		int len=num.length;
		for(int i=0;i<len-1;i++)
		{
			for(int j=0;j<len-1;j++)
			{
			}
			System.out.print(num[i]+" ");
		}
		
		System.out.println();
	}
	public static void main(String[] args) 
	{
		int []numbers= {5,9,7,1,2,7,4,8,3,6};
		SelectionSort ss=new SelectionSort();
		int len=numbers.length;
		System.out.println("Before Slection Sort the elements are:");
		ss.display(numbers);
		ss.slectionSortCode(numbers,len);
		System.out.println("After selection sort:");
		ss.display(numbers);
	}

}
