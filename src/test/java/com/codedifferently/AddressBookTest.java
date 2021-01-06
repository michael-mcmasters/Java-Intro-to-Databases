package com.codedifferently;

import com.codedifferently.database.DataBase;
import com.codedifferently.database.DataBaseConnectionException;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

public class AddressBookTest {

    AddressBook addressBook;

    @Before
    public void init() throws DataBaseConnectionException {
        DataBase dataBase = new DataBase();
        addressBook = new AddressBook(dataBase);

        Person michael = new Person("Michael", "McMasters", "jmcmasters411@gmail.com", 28);
        Person steph = new Person("Steph", "Gar", "stephyG@gmail.com", 28);
        Person peter = new Person("Peter", "Collins", "petercollins@aim.com", 28);
        addressBook.addPerson(michael);
        addressBook.addPerson(steph);
        addressBook.addPerson(peter);
    }

    @Test
    public void getAndSetOwner() {
        Person person = new Person("Kevin", "Tomato", "KevT@gmail.com", 30);
        addressBook.setOwner(person);
        Person expected = person;
        Person actual = addressBook.getOwner();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void addPersonTest() {
        Person person = new Person("Chisty", "Tree", "greentreeoaks@gta.com", 40);
        addressBook.addPerson(person);
        List<Person> people = addressBook.getAllPeople();
        Assert.assertTrue(people.size() > 0);
    }

    @Test
    public void removePersonTest() {
        Person christy = new Person("Chisty", "Tree", "greentreeoaks@gta.com", 40);
        addressBook.addPerson(christy);
        addressBook.removePerson(christy);
        List<Person> persons = addressBook.getAllPeople();
        for (Person p : persons) {
            if (p == christy) {
                Assert.fail();
            }
        }
        // Assert.pass() doesn't exist, but test will pass automatically if the above assert.fail() doesn't run.
    }

    @Test
    public void getPersonByEmailTest() {
        Person christy = new Person("Chisty", "Tree", "greentreeoaks@gta.com", 40);
        Person person = addressBook.getPersonByEmail(christy.getEmail());
        Assert.assertEquals(christy, person);
    }

    @Test
    public void getAllPeopleTest() {
        List<Person> people = addressBook.getAllPeople();
        Assert.assertTrue(people.size() > 0);
    }

    @Test
    public void saveAllTest() {
        Assert.assertTrue(addressBook.saveAll());
    }

}
