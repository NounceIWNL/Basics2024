package Lesson15_02_2024;

import java.util.PriorityQueue;
import java.util.Queue;

//Priority queue
public class GiantTurnip {
    public static void main(String[] args) {
        Queue<Personage> queue = new PriorityQueue<>();

        queue.add(new Personage("turnip", 27));
        queue.add(new Personage("mouse", 1));
        queue.add(new Personage("old man", 10));
        queue.add(new Personage("old woman", 7));
        queue.add(new Personage("granddaughter", 5));
        queue.add(new Personage("dog", 3));
        queue.add(new Personage("cat", 2));

//        while (!queue.isEmpty()) {
//            System.out.println(queue.poll().getName());
//            queue.peek();
//        }

        int full = 0;

        Personage personage = queue.poll();
        Personage personNext = null;

        while (!queue.isEmpty()) {
            full += personage.getStrength();
            personNext = queue.poll();
            System.out.println("The " + personage.getName() + " took hold of the " + personNext.getName());
            personage = personNext;
        }
        if (full > personNext.getStrength()) {
            System.out.println("They all pulled and pulled, and pulled some more - and finally out came the turnip!");
        } else System.out.println("They all pulled and pulled. But still they could not pull the turnip out.");

    }
}

class Personage implements Comparable {
    private final String name;
    private final int strength;

    Personage(String name, int strength) {

        this.name = name;
        this.strength = strength;
    }

    public String getName() {
        return name;
    }

    public int getStrength() {
        return strength;
    }

    @Override
    public int compareTo(Object o) {
        return (int) (this.getStrength() - ((Personage) o).getStrength());
    }
}
