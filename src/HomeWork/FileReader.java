package HomeWork;

import java.io.*;
import java.lang.reflect.Field;

public class FileReader {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        Book book = new Book("The Idoit",476,45.99);
        System.out.println(book.getName() + " count pages:" + book.getPagesCount() + " price:" + book.getPrice());
        try {
            FileOutputStream fos = new FileOutputStream("Books");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(book);
            oos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            FileInputStream fis = new FileInputStream("Books");
            ObjectInputStream ois = new ObjectInputStream(fis);
            Book book1 = (Book) ois.readObject();
            System.out.println(book1.toString());
            ois.close();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        Class bookClass = book.getClass();

        Field nameField = bookClass.getDeclaredField("name");
        nameField.setAccessible(true);
        nameField.set(book, "War and Peace");
        System.out.println(book.getName());

    }
}
