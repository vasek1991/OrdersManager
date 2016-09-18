package com.metell_a.orders_manager.model;

import javafx.beans.property.SimpleStringProperty;
import lombok.ToString;

@ToString
public class Customer {
    private final SimpleStringProperty firstName;
    private final SimpleStringProperty lastName;
    private final SimpleStringProperty phone;


    public Customer(String firstName, String lastName, String phone) {
        this.firstName = new SimpleStringProperty(firstName);
        this.lastName = new SimpleStringProperty(lastName);
        this.phone = new SimpleStringProperty(phone);
    }


    public String getFirstName() {
        return firstName.get();
    }

    public SimpleStringProperty firstNameProperty() {
        return firstName;
    }

    public SimpleStringProperty lastNameProperty() {
        return lastName;
    }

    public SimpleStringProperty phoneProperty() {
        return phone;
    }

    public void setFirstName(String firstName) {
        this.firstName.set(firstName);
    }


    public String getLastName() {
        return lastName.get();
    }

    public void setLastName(String lastName) {
        this.lastName.set(lastName);
    }


    public String getPhone() {
        return phone.get();
    }

    public void setPhone(String phone) {
        this.phone.set(phone);
    }
}