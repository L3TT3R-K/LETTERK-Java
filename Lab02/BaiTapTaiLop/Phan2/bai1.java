package Lab02.BaiTapTaiLop.Phan2;


abstract class Person {
    private String name;
    private int age;

    Person() {
    }

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public abstract void show();
}

class Employee extends Person {
    private float salary;

    Employee() {
    }

    Employee(String name, int age, float salary) {
        super(name, age);
        this.salary = salary;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    @Override
    public void show() {
        System.out.println("Name: " + getName());
        System.out.println("Age: " + getAge());
        System.out.println("Salary: " + salary);
    }

    public void addSalary() {
        this.salary *= 1.10f;
    }

    public void addSalary(float amount) {
        this.salary += amount;
    }
}

public class bai1 {
    public static void main(String[] args) {
        Employee emp = new Employee("Nguyen Van A", 25, 1000.0f);

        System.out.println("Thong tin ban dau:");
        emp.show();

        emp.addSalary();
        System.out.println("\nSau khi tang luong mac dinh 10%:");
        emp.show();

        emp.addSalary(200.0f);
        System.out.println("\nSau khi tang them 200:");
        emp.show();
    }
}
