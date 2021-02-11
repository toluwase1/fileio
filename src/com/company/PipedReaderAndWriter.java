package com.company;

import java.io.IOException;
import java.io.PipedReader;
import java.io.PipedWriter;

public class PipedReaderAndWriter {
    public static void main(String[] args) throws Exception {


        final PipedReader pr = new PipedReader();
        final PipedWriter pw = new PipedWriter();


        //connects this piped writer to receiver
        pw.connect(pr);

        //create one thread which writes to the data
        Thread thread1 = new Thread() {
            public void run() {
                try {
                    pw.write("Hello Java world, ");
                    pw.write("I love Java");
                } catch (IOException e) {
                    e.printStackTrace();
                }
                try {
                    pw.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        };

        //Creating another thread which reads THE DATA

        Thread thread2 = new Thread() {
            public void run() {
                try {
                    int i;
                    while ((i=pr.read())!=-1) {
                        System.out.print((char) i);
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
                try {
                    pr.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        };
        // starting both threads
        thread1.start();
        thread2.start();

    }

}
