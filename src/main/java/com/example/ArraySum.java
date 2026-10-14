
package com.example;

public class ArraySum {

    public static int findSum(int[] arr) {
        int sum = 0;

        for (int element : arr) {
            sum += element;
        }

        return sum;
    }

    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50};

        System.out.println("Sum = " + findSum(numbers));
    }
}

