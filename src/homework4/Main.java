package homework4;

import homework4.Domain.Customer;
import homework4.Domain.Item;
import homework4.Domain.Order;
import homework4.Exceptions.AmountException;
import homework4.Exceptions.CustomerException;
import homework4.Exceptions.ProductException;

public class Main {
    enum Parties {
        NONE,
        NEW_YEAR,
        MARCH_8,
        FEB_23
    }

    private static final Parties today = Parties.NONE;

    private final static Customer[] people = {
            new Customer("Ivan", 20, "+1-222-333-44-55"),
            new Customer("Petr", 30, "+2-333-444-55-66")
    };

    private final static Item[] items = {
            new Item("Ball", 100),
            new Item("Sandwich", 1000),
            new Item("Table", 10000),
            new Item("Car", 100000),
            new Item("Rocket", 10000000)
    };

    private static Order[] orders = new Order[5];

    public static void main(String[] args) {
        Object[][] info = {
                {people[0], items[0], 1}, //good
                {people[1], items[1], -1}, //bad amount -1
                {people[0], items[2], 150}, //bad amount >100
                {people[1], new Item("Flower", 10), 1}, //no item
                {new Customer("Fedor", 40, "+3-444-555-66-77"), items[3], 1}, //no customer
        };

        int capacity = 0;
        int i = 0;

        while (capacity != orders.length - 1 || i != info.length) {
            try {
                orders[capacity] = buy((Customer) info[i][0], (Item) info[i][1], (int) info[i][2]);
                capacity++;
            } catch (ProductException e) {
                e.printStackTrace();
            } catch (AmountException e) {
                orders[capacity++] = buy((Customer) info[i][0], (Item) info[i][1], 1);
            } catch (CustomerException e) {
                throw new RuntimeException(e);
            } finally {
                System.out.println("Orders made: " + capacity);
            }
            ++i;
        }

        celebrate(people);
    }

    private static void celebrate(Customer[] customers) {
        String congratulation;

        for (int i=0; i < customers.length; i++) {
            congratulation = ", Good morning!";
            switch (today) {
                case NEW_YEAR:
                    congratulation = ", happy New Year!";
                    break;
                case FEB_23:
                    if (customers[i].getGender() == Customer.Genders.MALE)
                        congratulation = ", happy February 23rd!";
                    break;
                case MARCH_8:
                    if (customers[i].getGender() == Customer.Genders.FEMALE)
                        congratulation = ", happy March 8th!";
                    break;
            }
            System.out.println(customers[i].getName() + congratulation);
        }
    }

    private static boolean isInArray(Object[] arr, Object o) {
        for (int i = 0; i < arr.length; i++)
            if (arr[i].equals(o)) return true;
        return false;
    }

    public static Order buy(Customer who, Item what, int howMuch) {
        if (!isInArray(people, who))
            throw new CustomerException("Unknown customer: " + who);
        if (!isInArray(items, what))
            throw new ProductException("Unknown item: " + what);
        if (howMuch < 0 || howMuch > 100)
            throw new AmountException("Incorrect amount: " + howMuch);
        return new Order(who, what, howMuch);
    }
}
