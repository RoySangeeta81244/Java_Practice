package Amit_learnCoding;

import javax.imageio.stream.ImageOutputStream;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.SQLOutput;

public class exceptionHandaling {
    public static void writeToFile() throws Exception
    {
        BufferedWriter bw = new BufferedWriter(
                new FileWriter("ourFile.txt"));
        for (int i = 1; i <=10 ; i++) {

            bw.write("Hey I have created this using Java");
        }
        bw.close();
        //System.out.println(5/0);
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4};

//        try{
//        System.out.println(arr[5]);
//
//        }catch(ArrayIndexOutOfBoundsException e){
//            System.out.println(e);
//        }

//
//        try {
//            System.out.println(5/0);
//            throw new ArithmeticException();
//        }
//        catch (ArithmeticException e) {
//            e.printStackTrace();
//        }

        try {
            writeToFile();
        }
        catch (Exception e) {
            e.printStackTrace();
        }


    }
}
