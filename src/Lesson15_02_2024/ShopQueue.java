package Lesson15_02_2024;

//Очередь в магазин. Каждый покупатель имеет корзину,
// в каждой корзине набор товаров определенной цены.
//После обслуживания покупателя сумма в кассе увеличивается.
//Без очереди обслуживаются ветераны, затем дети до 10 лет

import java.util.*;

public class ShopQueue {
    public static void main(String[] args) {
        Product water = new Product("Water", 2.10);
        Product oil = new Product("Olive oil", 8.30);
        Product potato = new Product("Potato", 5.50);

        Customer customer1 = new Customer(TypeCustomer.REGULAR);
        customer1.basket.add(water);
        customer1.basket.add(oil);

        Customer customer2 = new Customer(TypeCustomer.VETERAN);
        customer2.basket.add(water);
        customer2.basket.add(potato);

        Customer customer3 = new Customer(TypeCustomer.CHILD);
        customer3.basket.add(potato);

        Queue<Customer> queue = new PriorityQueue<>();
        queue.add(customer1);
        queue.add(customer2);
        queue.add(customer3);

        Seller seller = new Seller();
        double sum = 0;

        while (!queue.isEmpty()) {
//            System.out.println(queue.poll());
//            queue.peek();
            Customer customer = queue.poll();
            sum += seller.calcSum(customer);
            System.out.println(customer.type + " " + seller.calcSum(customer));
//            queue.peek();
        }
        System.out.println("Total: " + sum);

    }
}

class Product {
    String name;
    double price;

    Product(String name, double price) {

        this.name = name;
        this.price = price;
    }
}

enum TypeCustomer {
    VETERAN, CHILD, REGULAR;
}

class Customer implements Comparable {
    public TypeCustomer type;
    public List<Product> basket = new ArrayList<>();

    public Customer(TypeCustomer type) {
        this.type = type;
    }

    @Override
    public int compareTo(Object o) {
        int index1 = this.type.ordinal(); //подазумеваются индексы!
        int index2 = ((Customer) o).type.ordinal(); //превращение о в Customer (type cast)
        return index1 - index2;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "type=" + type +
                '}';
    }
}

class Seller {
    public double calcSum(Customer customer) {
        double sum = customer.basket
                .stream()
                .mapToDouble(p -> p.price)
                .sum();
        return sum;
    }
}