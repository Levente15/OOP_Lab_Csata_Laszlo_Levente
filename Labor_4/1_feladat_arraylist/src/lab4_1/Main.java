package lab4_1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //readFilePrintItsLineNumbered("elso.txt");
        Person pers1 = new Person("Csata ", "Levente ", 2001);
        Person pers2 = new Person("Alex ", "Csillag ", 2001);
        Person pers3 = new Person("Sarkany ", "Illes ", 2001);
        Person pers4 = new Person("Botond ", "Raduly ", 2001);
        Person pers5 = new Person("Mark", "Hamar ", 2000);

        ArrayList<Person> automatizalaC = new ArrayList<>();
        automatizalaC.add(pers1);
        automatizalaC.add(pers2);
        automatizalaC.add(pers3);
        automatizalaC.add(pers4);
        automatizalaC.add(pers5);

        for (Person i : automatizalaC) {
            System.out.println(i);
        }
        System.out.println();

        ArrayList<Person>persons=readFromCSVFile("people.csv");
        for (Person i : persons) {
            System.out.println(i);
        }

    }

    public static void readFilePrintItsLineNumbered(String fileName) {
        // Open the file
        Scanner scanner = null;
        try {
            scanner = new Scanner(new File(fileName));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        int row = 1;
        if (scanner != null) {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                System.out.println(row + " " + line);
                row++;
            }
        }
    }

    public static ArrayList<Person> readFromCSVFile(String fileName) {
// Open the file\
        ArrayList<Person> persons = new ArrayList<>();
        Scanner scanner = null;
        try {
            scanner = new Scanner(new File(fileName));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            }
// Read data from file
            //ArrayList<Person> persons = new ArrayList<>();
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                if (line.isEmpty()) {
                    continue;
                }
                String[] items = line.split(",");
// trim: eliminates leading and trailing spaces
                String firstName = items[0].trim();
                String lastName = items[1].trim();
// Convert String → int: Integer.parseInt( String)
                int birtYear = Integer.parseInt(items[2].trim());
                persons.add(new Person(firstName, lastName, birtYear));
            }
            return persons;
        }
    }
