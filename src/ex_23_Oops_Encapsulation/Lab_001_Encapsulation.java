package ex_23_Oops_Encapsulation;

public class Lab_001_Encapsulation {
    public static void main(String[] args) {

        /**
         Encapsulation is one of the core concepts of Object-Oriented Programming (OOP) in Java.
         It refers to the practice of wrapping data (variables) and code (methods) together into a single unit (like a class),
         and restricting direct access to some of the object's components.
         */

        Employee emp = new Employee("monu", 28, 36000);
        System.out.println(emp.getName());
        System.out.println(emp.getAge());


        int salary = emp.getSalary();
        System.out.println(salary);

        emp.setSalary(5000, true);

        int salary2 = emp.getSalary();
        System.out.println(salary2);

    }
}


class Employee {

    private String name;
    private int salary;
    private int age;

    public Employee(String name, int salary, int age) {
        this.name = name;
        this.salary = salary;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary, boolean isEmploy) {
        if (isEmploy){
            this.salary = salary;
        }else {
            System.out.println("Not Allowed Other Person !");

        }

    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}