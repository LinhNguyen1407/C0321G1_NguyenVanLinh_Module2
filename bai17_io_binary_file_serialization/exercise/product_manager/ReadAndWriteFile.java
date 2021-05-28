package bai17_io_binary_file_serialization.exercise.product_manager;

import javax.xml.bind.SchemaOutputResolver;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadAndWriteFile {
    public static void writeToFile(List<Product> products) {
        try {
            FileOutputStream fos = new FileOutputStream("src\\bai17_io_binary_file_serialization\\exercise\\product_manager\\products.txt");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(products);
            oos.close();
            fos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }    }

    public static List<Product> readFromFile(String path){
        List<Product> products = new ArrayList<>();
        try{
            FileInputStream fis = new FileInputStream(path);
            ObjectInputStream ois = new ObjectInputStream(fis);
            products = (List<Product>) ois.readObject();
            fis.close();
            ois.close();
        }catch(Exception ex){
            System.err.println(ex.getMessage());
        }
        return products;
    }
}
