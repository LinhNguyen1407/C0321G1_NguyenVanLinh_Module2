package bai12_java_collection_framework.exercise;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;

public class ProductManager {
    public static void main(String[] args) {
        ArrayList<Product> list = new ArrayList<>();
        Product product1 = new Product(1, "pen", 10);
        Product product2 = new Product(2, "book", 50);
        Product product3 = new Product(3, "note", 20);
        Product product4 = new Product(4, "pencil", 5);
        list.add(product1);
        list.add(product2);
        list.add(product3);
        list.add(product4);

        while (true) {
            System.out.println("Danh mục: \n" +
                    "1.Thêm sản phẩm \n" +
                    "2.Sửa thông tin sản phẩm theo id \n" +
                    "3.Xóa thông tin sản phẩm theo id \n" +
                    "4.Hiển thị danh sách sản phẩm \n" +
                    "5.Tìm kiếm sản phẩm theo tên \n" +
                    "6.Sắp xếp sản phẩm tăng dần theo giá \n" +
                    "7.Sắp xếp sản phẩm giảm dần theo giá \n" +
                    "8.Thoát");
            Scanner input = new Scanner(System.in);
            int choice = input.nextInt();
            switch (choice) {
                case 1:
                    add(list, input);
                    break;
                case 2:
                    modifyById(list, input);
                    break;
                case 3:
                    deleteById(list, input);
                    break;
                case 4:
                    display(list);
                    break;
                case 5:
                    searchByName(list, input);
                    break;
                case 6:
                    Collections.sort(list);
                    display(list);
                    break;
                case 7:
                    Collections.sort(list, new ComparatorProduct());
                    display(list);
                    break;
                case 8:
                    System.exit(0);
                    break;
            }
        }
    }

    private static void display(ArrayList<Product> list) {
        System.out.println("List products:");
        for (Product product : list) {
            System.out.println(product);
        }
    }

    private static void add(ArrayList<Product> list, Scanner input) {
        boolean check = true;
        while (check) {
            System.out.print("Nhập id: ");
            int id = input.nextInt();
            System.out.print("Nhập tên: ");
            String name = input.next();
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

    private static void modifyById(ArrayList<Product> list, Scanner input) {
        System.out.println("Nhập id sản phẩm cần sửa: ");
        int id = input.nextInt();
        for (Product product : list) {
            if (product.getId() == id) {
                System.out.print("Nhập tên sản phẩm thay thế: ");
                String name = input.next();
                System.out.print("Nhập giá sản phẩm thay thế: ");
                double cost = input.nextDouble();
                product.setName(name);
                product.setCost(cost);
                display(list);
            }
        }
    }

    private static void deleteById(ArrayList<Product> list, Scanner input) {
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

    private static void searchByName(ArrayList<Product> list, Scanner input) {
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