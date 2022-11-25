import java.util.Scanner;

class Addition {
    public void addition() {

        Scanner input = new Scanner(System.in);
        System.out.println("You have choosen Operation Addition");
        System.out.println("Enter two number you want to sum:");

        int number1 = input.nextInt();
        int number2 = input.nextInt();
        int sum = number1 + number2;
        System.out.println("Result of " + number1 + " + " + number2 + " is");
        System.out.println(sum);
        input.close();

    }
}

class Subtraction {
    public void subtraction() {

        Scanner input = new Scanner(System.in);

        System.out.println("You've choosen Operation Subtraction");
        System.out.println("Enter two number you want to subtract:");

        int number3 = input.nextInt();
        int number4 = input.nextInt();
        int subtract = number3 - number4;
        System.out.println("Result of " + number3 + " - " + number4 + " is");
        System.out.println(subtract);
        input.close();

    }

}

class Multiplication {
    public void multiplication() {

        Scanner input = new Scanner(System.in);

        System.out.println("You've choosen Operation Multiplication");
        System.out.println("Enter two number you want to multiplie:");

        int number5 = input.nextInt();
        int number6 = input.nextInt();

        int multiplie = number5 * number6;
        System.out.println("Result of " + number5 + " x " + number6 + " is");
        System.out.println(multiplie);

        input.close();

    }

}

class Division {
    public void division() {

        Scanner input = new Scanner(System.in);

        System.out.println("You've choosen Operation Division");
        System.out.println("Enter two number you want to divide:");

        int number7 = input.nextInt();
        int number8 = input.nextInt();
        double divide = (double) number7 / number8;

        System.out.println("Result of " + number7 + " : " + number8 + " is");
        System.out.println(divide);

        input.close();

    }

}

public class Calculator {
    public static void main(String[] args) {

        System.out.println("Java Calculator");
        System.out.println("=================");
        System.out.println("Input a number of which of operation you want to use from below:");
        System.out.println("1. Operation Addition");
        System.out.println("2. Operation Subtraction");
        System.out.println("3. Operation Multiplication");
        System.out.println("4. Operation Division");
        System.out.println("================================");

        Scanner input = new Scanner(System.in);
        System.out.println("Choose a number of which operation you want:");
        System.out.println("=================================================");
        int num = input.nextInt();

        if (num == 1) {
            Addition adition = new Addition();
            adition.addition();

        }

        else if (num == 2) {
            Subtraction subtract = new Subtraction();
            subtract.subtraction();

        }

        else if (num == 3) {
            Multiplication multiplie = new Multiplication();
            multiplie.multiplication();

        }

        else if (num == 4) {

            Division divide = new Division();
            divide.division();

        }

        else {
            System.out.println("Invalid input");
        }

        input.close();

    }

}
