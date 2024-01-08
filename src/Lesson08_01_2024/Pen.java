package Lesson08_01_2024;

public class Pen {
    private Color color; //Class (enumeration), object
    //private (в пределах класса)
    //protected (в пределах этого и дочернего классов)
    //public (в пределах пакета)
    //default (в пределах файла)

    //Конструктор
    Pen(Color color) {
        this.color = color;

    }

    @Override
    public String toString() {
        return "Pen{" +
                "color=" + color +
                '}';
    }
}
