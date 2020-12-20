package sample;




public class Student extends Person {

    String Group;

    public Student(String firstName, String lastName, String group, int birthYear) {
        super(firstName,lastName,birthYear);
        Group = group;
    }
    public String getGroup() {
        return Group;
    }

    public void setGroup(String group) {
        Group = group;
    }
}
