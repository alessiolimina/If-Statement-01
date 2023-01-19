package it.develhope.ifstatement;

public class Start {
    public static void main(String[] args) {

        System.out.println("-----------Starting----------");

        String myName = "Alessio";

        if (myName.length() % 2 == 0) {
            System.out.println("Your name has an even number of letters");
        } else {
            System.out.println("Your name has an odd number of letters");
        }

        System.out.println("-----------------------------");
    }
}