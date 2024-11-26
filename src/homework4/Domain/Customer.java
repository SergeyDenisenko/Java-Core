package homework4.Domain;

public class Customer {
    private String name;
    private int age;
    private String phone;
    private Genders gender;

    enum Genders {
        MALE,
        FEMALE
    }

    Customer(String name, int age, String phone) {
        this.name = name;
        this.age = age;
        this.phone = phone;
    }

    Customer(String name, int age, String phone, Genders gender) {
        this(name, age, phone);
        this.gender = gender;
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

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Genders getGender() {
        return gender;
    }

    public void setGender(Genders gender) {
        this.gender = gender;
    }
}
