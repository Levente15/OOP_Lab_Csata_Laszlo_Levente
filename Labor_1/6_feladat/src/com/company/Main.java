package com.company;
import static java.lang.System.out;

public class Main {

    public static void main(String[] args) {
	Szemelye Monika= new Szemelye();
	Monika.setEletkor(44);
	Monika.setSzemszin("KEKESBARNA");

	out.println(Monika.getEletkor());
	out.println(Monika.getSzemszin());
    }
}
