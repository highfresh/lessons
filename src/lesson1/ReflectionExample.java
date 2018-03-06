package lesson1;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ReflectionExample {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {

        User user = new User ("Bob","Sulivan");
        System.out.println(user.getName()+ " " + user.getLastname());

        Class userClass = user.getClass();


       Field nameField = userClass.getDeclaredField("name");
       nameField.setAccessible(true);
        System.out.println(user.getName());
       nameField.set(user, "Nikolay");
        System.out.println(user.getName());

        Method method = userClass.getDeclaredMethod("concatString");
        method.setAccessible(true);
        method.invoke(user);
        String s = (String) method.invoke(user);
        System.out.println(s );

    }
}
