package tamrin3;

import java.util.Scanner;

public class Numberclass implements MyInteger {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
    @Override
    public void isEven() {
        if (a%2==0){
            System.out.println("number is Even");
        }
    }

    @Override
    public void isOdd() {
        if (a%2!=0){
            System.out.println("number is Odd");
        }
    }

    @Override
    public void isPosetive() {
        if (a>0){
            System.out.println("number is Posetive");
        }
    }

    @Override
    public void isNegative() {
        if (a<0){
            System.out.println("number is Negative");
        }
    }

    @Override
    public void isZero() {
        if (a==0){
            System.out.println("number is zero");
        }
    }
}