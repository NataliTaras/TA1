package TA1.hw5;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class hw5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number");
        int number1 = sc.nextInt();
        System.out.println("Enter second number");
        int number2 = sc.nextInt();
        System.out.println("Enter third number");
        int number3 = sc.nextInt();
        sc.close();
        int[] numbers = {number1, number2, number3};
        Arrays.sort(numbers);
        System.out.println("Ascending order"+ Arrays.toString(numbers));
    }
}
