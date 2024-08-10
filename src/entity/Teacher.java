package entity;

public class Teacher extends User {
    private int salary;
    private String subject;

    public Teacher() {
    }


    public Teacher(String fullName, int age, int id, int salary, String subject) {
        super(fullName, age, id);
        this.salary = salary;
        this.subject = subject;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "salary=" + salary +
                ", subject='" + subject + '\'' +
                "} " + super.toString();
    }

}
