package com.bhagya.practice.files;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class FileReaderDemo {
    private static final String FILE_PATH = "C:\\Users\\yeske\\Downloads";
    private static final String FILE_NAME = "JSONFILE";

    public static void main(String[] args) {

        BufferedReader buffer = null;
        try{
            Reader fileReader = new FileReader(FILE_PATH + FILE_NAME);
            buffer = new BufferedReader(fileReader);

            System.out.println("........start of file...........");
            String strCurrentLine;
            while((strCurrentLine = buffer.readLine()) != null);
            {
                System.out.println(strCurrentLine);
            }
            System.out.println("..........end of line............");
        } catch (IOException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }finally {
            try{
                if (buffer != null)
                    buffer.close();
            }catch(IOException ex){
                ex.printStackTrace();
            }
        }
    }
}
