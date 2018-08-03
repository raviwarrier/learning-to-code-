package com.example.textfiles;

import java.io.IOException;
import java.io.PrintWriter;

public class WritingToFiles
{
    public static void main(String[] args) throws IOException
    {
        //create and open the file
        //if the file exists, it will be replaced
        PrintWriter outputFile = new PrintWriter("outputFile.txt");

        outputFile.println("This is line 1");
        outputFile.println("This is line 2");
        outputFile.println("This is line 3");

        outputFile.close();

        System.exit(0);
    }
}
