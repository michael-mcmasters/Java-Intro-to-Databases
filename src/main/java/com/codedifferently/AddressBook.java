package com.codedifferently;

import com.codedifferently.database.DataBase;

import java.util.ArrayList;
import java.util.List;

public class AddressBook {

    private Person owner;
    private List<Person> people;
    private DataBase dataBase;

    public AddressBook(DataBase dataBase) {
        this.people = new ArrayList<>();
        this.dataBase = dataBase;
    }

    public Person getOwner() {
        return owner;
    }

    public void setOwner(Person person) {
        this.owner = person;
    }

    public void addPerson(Person person) {
        people.add(person);
    }

    public void removePerson(Person person) {
        people.remove(person);
    }

    public Person getPersonByEmail(String emailStr) {
        for (Person person : people) {
            if (person.getEmail().equals(emailStr)) {
                return person;
            }
        }
        return null;
    }

    public List<Person> getAllPeople() {
        return people;
    }

    public boolean saveAll() {
        return false;
    }
}
