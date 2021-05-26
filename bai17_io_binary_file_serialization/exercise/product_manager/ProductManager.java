package bai17_io_binary_file_serialization.exercise.product_manager;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProductManager {
    public static void writeToFile(String path, List<Product> products) {
        try {
            FileOutputStream fos = new FileOutputStream(path);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(products);
            oos.close();
            fos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static List<Product> readFromFile(String path){
        List<Product> products = new ArrayList<>();
        try{
            FileInputStream fis = new FileInputStream(path);
            ObjectInputStream ois = new ObjectInputStream(fis);
            products = (List<Product>) ois.readObject();
            fis.close();
            ois.close();
        }catch(Exception ex){
            ex.printStackTrace();
        }
        return products;
    }

    public static void displayProduct (String path) {
        List<Product> productsFromFile = ProductManager.readFromFile(path);
        for(Product product: productsFromFile) {
            System.out.println(product);
        }
    }

    public static void addProduct (String path, List<Product> products, Scanner input) {
        boolean check = true;
        while (check) {
            System.out.print("Nhập mã: ");
            String code = input.nextLine();
            System.out.print("Nhập tên: ");
            String name = input.nextLine();
            System.out.print("Nhập hãng sản xuất: ");
            String company = input.nextLine();
            System.out.print("Nhập giá: ");
            double price = Double.parseDouble(input.nextLine());
            products.add(new Product(code, name, company, price));
            ProductManager.writeToFile(path, products);
            System.out.println("Bạn muốn có muốn tiếp tục thêm sản phẩm: \n" +
                    "1.Có\n" +
                    "0.Không");
            int choiceAdd = Integer.parseInt(input.nextLine());
            if (choiceAdd == 0) {
                check = false;
            }
        }
    }
}
