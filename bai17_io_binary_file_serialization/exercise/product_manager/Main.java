package bai17_io_binary_file_serialization.exercise.product_manager;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();
        while (true) {
            try {
                System.out.println("Danh mục: \n" +
                        "1.\tThêm sản phẩm vào file \n" +
                        "2.\tHiển thị danh sách sản phẩm \n" +
                        "3.\tTìm kiếm thông tin sản phẩm theo mã \n" +
                        "4.\tThoát \n" +
                        "Chọn chức năng: ");
                Scanner input = new Scanner(System.in);
                int choice = Integer.parseInt(input.nextLine());
                switch (choice) {
                    case 1:
                        ProductManager.addProduct(products);
                        break;
                    case 2:
                        ProductManager.displayProduct("src\\bai17_io_binary_file_serialization\\exercise\\product_manager\\products.txt");
                        break;
                    case 3:
                        ProductManager.searchByCode("src\\bai17_io_binary_file_serialization\\exercise\\product_manager\\products.txt");
                        break;
                    case 4:
                        System.exit(0);
                        break;
                    default:
                        System.err.println("Số chọn không có trong danh mục. Bạn hãy chọn lại");
                }
            } catch (NumberFormatException e) {
                System.err.println("Nhập sai định dạng số. Bạn hãy nhập lại !");
            }
        }
    }
}
