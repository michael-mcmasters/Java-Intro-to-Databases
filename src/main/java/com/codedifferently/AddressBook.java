package com.codedifferently;

import com.codedifferently.database.DataBase;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

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
        Optional<Person> optional = people.stream()
                .filter(p -> p.getEmail().equals(emailStr))
                .findFirst();

        return optional.get();
    }

    public List<Person> getAllPeople() {
        return people;
    }

    public boolean saveAll() {
        return false;
    }
}
