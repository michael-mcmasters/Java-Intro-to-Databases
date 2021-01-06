package com.codedifferently;

import com.codedifferently.database.DataBase;

import java.util.List;

public class AddressBook {

    private Person owner;
    private List<Person> people;
    private DataBase dataBase;

    public AddressBook(DataBase dataBase) {
        this.dataBase = dataBase;
    }

    public Person getOwner() {
        return null;
    }

    public void setOwner(Person person) {

    }

    public void addPerson(Person person) {

    }

    public void removePerson(Person person) {

    }

    public Person getPersonByEmail(String str) {
        return null;
    }

    public List<Person> getAllPeople() {
        return null;
    }

    public boolean saveAll() {
        return false;
    }
}
