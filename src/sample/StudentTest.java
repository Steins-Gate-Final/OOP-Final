package sample;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {
    Student student = new Student("Osman","Yasir","Com19",2001);

    @Test
    void getFirstName() {
        assertEquals("Osman",student.getFirstName());
    }

    @Test
    void getLastName() {
        assertEquals("Yasir",student.getLastName());
    }

    @Test
    void getGroup() {
        assertEquals("Com19",student.getGroup());
    }

    @Test
    void getBirthYear() {
        assertEquals(2001,student.getBirthYear());
    }
}