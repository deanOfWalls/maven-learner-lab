package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestPerson {

    @Test
    public void testConstructor(){
        //given
        Long expectedId = 1L;
        String expectedName = "Bob";

        //when (this is always the method being tested)
        Person person = new Person(expectedId, expectedName);

        Long actualId = person.getId();
        String actualName = person.getName();

        //then
        Assert.assertEquals(expectedName, actualName);
        Assert.assertEquals(expectedId, actualId);

    }

    @Test
    public void testSetName(){
        //given
        Person person = new Person(null, null);

        //when (this is always the method being tested)
        String expectedName = "Bob";
        person.setName(expectedName);
        String actualName = person.getName();

        //then
        Assert.assertEquals(expectedName, actualName);


    }

}
