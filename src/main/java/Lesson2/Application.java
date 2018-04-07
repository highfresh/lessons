package Lesson2;

public class Application {
    public static void main(String[] args) throws IllegalAccessException {

//        Person person = PersonUtils.getPerson();
//        /System.out.println(person.getPerson);

        Person person = new Person();
        RandomIntProcessor.process(person);
        System.out.println(person.getAge());

    }
}

