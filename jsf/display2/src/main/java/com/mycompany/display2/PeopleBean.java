package com.mycompany.display2;

import jakarta.enterprise.context.SessionScoped;
import jakarta.inject.Named;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Named
@SessionScoped
public class PeopleBean implements Serializable {
    
    public static class Person {
        private String name;
        private String address;
        private String phoneNumber;

        // No-argument constructor
        public Person() {
        }

        // Constructor with fields
        public Person(String name, String address, String phoneNumber) {
            this.name = name;
            this.address = address;
            this.phoneNumber = phoneNumber;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getAddress() {
            return address;
        }

        public void setAddress(String address) {
            this.address = address;
        }

        public String getPhoneNumber() {
            return phoneNumber;
        }

        public void setPhoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
        }
    }
    
    public ArrayList<Person> getPeople() {
        ArrayList<Person> people = new ArrayList<>();

        people.add(new Person("John Doe", "123 Main St, Springfield", "555-1234"));
        people.add(new Person("Jane Smith", "456 Oak Ave, Metropolis", "555-5678"));
        people.add(new Person("Alice Johnson", "789 Pine Rd, Gotham", "555-8765"));

        return people;
    }
}
