package seminar3;

import java.util.Comparator;

/**
 * Класс сотрудника
 */
public class Employee {
    protected String name;
    protected String surname;
    protected String lastname;
    protected String position;
    protected String phone;
    protected int salary;
    protected int age;
    protected int day;
    protected int month;
    protected int year;

    public Employee(String name, String lastname, String surname, String position, String phone, int salary, int age, int day, int month, int year) {
        this.name = name;
        this.surname = surname;
        this.lastname = lastname;
        this.position = position;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public int compare(int year, int month, int day) {
        int days = day + (year * 12 * 30) + (month * 30);
        int days2 = this.day + (this.year * 12 * 30) + (this.month * 30);
        return days - days2;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getLastname() {
        return lastname;
    }

    public String getPosition() {
        return position;
    }

    public String getPhone() {
        return phone;
    }

    public int getSalary() {
        return salary;
    }

    public int getAge() {
        return age;
    }

    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", position='" + position + '\'' +
                ", phone='" + phone + '\'' +
                ", salary=" + salary +
                ", age=" + age +
                ", day=" + day +
                ", month=" + month +
                ", year=" + year +
                '}';
    }
}
