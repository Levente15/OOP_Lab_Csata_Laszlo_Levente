package fel_1;

import java.util.HashMap;
import java.util.Map;

public class Student {

    private final int id;
    private String firstName;
    private String lastName;

    private Map<Tantargy, Double> marks = new HashMap<>();

    public Student(int id, String firstName, String lastName) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder(firstName + " " + lastName + " Jegyei: ");
        for (Tantargy t : marks.keySet()) {
            result.append(t).append(" - ").append(marks.get(t)).append(" ");
        }
        return result.toString();
    }

    public void addMark(double jegy, Tantargy tantargy) {
        marks.put(tantargy, jegy);
    }

    public boolean isPassed(){
            double avg=0;
           for(Map.Entry<Tantargy,Double> j : marks.entrySet()) {
               if (j.getValue() < 5)
                   return false;
               avg += j.getValue();
           }
           return (avg/marks.keySet().size())>=6;
    }
}
