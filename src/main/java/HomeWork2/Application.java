package HomeWork2;

import Lesson2.Person;

import java.lang.reflect.InvocationTargetException;

public class Application  extends ObjectArray{
    public static void main(String[] args) throws IllegalAccessException, ClassNotFoundException, InstantiationException, NoSuchMethodException, InvocationTargetException {
        Person person = new Person();
        getObject("Lessons.Lesson2.Person");

        RandomIntProcess.processor(person);

        System.out.println(person.getAge());

    }
}
