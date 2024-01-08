package Lesson08_01_2024;

public class Demo {
    public static void main(String[] args) {
        Pen pen = new Pen(Color.RED);
        System.out.println(pen);


        Car car = new Car();
//        car.color = Color.RED;
        car.setColor(Color.BLUE);
        System.out.println(car);

        Variety variety = Variety.FUJI;
        System.out.println(variety);

        Apple apple = new Apple(Variety.GALA, 0.2);
        System.out.println(apple);
        System.out.println(apple.getWeight());

    }
}



