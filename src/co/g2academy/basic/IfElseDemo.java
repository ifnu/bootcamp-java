package co.g2academy.basic;

public class IfElseDemo {

    public static void main(String[] args) {

        int testscore = 76;
        char grade;

        if (testscore >= 90) {
            grade = 'A';
        } else if (testscore >= 80) {
            grade = 'B';
        } else if (testscore >= 70) {
            grade = 'C';
        } else if (testscore >= 60) {
            grade = 'D';
        } else {
            grade = 'F';
        }
        System.out.println("Grade of " + testscore + " is " + grade);

        if (testscore < 60) {
            grade = 'F';
        } else if (testscore >= 60 && testscore < 70) {
            grade = 'D';
        } else if (testscore >= 70 && testscore < 80) {
            grade = 'C';
        } else if (testscore >= 80 && testscore < 90) {
            grade = 'B';
        } else  {
            grade = 'A';
        }
        System.out.println("Grade of " + testscore + " is " + grade);


        String condition = "abcdef";
        if (condition.equals("abcdef")) {
            System.out.println("Condition is abcdef");
        }

        String notEqualsCondition = "abcdef";
        if (!notEqualsCondition.equals("abcdef")) {
            System.out.println("Condition is not abcdef");
        }

        int number = 10;
        if (number == 10) {
            System.out.println("The number is 10");
        }

        if (condition == "abcdef"){

        }

        Float f = 10.0f;
        if (f.equals(10.0f)) {

        }

        Double d = 10.000d;
        if( d.equals(10)) {

        }
    }

}
