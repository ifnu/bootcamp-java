package co.g2academy.io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class FileOutputStreamExample {

    public static void main(String[] args) {
        try {
            FileOutputStream fout = new FileOutputStream(
                    "C:\\Users\\ifnub\\IdeaProjects\\testout.out");
            fout.write(65);
            fout.write("30".getBytes());
            fout.write("it is my first code to write to file".getBytes());
            fout.close();
            System.out.println("Success");
        } catch (Exception ex) {
            System.out.println(ex);
            //handy, but not suggested in production code
            ex.printStackTrace();
        }
        //continue do something

    }
}
