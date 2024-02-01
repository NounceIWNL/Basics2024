package Lesson08_01_2024;

class Admin extends User {

    public Admin(String adminName, String adminSurname) {
        super(adminName, adminSurname);
    }

    @Override
    public String toString() {
        return "Admin{" +
                "name='" + userName + '\'' +
                ", surname='" + userSurname + '\'' +
                '}';
    }
}
