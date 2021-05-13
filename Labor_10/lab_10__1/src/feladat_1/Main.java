package feladat_1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Adj meg szamokat egy sorban:");
        String line = input.nextLine();

        String[] items = line.split(" ");
        double sum = 0;

        for (String i : items) {
            try {
                sum += Double.parseDouble(i);
            } catch (NumberFormatException numberFormatException) {
                System.out.println("Rossz szamot adtal meg :(( -> " + i);
                // numberFormatException.printStackTrace();
                System.out.println(numberFormatException.getMessage());
            }
        }
        System.out.println("A szamok osszege: " + sum);
    }
}
