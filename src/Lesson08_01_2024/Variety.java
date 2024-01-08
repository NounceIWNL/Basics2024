package Lesson08_01_2024;

public enum Variety {
    GALA("red", "sweet"), FUJI("green", "sour"), GOLDEN("gold", "sweet-sour");

    private String color;

    private String taste;


    private Variety(String color, String taste) {
        this.color = color;
        this.taste = taste;
    }

    @Override
    public String toString() {
        return "Variety{" +
                "name='" + name() + '\'' +
                ", color='" + color + '\'' +
                ", taste='" + taste + '\'' +
                '}';
    }
}
