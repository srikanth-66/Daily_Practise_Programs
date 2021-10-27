package com.arrays;

import java.util.Scanner;

public class OneDimentionalArray
{
	Scanner sc=new Scanner(System.in);
	int size;
	int sum;
	
	public void arrayMethod()
	{
		System.out.println("enter the size array");
		int size=sc.nextInt();
		int [] primeNumbers=new int[size];
		System.out.println("enter the first 10 prime numbers");
		for(int i=0;i<primeNumbers.length;i++)
		{
			int primeNum=sc.nextInt();;
			primeNumbers[i]=primeNum;
		}
		System.out.println("displaying primenum Array");
		for(int i=0;i<primeNumbers.length;i++)
		{
			System.out.println(primeNumbers[i]);
		}
	}
	public void sumArray(int [] num,int len)
	{
		int sum=0;
		for(int i=0;i<num.length;i++)
		{
			sum=sum+num[i];
			
		}
		System.out.println("sum:"+sum);

	}
	public void minElement(int [] num,int len)
	{
		int min=num[0];
		for(int i=0;i<num.length;i++)
		{
				if(num[i]<min)
				{
					min=num[i];
				}
		}
		System.out.println("min="+min);
	}
	public void maxElement(int [] num,int len)
	{
		int max=num[0];
		for(int i=0;i<num.length;i++)
		{
				if(num[i]>max)
				{
					max=num[i];
				}
			}
		System.out.println("max="+max);
	}
	public void alternativeElements(int [] num,int len)
	{
		int i;
		System.out.println(" Alternative elemnts");
		for(i=0;i<num.length;i++)
		{
			System.out.println(num[i]+" ");
			i++;
		}
	}
	public void reversArray(int [] num,int len)
	{
		int i;
		System.out.println(" Reversed elemnts");
		for(i=len-1;i>=0;i--)
		{
			System.out.print(num[i]+" ");
		}
	}
	public static void main(String[] args) 
	{
		char [] name= {'s','r','i','k','a','n','t','h'};
		System.out.println("Displaying the char array");
		for(int i=0;i<=name.length-1;i++)
		{
			System.out.print(name[i]);
		}
		System.out.println(" ");
		OneDimentionalArray oda=new OneDimentionalArray();
		oda.arrayMethod();
		int [] number= {10,10,20,20,40};
		int len=number.length;
		oda.sumArray(number,len);
		oda.minElement(number, len);
		oda.maxElement(number, len);
		oda.alternativeElements(number, len);
		oda.reversArray(number, len);

		
	}

}
