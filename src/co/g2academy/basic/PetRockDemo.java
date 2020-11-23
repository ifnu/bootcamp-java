package co.g2academy.basic;

import co.g2academy.unit.testing.PetRock;

public class PetRockDemo {

    public static void main(String[] args) {

        PetRock rocky = new PetRock("rocky");

        String petRockName = rocky.getName();

        System.out.println("Pet rock name is: " + petRockName);

    }

}
