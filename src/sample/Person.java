package sample;

public class Person {
    String FirstName;
    String LastName;
    int BirthYear;

    public Person(String firstName, String lastName, int birthYear) {
        FirstName = firstName;
        LastName = lastName;
        BirthYear = birthYear;
    }

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String firstName) {
        FirstName = firstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }



    public int getBirthYear() {
        return BirthYear;
    }

    public void setBirthYear(int birthYear) {
        BirthYear = birthYear;
    }

}
