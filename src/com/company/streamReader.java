package com.company;

import javax.xml.transform.sax.SAXResult;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;

public class streamReader {
    public static void main(String[] args) throws Exception{
        FileOutputStream file = new FileOutputStream(".txt");
        file.write(65);
        file.write(new byte[]{65, 64, 70});

//        FileWriter fileWriter =  new FileWriter("text.txt");
//        fileWriter.write("1234");
//        fileWriter.write(1234);
//        fileWriter.write("God is love");
//        fileWriter.write("Hello");
//        fileWriter.write("God love");


//        FileInputStream fis = new FileInputStream("file.txt");
        FileReader fileReader =  new FileReader("text.txt");
        int variable = fileReader.read();

        while ((variable)!=-1) {
            System.out.print((char) variable);
            variable=fileReader.read();
        }


//        fileWriter.close();
//        file.close();
//        fileWriter.close();


    }
}
