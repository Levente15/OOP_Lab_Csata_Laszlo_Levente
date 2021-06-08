package com.company;

public class Main {


    public static double maxElement(double tomb[]) {
        double max = Double.NEGATIVE_INFINITY;
        for (int i = 0; i < tomb.length; ++i) {
            if (tomb[i] > max) {
                max = tomb[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        double x[] = {1, 3, 5, 7, 7};
        System.out.printf("Maximum: %.2f", maxElement(x));
    }
}
