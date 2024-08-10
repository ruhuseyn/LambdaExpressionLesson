package entity;

public class User {
    private String fullName;
    private int age;
    private int id;

    public User() {
    }

    public User(String fullName, int age, int id) {
        this.fullName = fullName;
        this.age = age;
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "User{" +
                "fullName='" + fullName + '\'' +
                ", age=" + age +
                ", id=" + id +
                '}';
    }
}
