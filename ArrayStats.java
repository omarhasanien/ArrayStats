package edu.zuj.oop.week3.lecture1;

import java.util.Scanner;

public class Test9 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        
        System.out.print("Enter the number of elements : ");
        int n = s.nextInt();

        int[] numbers = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("num " + i + " : ");
            numbers[i] = s.nextInt();
        }
        
        int max = numbers[0];
        int min = numbers[0];
        int sum = 0;

        for (int i = 0; i < n; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
            if (numbers[i] < min) {
                min = numbers[i];
            }
            sum += numbers[i];
        }

        double avg = (double) sum / n;

        System.out.println(" The Result : ");
        System.out.println("Max = " + max);
        System.out.println("Min = " + min);
        System.out.println("Sum = " + sum);
        System.out.println("Avg = " + avg);

        System.out.print(" Your numbers is : ");
        for (int i = 0; i < n; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();

        s.close();
    }
}
