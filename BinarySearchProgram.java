package com.searching.algorthims;

import java.util.Scanner;

public class BinarySearchProgram 
{
	public static  void binarySearchAlgorithm(int arr [],int element)
	{
		int arrayLength=arr.length;
		int low=0,high=arrayLength,mid;
		while(low<high)
		{
			mid=low+(high-low)/2;
            if (arr[mid] == element)
            	System.out.println("the elemnt found at "+ mid+" index"+" the elemnt is "+arr[mid]);
            // If x greater, ignore left half
            if (arr[mid] < element)
                low = mid + 1;
 
            // If x is smaller, ignore right half
            else
                high = mid - 1;

		}
		
	}
		
	public static void main(String[] args)
	{
		Scanner sc=new Scanner (System.in);
		//unsorted Array
		int array []= new int []{10,56,89,56,42,70,12};
		System.out.println("Array Elemnts are:");
		for(int i=0;i<array.length;i++)
		{
			System.out.print(array[i]+" ");
		}
		System.out.println("Sorted Array elemnts are:");
		for(int i=0;i<array.length;i++)
		{
			for(int j=i+1;j<array.length;j++)
			{
				if(array[i]>array[j])
				{
					int temp=array[i];
					array[i]=array[j];
					array[j]=temp;
				}
			}
			System.out.print(+array[i]+" ");
		}
		int []array1=array;
		System.out.println("enter the elemnt to search:");
		int searchElemnt=sc.nextInt();
		
		binarySearchAlgorithm(array1,searchElemnt);
		
	}

}