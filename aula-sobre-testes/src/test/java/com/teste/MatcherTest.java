package com.teste;

import org.hamcrest.Matchers;
import org.hamcrest.beans.HasProperty;
import org.hamcrest.object.HasToString;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;

public class MatcherTest {

    @Test
    public void givenBean_checkToString() {
        Person person = new Person("Barrack", "Obama");
        String str = person.toString();
        assertThat(person, HasToString.hasToString(str));
    }

    @Test
    public void givenBean_checkPropertyExists() {
        Person person = new Person("Barrack", "Obama");
        assertThat(person, HasProperty.hasProperty("nome"));
    }

    @Test
    public void givenCollection_CheckEmpty() {
        List<String> emptyList = new ArrayList<String>();
        assertThat(emptyList, Matchers.empty());
    }

    @Test
    public void givenAnInteger_checkGrater() {
        assertThat(1,Matchers.greaterThan(0));
    }

    @Test
    public void givenString_checkNull() {
        String str = null;
        assertThat(str, Matchers.isEmptyOrNullString());
    }
}
