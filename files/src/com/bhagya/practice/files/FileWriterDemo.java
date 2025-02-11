package com.bhagya.practice.files;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterDemo {

    private static final String FILE_PATH = "C:\\Users\\yeske\\Downloads";
    private static final String FILE_NAME = "JSONFILE";

    public static void main(String[] args) throws IOException {

        FileWriter fileWriter = null;
        try{
            fileWriter = new FileWriter(FILE_PATH + FILE_NAME);
            //writing the content into the FileOperationExample.json file
            fileWriter.write("this is sample data writtren to file..\n\nThis data is written to new line in this file.");
            System.out.println("content is successfully written to the file");
        }catch (IOException e){
            System.out.println(e.getMessage());
            e.printStackTrace();
        }finally {
            System.out.println("closing file writer..");
            //closing the stream
            fileWriter.close();
        }
    }
}
