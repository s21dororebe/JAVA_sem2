package service;

import model.Degree;
import model.Faculty;
import model.Professor;
import model.Student;

public class MainService {
    public static void main(String[] args) {
        //TODO find out why berzins is not a latvian word in the IntellijIdea
        Student st1 = new Student();
        Student st2 = new Student ("Jānis", "Tretjaka", "318122-65899", Faculty.ITF);
        Student st3 = new Student ("Ilze22", "Tretjaka", "31ss22-65899", Faculty.ITF);

        Professor pr1 = new Professor();
        Professor pr2 = new Professor ("Jānis", "Tretjaka", Degree.BACHELOR);
        Professor pr3 = new Professor ("Ilze22", "Tretjaka", Degree.MASTER);

        System.out.println(st1);
        System.out.println(st2);
        System.out.println(st3);

        System.out.println(pr1);
        System.out.println(pr2);
        System.out.println(pr3);

    }
}
