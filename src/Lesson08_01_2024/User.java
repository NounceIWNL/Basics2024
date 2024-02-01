package Lesson08_01_2024;

class User {

    protected String userName;

    protected String userSurname;

    public User(String userName, String userSurname) {
    }

    @Override //унаследован от класса Object
    public String toString() {
        return "User{" +
                "name='" + userName + '\'' +
                ", surname='" + userSurname + '\'' +
                '}';
    }

}
