package seminar3;

public class Main {
    public static void main(String[] args) {
        Employee ivan = new Employee("Ivan", "Igorevich", "Ovchinnikov", "developer", "8(495)000-11-22", 50000, 23, 5, 10, 2020);
        Employee andrey = new Employee("Andrey", "Victorovich", "Bezrukov", "fitter", "8(495)111-22-33", 52000, 25, 20, 5, 2019);
        Employee evgeniy = new Employee("Evgeniy", "Victorovich", "Oelfinov", "project manager", "8(495)222-33-44", 40000, 30, 7, 11, 2021);
        Employee natalia = new Employee("Natalia", "Pavlovna", "Keks", "senior developer", "8(495)444-55-66", 90000, 29, 28, 4, 2015);
        Employee tatiana = new Employee("Tatiana", "Sergeevna", "Krasotkina", "accountant", "8(495)333-44-55", 50000, 27, 23, 6, 2018);
        Manager manager = new Manager("Kiril", "Pavlovich", "Petrov", "manager", "8(495)888-99-88", 100000, 28, 11, 8, 2022);

        Employee[] group = new Employee[6];
        group[0] = ivan;
        group[1] = andrey;
        group[2] = evgeniy;
        group[3] = natalia;
        group[4] = tatiana;
        group[5] = manager;

        for (Employee employee : group) {
            System.out.println(employee.getSalary());
        }
        System.out.println("---");

        Manager.increaserSalary(group, 1, 10000);
        for (Employee employee : group) {
            System.out.println(employee.getSalary());
        }
    }
}
