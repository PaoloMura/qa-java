package variables;

import java.util.Scanner;

public class Variables {
    public static void main(String[] args) {
//        String firstName = "Paolo";
//        String lastName = "Mura";
//        String name = firstName + lastName;
//        System.out.println(name);

        int num1 = 10;
        int num2 = 2;
        System.out.println(num1 + num2);

        int result = num1 / num2;
        System.out.println(result);

        int num3 = 8;
        System.out.println(num3++);
        System.out.println(num3);
        System.out.println(++num3);

        Scanner scanner = new Scanner(System.in);
        String firstName = scanner.nextLine();
        String lastName = scanner.nextLine();
        System.out.println("Hello " + firstName + " " + lastName);

        num1 = scanner.nextInt();
        num2 = scanner.nextInt();
        System.out.println(num1 + num2);
    }
}
