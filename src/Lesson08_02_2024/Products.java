package Lesson08_02_2024;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Products {
    public static void main(String[] args) {
        House house = new House();
        house.sell();

        System.out.println(house instanceof Product);

        Refrigerator refrigerator = new Refrigerator(100, 50);
        refrigerator.sell();

        List<Product> products = new ArrayList<>();
        products.add(house);
        products.add(refrigerator);

        List<Sellable> productSell = new ArrayList<>();
        productSell.add(house);
        productSell.add(refrigerator);
        Comparator<Sellable> compPrice = Comparator.comparing(product -> product.getPrice());

    }
}

abstract class Product {
    protected String name;

    public abstract void sell();
}

interface Sellable {
    public int getPrice();
}

interface Transportable {
    public double getWeight();
}

class Refrigerator extends Product implements Sellable, Transportable {

    private int price;
    private double weight;

    public Refrigerator(int price, double weight) {
        this.price = price;
        this.weight = weight;
    }

    @Override
    public void sell() {
        System.out.println("That refrigerator is sold.");
    }

    @Override
    public int getPrice() {
        return 0;
    }

    @Override
    public double getWeight() {
        return 0;
    }
}

class House extends Product implements Sellable {

    @Override
    public void sell() {

    }

    @Override
    public int getPrice() {
        return 0;
    }
}