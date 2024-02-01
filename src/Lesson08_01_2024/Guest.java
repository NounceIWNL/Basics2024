package Lesson08_01_2024;

class Guest extends User {

    public Guest(String guestName, String guestSurname) {
        super(guestName, guestSurname);
    }

    @Override
    public String toString() {
        return "Guest{" +
                "name='" + userName + '\'' +
                ", surname='" + userSurname + '\'' +
                '}';
    }
}
