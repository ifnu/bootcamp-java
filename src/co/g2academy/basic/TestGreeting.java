package co.g2academy.basic;

public class TestGreeting {

    public static void main(String[] args) {
        Greeting ifnu = new Greeting();
        ifnu.name = "Ifnu";
        ifnu.greet();

        Greeting hartono = new Greeting();

        hartono.name = "Hartono";
        hartono.greet();

        ifnu.greet();
        System.out.println("this is IDE help");

    }

}