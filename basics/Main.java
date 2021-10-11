package basics;

import java.time.LocalDateTime;
public class Main {
    public static void main(String[] args) {
        String greeting = "Welcome to my Java program.";
        System.out.println(greeting);

        System.out.println("Function 1 /////////////////////////////////////////////////");

        int dogCount = 1;
        System.out.println("I own " + dogCount + " " + pluralize("dog", dogCount) + ".");

        int catCount = 2;
        System.out.println("I own " + catCount + " " + pluralize("cat", catCount) + ".");

        int turtleCount = 0;
        System.out.println("I own " + turtleCount + " " + pluralize("turtle", turtleCount) + ".");

        System.out.println("Function 2 /////////////////////////////////////////////////");

        flipNHeads(1);
        clock();

    }

    public static String pluralize(String name, int count) {
        if ( count ==1) {
            return name ;
        } else {
            return name + "s";
        }
    }

    public static void flipNHeads(int num) {
        int numOfFlips = 0;
        int repetedFlips = 0;
        while (repetedFlips != num) {
            double randomNum = Math.random();
            if (randomNum > .5) {
                System.out.println("heads");
                numOfFlips++;
                repetedFlips++;
            } else {
                System.out.println("tails");
                repetedFlips = 0;
                numOfFlips++;
            }
        }
        System.out.println("It took " + numOfFlips + " flips to flip " + num + " heads in a row.");

    }




    public static void clock() {
        LocalDateTime now = LocalDateTime.now();
        int nowSecond = now.getSecond();
        while(true){
            now = LocalDateTime.now();
            int newSecond = now.getSecond();
            if(nowSecond !=  newSecond){
                System.out.println(now.getHour() + ":" + now.getMinute() + ":" + now.getSecond());
                nowSecond=now.getSecond();
            }
        }
    }
}