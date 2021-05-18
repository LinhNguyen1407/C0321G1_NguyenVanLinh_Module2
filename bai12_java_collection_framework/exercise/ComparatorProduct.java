package bai12_java_collection_framework.exercise;

import java.util.Comparator;

public class ComparatorProduct implements Comparator<Product> {
    @Override
    public int compare(Product o1, Product o2) {
        return (int) (o2.getCost() - o1.getCost());
    }
}
