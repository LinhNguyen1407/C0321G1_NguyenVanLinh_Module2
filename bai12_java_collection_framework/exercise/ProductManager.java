package bai12_java_collection_framework.exercise;
import java.util.ArrayList;
import java.util.Scanner;

public class ProductManager {
    public static void display(ArrayList<Product> list) {
        System.out.println("List products:");
        for (Product product : list) {
            System.out.println(product);
        }
    }

    public static void add(ArrayList<Product> list, Scanner input) {
        boolean check = true;
        while (check) {
            System.out.print("Nhập id: ");
            int id = input.nextInt();
            System.out.print("Nhập tên: ");
            input.nextLine();
            String name = input.nextLine();
            System.out.print("Nhập giá: ");
            double cost = input.nextDouble();
            Product product = new Product(id, name, cost);
            list.add(product);
            System.out.println("Bạn muốn có muốn tiếp tục thêm sản phẩm: \n" +
                    "1.Có\n" +
                    "0.Không");
            int choiceAdd = input.nextInt();
            if (choiceAdd == 0) {
                check = false;
            }
        }
        display(list);
    }

    public static void modifyById(ArrayList<Product> list, Scanner input) {
        System.out.println("Nhập id sản phẩm cần sửa: ");
        int id = input.nextInt();
        for (Product product : list) {
            if (product.getId() == id) {
                System.out.print("Nhập tên sản phẩm thay thế: ");
                input.nextLine();
                String name = input.nextLine();
                System.out.print("Nhập giá sản phẩm thay thế: ");
                double cost = input.nextDouble();
                product.setName(name);
                product.setCost(cost);
                display(list);
            }
        }
    }

    public static void deleteById(ArrayList<Product> list, Scanner input) {
        System.out.println("Nhập id sản phẩm cần xóa: ");
        int id = input.nextInt();
        System.out.println("Thông tin sản phẩn cần xóa: ");
        for (Product product : list) {
            if (product.getId() == id) {
                System.out.println(product);
                System.out.println("Xác nhận tiếp tục xóa: \n" +
                        "1.Có\n" +
                        "0.Không");
                int choiceDelete = input.nextInt();
                if (choiceDelete == 1) {
                    list.remove(product);
                }
            }
        }
        display(list);
    }

    public static void searchByName(ArrayList<Product> list, Scanner input) {
        System.out.println("Nhập tên sản phẩm cẩn tìm: ");
        String name = input.next();
        for (Product product : list) {
            if (product.getName().equals(name)) {
                System.out.println("Thông tin sản phẩn cần tìm: " + product);
                return;
            }
        }
        System.out.println("Sản phẩm không có trong danh sách");
    }
}