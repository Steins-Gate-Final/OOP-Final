package sample;




public class Students  {

    String Group;
    int No;
    String FirstName;
    String LastName;
    int BirthYear;



    public Students(int no, String firstName, String lastName, String group, int birthYear) {
        FirstName = firstName;
        LastName = lastName;
        BirthYear = birthYear;
        No = no;
        Group = group;
    }
    public String getGroup() {
        return Group;
    }

    public int getNo() {
        return No;
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

    public void setGroup(String group) {
        Group = group;
    }
}
