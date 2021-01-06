package com.codedifferently;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class PersonTest {

    public Person person;

    @Before
    public void init() {
        person = new Person("Michael", "McMasters", "JMcMasters411@gmail.com", 28);
    }

    @Test
    public void constructorTest() {
        person = new Person("George", "Washington", "Georgy@aol.com", 288);
        String expected = "George";
        String actual = person.getFirstName();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getFirstNameTest() {
        Assert.assertEquals(person.getFirstName(), "Michael");
    }

    @Test
    public void setFirstNameTest() {
        person.setFirstName("Kevin");
        String expected = "Kevin";
        String actual = person.getFirstName();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getLastNameTest() {
        Assert.assertEquals(person.getLastName(), "McMasters");
    }

    @Test
    public void setLastNameTest() {
        person.setLastName("Macaronni");
        String expected = "Macaronni";
        String actual = person.getLastName();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getAgeTest() {
        Integer expected = 28;
        Integer actual = person.getAge();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void setAgeTest() {
        person.setAge(20);
        Integer expected = 20;
        Integer actual = person.getAge();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getEmail() {
        String expected = "JMcMasters411@gmail.com";
        String actual = person.getEmail();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void setEmail() {
        person.setEmail("state@farm.com");
        String expected = "state@farm.com";
        String actual = person.getEmail();
        Assert.assertEquals(expected, actual);
    }
}
