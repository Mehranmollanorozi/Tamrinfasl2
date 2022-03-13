package tamrin1;

import java.util.Scanner;
public class tamrin1 {
    static int sum(int a, int b) {
        return a + b;
    }

    static int sub(int a, int b) {

        return a - b;
    }

    static int multi(int a, int b) {

        return a * b;
    }

    static float div(float a, float b) {

        return a / b;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" enter 2 number ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.println("sub is : " + sum(a, b));
        System.out.println("sub is : " + sub(a, b));
        System.out.println("multi is : " + multi(a, b));
        System.out.println("div is : " + div(a, b));
    }
}
