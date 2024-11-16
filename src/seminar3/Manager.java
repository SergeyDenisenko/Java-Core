package seminar3;

public class Manager extends Employee {

    public Manager(String name, String lastname, String surname, String position, String phone, int salary, int age, int day, int month, int year) {
        super(name, lastname, surname, position, phone, salary, age, day, month, year);
    }

    public static void increaserSalary(Employee[] emp, int age, int increment) {
        for (int i = 0; i < emp.length; i++) {
            if (emp[i].getAge() >= age && !(emp[i] instanceof Manager)) {
                emp[i].setSalary(emp[i].getSalary() + increment);
            }
        }
    }
}
