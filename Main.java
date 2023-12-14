import java.util.Scanner;
import java.util.Random;

public class Main {

    public static void check(char user_input) {

        Random random = new Random();

        char[] choices = { 'r', 'p', 's' };

        int ComputerChoice = random.nextInt(3);
        char computer = choices[ComputerChoice];

        if (user_input == 'r') {
            if (computer == user_input) {
                System.out.println("It's a tie! 🤝");
            } else if (computer == 'p') {
                System.out.println("I chose paper, I win! 😎");
            } else {
                System.out.println("I chose scissors, you win! 😢");
            }

        }

        else if (user_input == 'p') {
            if (computer == user_input) {
                System.out.println("It's a tie! 🤝");
            } else if (computer == 'r') {
                System.out.println("I chose rock, you win! 😢");
            } else {
                System.out.println("I chose scissors, I win! 😎");
            }

        } else if (user_input == 's') {
            if (computer == user_input) {
                System.out.println("It's a tie! 🤝");
            } else if (computer == 'r') {
                System.out.println("I chose rock, I win! 😎");
            } else {
                System.out.println("I chose paper, you win 😢");
            }
        } else {
            System.out.println("Invalid input!");
        }

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to the JAVATALE-RPS EDITION!");

        System.out.println("(r)ock / (p)aper / (s)cissors: ");
        char userInput = sc.next().charAt(0);

        check(userInput);

        sc.close();

    }

}