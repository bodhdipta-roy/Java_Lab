package lab_4;

import java.util.*;

public class Main4 {
    public static void main(String[] args) {
        Person[] persons = new Person[3];
        for (int i = 0; i < 3; i++) {
            persons[i] = new Person();
            persons[i].input();
        }
        for (Person person : persons) {
            person.disp();
        }
    }
}