package com.company;

public class Main {

    public static void main(String[] args) {
        int number = 7;
        for (int i = 0; i < 8; i++) {
            System.out.printf(getBit(number, i) + "");
        }
        System.out.printf("\n\n");
        for(int i=0;i<8;i++)
        {
            System.out.print(((number>>i) & 1 ) + "");
        }
    }


    private static byte getBit(int number, int order) {
        return order > 8 ? 1 : (byte) ((number >> order) & 1);

    }
}
