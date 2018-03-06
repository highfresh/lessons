package HomeWork;
import java.io.*;

public class Book implements Serializable {
    private String name;
    private int pagesCount;
    private double price;
    private Book (){};

    public Book (String name,int pagesCount, double price){
        this.name = name;
        this.pagesCount = pagesCount;
        this.price = price;
    }


    public String getName() {
        return name;
    }

    public int getPagesCount() {
        return pagesCount;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Name:" + name + " count:" + pagesCount + " price" + price;
    }
}

