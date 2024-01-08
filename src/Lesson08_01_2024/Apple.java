package Lesson08_01_2024;

class Apple {
    private Variety variety;
    private double weight;

    public Apple(Variety variety, double weight) {
        this.variety = variety;
        this.weight = weight;
    }

    public Variety getVariety() {
        return variety;
    }

    public double getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return "Apple{" +
                "variety=" + variety +
                ", weight=" + weight +
                '}';
    }
}
