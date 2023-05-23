package codegym.com.model.person;

import java.io.Serializable;
import java.util.Date;

public abstract class Person implements Serializable {
    private String id;
    private String name;
    private int age;
    private String address;
    private String phone;
    private String gender;
    private String email;

    public Person() {
    }

    public Person(String id, String name, int age, String address, String phone, String gender, String email) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.address = address;
        this.phone = phone;
        this.gender = gender;
        this.email = email;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String isGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return id+" - "+ name + " - "+ age+ " - " + address+ " - "+ phone + " - "+ gender + " - "+ email;
    }
}
