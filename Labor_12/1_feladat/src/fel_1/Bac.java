package fel_1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

import static fel_1.Tantargy.*;

public class Bac {

    private Map<Integer, Student> students = new TreeMap<>();

    public Bac(String fileName) {
        try (Scanner scanner = new Scanner(new File(fileName))) {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] item = line.split(" ");
                int id = Integer.parseInt(item[0].trim());
                String firstName = item[1].trim();
                String lastName = item[2].trim();
                Student student = new Student(id, firstName, lastName);
                students.put(id, student);
            }

            readSpecificMarks("magyar.txt", Magyar);
            readSpecificMarks("matek.txt", Matek);
            readSpecificMarks("roman.txt", Roman);

        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        }
    }

    private void readSpecificMarks(String fileName, Tantargy tantargy) {
        try (Scanner scanner = new Scanner(new File(fileName))) {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] item = line.split(" ");
                int id = Integer.parseInt(item[0].trim());
                double jegy = Double.parseDouble(item[1].trim());
                Student student = students.get(id);
                student.addMark(jegy, tantargy);
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        }
    }

    public void printStudent() {
        for (Map.Entry<Integer, Student> e : students.entrySet()) {
            System.out.println(e.getKey() + " : " + e.getValue());
        }
//        for(Integer key : students.keySet()){
//            students.get(key);
//        }
    }

    public void printPassedStudent() {
        for (Map.Entry<Integer, Student> e : students.entrySet()) {
            if (e.getValue().isPassed())
                System.out.println(e.getKey() + " : " + e.getValue());
        }
    }
    public void printFailedStudent() {
        for (Map.Entry<Integer, Student> e : students.entrySet()) {
            if (!e.getValue().isPassed())
                System.out.println(e.getKey() + " : " + e.getValue());
        }
    }
}
