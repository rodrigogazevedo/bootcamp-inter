package com.teste;

public class Person {
    private String nome;
    private String lastName;

    public Person(String nome, String lastName) {
        this.nome = nome;
        this.lastName = lastName;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
