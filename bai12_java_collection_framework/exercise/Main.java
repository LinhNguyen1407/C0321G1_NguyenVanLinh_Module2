package bai12_java_collection_framework.exercise;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
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
                    "8.Thoát \n" +
                    "Chọn chức năng: ");
            Scanner input = new Scanner(System.in);
            int choice = input.nextInt();
            switch (choice) {
                case 1:
                    ProductManager.add(list, input);
                    break;
                case 2:
                    ProductManager.modifyById(list, input);
                    break;
                case 3:
                    ProductManager.deleteById(list, input);
                    break;
                case 4:
                    ProductManager.display(list);
                    break;
                case 5:
                    ProductManager.searchByName(list, input);
                    break;
                case 6:
                    Collections.sort(list);
                    ProductManager.display(list);
                    break;
                case 7:
                    Collections.sort(list, new ComparatorProduct());
                    ProductManager.display(list);
                    break;
                case 8:
                    System.exit(0);
                    break;
            }
        }
    }
}
