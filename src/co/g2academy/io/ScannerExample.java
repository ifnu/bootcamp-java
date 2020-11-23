package co.g2academy.io;

import java.util.Scanner;

public class ScannerExample {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int data = 0;
        while (data != -1) {
            System.out.println("Input data here:");
            data = scanner.nextInt();
            System.out.println("Data is: " + data);
        }
        scanner.close();

    }

}
