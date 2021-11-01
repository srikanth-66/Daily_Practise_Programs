package com.lamdaexpressions;

interface Addition
{
	public  void add(int number1,int number2);
	public  void sub(int number1,int number2);

}
public class AnonmousClassExAdditionAndSustraction 
{
	public static void main(String[] args) 
	{
		int a=10,b=20;
		Addition la=new Addition() 
		{
			public void add(int number1, int number2) 
			{
				System.out.println("Addition "+(number1+number2));
				
			}

			public void sub(int number1, int number2) {
				System.out.println("substraction "+(number2-number1));
				
			}

				
		};
		la.add(a,b);
		la.sub(a,b);
	}
}
