import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int play;
        int operator;

        System.out.println("Welcome to Calculator\n");

        do {
            System.out.println("Do you want to calculate a mathematical operation?");
            System.out.println("Press '1' for yes");
            System.out.println("Press '2' for no");
            play = Integer.parseInt(sc.nextLine());
            blankLine();

            while (play == 1) {
                    System.out.println("Great, there you go!\n");

                    do {
                        System.out.println("Enter the first number:");
                        int num1 = Integer.parseInt(sc.nextLine());
                        blankLine();

                        System.out.println("Enter the second number:");
                        int num2 = Integer.parseInt(sc.nextLine());
                        blankLine();

                        System.out.println("Press '1' to do an addition");
                        System.out.println("Press '2' to do an subtraction");
                        System.out.println("Press '3' to do an multiplication");
                        System.out.println("Press '4' to do an division");
                        System.out.println("Press '0' to cancel the operation");
                        operator = Integer.parseInt(sc.nextLine());
                        blankLine();

                        switch (operator) {
                            case 0 -> System.out.println("Operation cancelled, Darling!\n");
                            case 1 -> {
                                System.out.println(addition(num1, num2));
                                blankLine();
                                do {
                                    anotherOperation();
                                    play = Integer.parseInt(sc.nextLine());
                                    blankLine();
                                } while (play != 1 && play != 2);
                            }
                            case 2 -> {
                                System.out.println(subtraction(num1, num2));
                                blankLine();
                                do {
                                    anotherOperation();
                                    play = Integer.parseInt(sc.nextLine());
                                    blankLine();
                                } while (play != 1 && play != 2);
                            }
                            case 3 -> {
                                System.out.println(multiplication(num1, num2));
                                blankLine();
                                do {
                                    anotherOperation();
                                    play = Integer.parseInt(sc.nextLine());
                                    blankLine();
                                } while (play != 1 && play != 2);
                            }
                            case 4 -> {
                                System.out.println(division(num1, num2));
                                blankLine();
                                do {
                                    anotherOperation();
                                    play = Integer.parseInt(sc.nextLine());
                                    blankLine();
                                } while (play != 1 && play != 2);
                            }
                            default -> {
                                tryAgain();
                                blankLine();
                            }
                        }
                    } while (operator == 0 || operator > 4);
            }
            if (play == 2) {
                kissGoodbye();
            } else {
                tryAgain();
                blankLine();
            }
        } while (play != 2);
    }

    // operations
    public static int addition (int num1, int num2){
        System.out.println("The addition of " + num1 + " and " + num2 + " is:");
        return num1 + num2;
    }
    public static int subtraction (int num1, int num2){
        System.out.println("The subtraction of " + num1 + " and " + num2 + " is:");
        return num1 - num2;
    }
    public static int multiplication (int num1, int num2){
        System.out.println("The multiplication of " + num1 + " and " + num2 + " is:");
        return num1 * num2;
    }
    public static int division (int num1, int num2){
        System.out.println("The division of " + num1 + " and " + num2 + " is:");
        return num1 / num2;
    }

    // questions & phrases
    public static void anotherOperation () {
        System.out.println("Do you want to calculate another operation?");
        System.out.println("Press '1' for yes");
        System.out.println("Press '2' for no");
    }
    public static void kissGoodbye () {
        System.out.println("Okay... Bye, Lovely!");
    }
    public static void tryAgain () {
        System.out.println("Invalid option, try again");
    }

    public static void blankLine () {
        System.out.println();
    }

}