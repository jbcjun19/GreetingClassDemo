package com.company;

public class Main {

    public static void main(String[] args) {

        /* Leave this part commented out and use for reference only
        *
        * Random random = new Random();
        * Scanner scanner = new Scanner(System.in);
        * */

        Greeting g = new Greeting();
        /* Do you see the similarity?

        ObjectType objectName = new ObjectConstructor ;

        We've been using constructors without realizing that's what they're called */

        g.setSender("Dave");
        g.setGreeting("Hello");
        String message = g.displayMessage();
        System.out.println(message);

        Greeting g2 = new Greeting();
        g2.setSender("Melissa");
        g2.setGreeting("Hello from Melissa");
        System.out.println(g2.getSender());
        System.out.println(g2.getGreeting());

        Greeting g3 = new Greeting("I like Java","Jennifer");
        System.out.println(g3.displayMessage());
    }
}
