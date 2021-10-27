package com.arrays;

import java.util.Scanner;

public class MatrixTranspose 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number of row");
		int row=sc.nextInt();
		System.out.println("enter the number of col");
		int col=sc.nextInt();
		int [][]matrix=new int [row][col];
		int [][]transpose = new int[row][col];
		System.out.println("enter the elements to matrix");
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				matrix[i][j]=sc.nextInt();
			}
		}
		
		System.out.println("the elements of matrix are:");
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				System.out.print("\t"+matrix[i][j]+" ");
			}
			System.out.println();
		}
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				transpose[i][j]=matrix[j][i];
			}
			System.out.println();
		}
		System.out.println("Transpose of matrix is");
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				System.out.print("\t"+transpose[i][j]+" ");
			}
			System.out.println();
		}
		
	}
}
