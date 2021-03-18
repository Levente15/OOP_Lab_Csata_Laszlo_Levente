package lab4_1;

public class Person {
    private String firstName;
    private String lastName;
    private int birthDay;

    public Person(String firstName,String lastName, int birthDay){
        this.firstName=firstName;
        this.lastName=lastName;
        this.birthDay=birthDay;
    }

    public String getFirstName() {
        return firstName;
    }

    public int getBirthDay() {
        return birthDay;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return  firstName +" "+ lastName +" szuletesi eve "+this.birthDay;
    }
}
