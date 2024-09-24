import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    public static void main (String[] args) {

        Scanner console = new Scanner(System.in);

        System.out.println("Введите максимальное количество попыток ");
        int turnQuantity = console.nextInt();

        System.out.println("Введите нижний предел числа ");
        int lowerBound = console.nextInt();

        System.out.println("Введите верхний предел числа ");
        int upperBound = console.nextInt();

        Random rand = new Random();

        int randInt;

        randInt = lowerBound + rand.nextInt (upperBound - lowerBound + 1);
        int counter = 1;
        boolean status = false;
        while(counter <= turnQuantity) {

            System.out.print("Введите число: ");
            int userInput = console.nextInt();

            if(userInput == randInt) {
                System.out.println("Совершенно верно! Это и есть загаданное мною число!");
                status = true;
                break;
            } else if(userInput > randInt) {
                System.out.println("Загаданное мною число меньше.");
                status = false;
            } else {
                System.out.println("Загаданное мною число больше.");
                status = false;
            }

            counter++;
        }
        if(status == false) {
            System.out.println("Конец игры.");
            System.out.println("Мною было загадано число: " + randInt);
        }
    }
}