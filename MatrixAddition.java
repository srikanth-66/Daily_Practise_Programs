package com.arrays;

import java.util.Scanner;

public class MatrixAddition 
{
	int i,j;
	int [][]add;
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number of row");
		int row=sc.nextInt();
		System.out.println("enter the number of col");
		int col=sc.nextInt();
		int [][]matrix1=new int [row][col];
		int [][]matrix2=new int [row][col];
		int [][]add = new int[row][col];
		System.out.println("enter the elements to matrix1");
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				matrix1[i][j]=sc.nextInt();
			}
		}
		System.out.println("enter the elements to matrix2");
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				matrix2[i][j]=sc.nextInt();
			}
		}
		System.out.println("the elements of matrix1 are:");
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				System.out.print("\t"+matrix1[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("the elements of matrix2 are:");
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				System.out.print("\t"+matrix2[i][j]+" ");
			}
			System.out.println();
		}
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				add[i][j]=matrix1[i][j]+matrix2[i][j];
			}
			System.out.println();
		}
		System.out.println("the Addition of matrix are:");
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				System.out.print("\t"+add[i][j]+" ");
			}
			System.out.println();
		}
		
	}

}
