package HomeWork2;

import HomeWork.Book;
import Lesson2.Person;

public class Application {
    public static void main(String[] args) throws IllegalAccessException{
        Person person = new Person();

        RandomIntProcess.processor(person);
        System.out.println(person.getAge());

    }
}
