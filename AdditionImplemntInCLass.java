package com.lamdaexpressions;
interface Add
{
	public void addining(int a,int b);
}
public class AdditionImplemntInCLass implements Add
{
	public void addining(int a, int b) 
	{
		System.out.println("add ="+(a+b));
		
	}
	
	public static void main(String[] args)
	{
		int a=10,b=20;
		AdditionImplemntInCLass ad=new AdditionImplemntInCLass();
		ad.addining(a, b);
		
	}
	
}
