package com.day13;

import java.io.FileReader;

public class FileReaderClass 
{
    public static void main(String args[])throws Exception
    {    
        FileReader fr=new FileReader("C:\\\\Users\\\\M Srikant\\\\Desktop\\\\java_bridgelabz\\\\Day_13_BRP\\\\src\\\\text1");    
        int i;    
        while((i=fr.read())!=-1)    
        System.out.print((char)i);    
        fr.close();    
  }    


}
