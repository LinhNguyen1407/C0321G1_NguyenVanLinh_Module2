package bai12_java_collection_framework.exercise;

public class Product implements Comparable<Product> {
    private int id;
    private String name;
    private double cost;

    public Product() {
    }

    public Product(int id, String name, double cost) {
        this.id = id;
        this.name = name;
        this.cost = cost;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", cost=" + cost +
                '}';
    }

    @Override
    public int compareTo(Product o) {
        return (int) (this.getCost() - o.getCost());
    }
}
