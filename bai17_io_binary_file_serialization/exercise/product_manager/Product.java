package bai17_io_binary_file_serialization.exercise.product_manager;

import java.io.Serializable;

public class Product implements Serializable {
    private String code;
    private String name;
    private String company;
    private double price;

    public Product() {
    }

    public Product(String code, String name, String company, double price) {
        this.code = code;
        this.name = name;
        this.company = company;
        this.price = price;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "code='" + code + '\'' +
                ", name='" + name + '\'' +
                ", company='" + company + '\'' +
                ", price=" + price +
                '}';
    }
}
