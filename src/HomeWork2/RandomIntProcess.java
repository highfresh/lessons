package HomeWork2;

import Lesson2.RandomInt;

import java.lang.reflect.Field;
import java.util.Random;

public class RandomIntProcess {

    public static void processor(Object object) throws IllegalAccessException {
        final Class oblectClass = object.getClass();
        final Field[] fields = oblectClass.getDeclaredFields();
        for (Field field: fields){
            final RandomInt2 annotation = field.getAnnotation(RandomInt2.class);
            if (annotation != null) {
                int random = new Random().nextInt(annotation.max()- annotation.min()) + annotation.min();
                field.setAccessible(true);
                field.set(object, random);

            }
        }
    }

}
