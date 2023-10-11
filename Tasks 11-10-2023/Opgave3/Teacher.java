package Opgave3;

import java.util.ArrayList;

public class Teacher extends Person {
    ArrayList<String> canTeach; //= new ArrayList<String>();
    ArrayList<String> currentCourses = new ArrayList<String>();
    public Teacher(ArrayList<String> canTeach){
        super();
        this.canTeach = canTeach;
    }

    @Override
    boolean addCourse(String course) {
        boolean canTeachCourse = false;
        for (String pCourse: canTeach) {
            if (pCourse == course) {
                canTeachCourse = true;
                break;
            }
        }
        if(canTeachCourse) {
            System.out.println("Is unable to teach this course");
            return false;
        }
        else {
            currentCourses.add(course);
            return true;
        }
    }
}
