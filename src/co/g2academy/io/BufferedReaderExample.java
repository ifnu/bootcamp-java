package co.g2academy.io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferedReaderExample {

    public static void main(String[] args) throws IOException {

        InputStreamReader inputStreamReader = new InputStreamReader(System.in);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        System.out.println("Please enter your name");

        String name = "";
        while(!name.equals("stop")) {
            System.out.println("Enter yur data: ");
            name = bufferedReader.readLine();
            System.out.println("Data is: " + name);
        }
        bufferedReader.close();
        inputStreamReader.close();
    }

}
