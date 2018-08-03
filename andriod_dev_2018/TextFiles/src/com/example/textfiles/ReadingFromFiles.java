package com.example.textfiles;

import javax.swing.*;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class ReadingFromFiles
{
    public static void main(String[] args) throws IOException
    {
        int sum = 0;
        int count = 0;

        File file = new File("outputFile.txt");
        if(file.exists())
        {
            Scanner inputFile = new Scanner(file);

            while (inputFile.hasNext()) {
                sum = sum + inputFile.nextInt();
                count++;
            }

            double average = (double) sum / count;
            System.out.println(sum);
            System.out.println(count);
            System.out.println(average);
            inputFile.close();
        }
        else
        {
        JOptionPane.showMessageDialog(null, "File does not exist.");
        }
    }


}
