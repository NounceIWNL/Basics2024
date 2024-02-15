package Lesson15_02_2024;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class Vocabulary {
    public static void main(String[] args) {
        int count = 'z' - 'a';
//        System.out.println(count);
        List<String> vocab = new LinkedList<>();

        //заполнение из файла
        StringBuilder sb = new StringBuilder();
        try (BufferedReader br = new BufferedReader(new FileReader("src/Lesson15_02_2024/Vocab.txt"))) {
            String s;
            do {
                s = br.readLine();
                if (s != null)
                    vocab.add(s);
            }
            while (s != null);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
//        System.out.println(vocab.size());
        Collections.sort(vocab);
        System.out.println(vocab);

        ListIterator<String> it = vocab.listIterator(0);
        int i = 0;
        while (it.hasNext() && i < 10) {
            System.out.print(it.next() + " ");
            i++;
        }

    }
}
