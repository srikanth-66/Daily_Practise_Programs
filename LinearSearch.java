package com.searching.algorthims;

import java.util.Scanner;

public class LinearSearch
{
	public static  void linearSearchElement(int arr[],int element)
	{
		int i;
		int length=arr.length;
		for(i=0;i<length;i++)
		{
			if(arr[i]==element)
			{
				System.out.println("Element found at "+i+"index . "+"the elemnt is "+arr[i]);
			}
		}
		System.out.println(+element+" is not in the given array");

	}
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int [] array= {10,20,30,40,50,60,65,70,80,90,100};
		System.out.println("the array elemts are :");
		for(int i=0;i<array.length;i++)
		{
			System.out.print(array[i]+" ");
		}
		System.out.println();
		System.out.println("emter the number you want to find from the given array");
		int searchElemnt=sc.nextInt();
		linearSearchElement(array,searchElemnt);
		
		
	}

}
