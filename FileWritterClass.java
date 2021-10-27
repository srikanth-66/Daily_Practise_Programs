package com.day13;

import java.io.FileWriter;

public class FileWritterClass 
{
	public static void main(String[] args)
	{
        try
        {    
            FileWriter fw=new FileWriter("C:\\Users\\M Srikant\\Desktop\\java_bridgelabz\\Day_13_BRP\\src\\text1");    
            fw.write("Happy Learning."); 
            fw.close();    

          }
        catch(Exception e)
        {
        	System.out.println(e);
        }  
           System.out.println("Success...");    
	}

}
