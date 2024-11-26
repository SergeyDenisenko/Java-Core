package homework4.Domain;

public class Order {
    private Customer customer;
    private Item item;
    private int quantity;

    public Order(Customer customer, Item item, int howMuch) {
        this.customer = customer;
        this.item = item;
        this.quantity = howMuch;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
