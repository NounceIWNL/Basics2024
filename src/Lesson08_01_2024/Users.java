package Lesson08_01_2024;

import java.sql.SQLOutput;
import java.util.LinkedList;
import java.util.List;

public class Users {
    public static void main(String[] args) {
        User user = new User("userName", "userSurname");
        System.out.println(user.toString());

        User guest = new Guest("guestName", "guestSurname");
        System.out.println(guest.toString());

        User admin = new Admin("adminName", "adminSurname");
        System.out.println(guest.toString());

        List<User> users = new LinkedList<>();
        users.add(user);
        users.add(guest);
        users.add(admin);

        users.stream().forEach(System.out::println);
    }
}

