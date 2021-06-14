package com.teste;

import org.junit.Test;

import static org.assertj.core.api.Assertions.*;

public class AssertJTest {
    @Test
    public void checkEquality() {
        Person person = new Person("Barrack", "Obama");
        Person personClone = person;

        assertThat(person).isEqualTo(personClone);
    }
}
