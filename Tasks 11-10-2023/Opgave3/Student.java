package Opgave3;

import java.util.ArrayList;

public class Student extends Person{

    ArrayList<String> passedCourses;// = new ArrayList<String>();
    ArrayList<String> currentCourses = new ArrayList<String>();
    public Student(ArrayList<String> passedCourses){
        super();
        this.passedCourses = passedCourses;
    }

    @Override
    boolean addCourse(String course) {
        boolean isMatchingCompleted = false;
        for (String pCourse: passedCourses) {
            if (pCourse == course) {
                isMatchingCompleted = true;
                break;
            }
        }
        if(isMatchingCompleted) {
            System.out.println("Has already completed this course");
            return false;
        }
        else {
            currentCourses.add(course);
            return true;
        }
    }
}
