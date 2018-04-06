package Lesson2;

import HomeWork2.RandomInt2;

public class Person {
    @RandomInt2(min = 0, max = 100)
    private int age;
    public int getAge(){
        return age;
    }

    public Person(){}

}
