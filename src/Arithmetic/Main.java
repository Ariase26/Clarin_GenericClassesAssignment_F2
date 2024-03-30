package Arithmetic;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        Number n1 = 2004.04;
//        Number n2 = 26;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number 1: ");
        Number n1 = sc.nextDouble();
        System.out.print("Enter number 2: ");
        Number n2 = sc.nextDouble();

        Arithmetic<Number, Number> genMath = new Arithmetic<>(n1, n2);

        System.out.println("\nGeneral Arithmetic Class Operation:");
        System.out.println("| Addition: " + genMath.add());
        System.out.println("| Subtraction: " + genMath.subtract());
        System.out.println("| Multiplication: " + genMath.multiply());
        System.out.println("| Division: " + genMath.divide());
        System.out.println("| Max Number: " + genMath.getMax());
        System.out.println("| Min Number: " + genMath.getMin());
    }
}
