package codegym.com.model.person;

public class Customer extends Person{
    public Customer() {
    }

    public Customer(String id, String name, int age, String address, String phone, boolean gender, String email) {
        super(id, name, age, address, phone, gender, email);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
