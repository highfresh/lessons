package HomeWork2;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class ObjectArray {

    public static Object[] getObject(String basePackage) throws IllegalAccessException, InstantiationException, ClassNotFoundException, NoSuchMethodException, InvocationTargetException {

        Class aClass = Class.forName("Lesson2.Person");
        Object object = aClass.newInstance();
        final Constructor constructor = aClass.getConstructor();
        constructor.newInstance();

        return null;
    }

}