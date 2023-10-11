package Opgave3;

import Opgave1.Task1;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> passed = new ArrayList<String>();
        passed.add("Matematik");
        passed.add("Dansk");
        Student Mikkel = new Student(passed);
        Teacher Patrick = new Teacher(passed);
        ArrayList<Person> personer = new ArrayList<Person>();
        personer.add(Mikkel);
        personer.add(Patrick);

        for (Person person: personer){
            person.addCourse("Java 1.0");
        }
    }
}
