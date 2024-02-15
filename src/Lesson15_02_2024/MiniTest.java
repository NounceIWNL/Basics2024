package Lesson15_02_2024;


import java.util.*;

public class MiniTest {
    public static void main(String[] args) {
//        String first = new String("John 123");
//        String second = new String("Bill 132");
//        String third = new String("Mike 321");
        List<String> phoneBook= new ArrayList<>();

        phoneBook.add(String.valueOf(new Numbers("John",123)));
        phoneBook.add(String.valueOf(new Numbers("Bill",132)));
        phoneBook.add(String.valueOf(new Numbers("Mike",321)));



        Collections.sort(phoneBook);
        for (String number : phoneBook) {
            System.out.println(phoneBook);
        }
    }
}

class Numbers implements Comparable<String>{
    private String name;
    private int number;

    public Numbers(String name, int number) {
        this.name = name;
        this.number = number;
    }
    public String getName() {
        return name;
    }

    public int getNumber() {
        return number;
    }

    @Override
    public int compareTo(String o) {
        return 0;
    }


    @Override
    public String toString() {
        return "Numbers{" +
                "name='" + name + '\'' +
                ", number=" + number +
                '}';
    }
}
class CompSurname implements Comparator<String> {

    @Override
    public int compare(String o1, String o2) {
        return 0;
    }
}
