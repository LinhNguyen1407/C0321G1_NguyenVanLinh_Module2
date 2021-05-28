package bai17_io_binary_file_serialization.exercise.product_manager;
import java.util.List;
import java.util.Scanner;

public class ProductManager {
    public static void displayProduct (String path) {
        List<Product> productsFromFile = ReadAndWriteFile.readFromFile(path);
        System.out.println("Danh sách sản phẩm:");
        for(Product product: productsFromFile) {
            System.out.println(product);
        }
    }

    public static void addProduct (List<Product> products) {
        Scanner input = new Scanner(System.in);
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
            products.clear();
            products.addAll(ReadAndWriteFile.readFromFile("src\\bai17_io_binary_file_serialization\\exercise\\product_manager\\products.txt"));
            products.add(new Product(code, name, company, price));
            ReadAndWriteFile.writeToFile(products);
            System.out.println("Bạn muốn có muốn tiếp tục thêm sản phẩm: \n" +
                    "1.Có\n" +
                    "0.Không");
            int choiceAdd = Integer.parseInt(input.nextLine());
            if (choiceAdd == 0) {
                check = false;
            }
        }
    }

    public static void searchByCode (String path) {
        System.out.println("Nhập mã sản phẩm cẩn tìm: ");
        Scanner input = new Scanner(System.in);
        String code = input.nextLine();
        List<Product> productsFromFile = ReadAndWriteFile.readFromFile(path);
        for(Product product: productsFromFile) {
            if (product.getCode().equals(code)) {
                System.out.println("Thông tin sản phẩm cần tìm: " + product);
                return;
            }
        }
        System.out.println("Sản phẩm không tìm thấy");
    }
}
