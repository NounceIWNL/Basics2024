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

    }
}

class Apple{
    private Variety variety;
    private double weight;

    public Apple(Variety variety, double weight) {
        this.variety = variety;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Apple{" +
                "variety=" + variety +
                ", weight=" + weight +
                '}';
    }
}



