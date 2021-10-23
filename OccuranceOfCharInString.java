package com.practise.stringprograms;
public class OccuranceOfCharInString 
{
	public static void main(String[] args)
	{
		String str="HelloWorld";
		String str1=str.toLowerCase();
		System.out.println(str1);
		char []arr=str1.toCharArray();
		int len=arr.length;
		int count;
		System.out.println("length of the char array is:"+len);
		System.out.println("{");	
		for(int i=0;i<len-1;i++)
		{
			count=1;
			for(int j=i+1;j<len;j++)
			{
				if(arr[i]==arr[j]) 
				{
					count++;
					for(int k=j;k<len-1;k++) 
					{
						arr[k]=arr[k+1];
					}
					len--;

				}
			}
				System.out.println("\t"+arr[i]+" = "+count);	

	}
		System.out.println("}");	

	}
}
