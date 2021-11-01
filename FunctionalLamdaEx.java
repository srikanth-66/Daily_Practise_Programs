package com.lamdaexpressions;

interface Additon
{
	public void addining(int a,int b);
}

public class FunctionalLamdaEx 
{
	public static void main(String[] args)
	{		
		int number1=10,number2=90;
		Additon sum=(a,b)->{System.out.println("addition="+(a+b));};
		sum.addining(number1, number2);
	}

}
