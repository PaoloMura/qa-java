package variables;

import java.util.Scanner;

public class Variables {
    private static void firstTask() {
        String firstName = "Paolo";
        String lastName = "Mura";
        String name = firstName + lastName;
        System.out.println(name);
    }

    private static void secondTask() {
        int num1 = 10;
        int num2 = 2;
        System.out.println(num1 + num2);

        int result = num1 / num2;
        System.out.println(result);

        int num3 = 8;
        System.out.println(num3++);
        System.out.println(num3);
        System.out.println(++num3);
    }

    private static void thirdTask() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your first name:");
        String firstName = scanner.nextLine();
        System.out.println("Enter your second name:");
        String lastName = scanner.nextLine();
        System.out.println("Hello " + firstName + " " + lastName);

        System.out.println("Enter your first number:");
        int num1 = scanner.nextInt();
        System.out.println("Enter your second number:");
        int num2 = scanner.nextInt();
        System.out.println(num1 + num2);
    }

    public static void main(String[] args) {
        firstTask();
        secondTask();
        thirdTask();
    }
}
