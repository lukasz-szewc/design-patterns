package pl.designpatterns.structual.proxy;

public class Person {

    private String name;
    private String sureName;
    private int age;

    public Person(String name, String sureName, int age) {
        this.name = name;
        this.sureName = sureName;
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age && name.equals(person.name) && sureName.equals(person.sureName);
    }

    @Override
    public int hashCode() {
        int result = name.hashCode();
        result = 31 * result + sureName.hashCode();
        result = 31 * result + age;
        return result;
    }

    @Override
    public String toString() {
        return "Person{" + "name=" + name + ", sureName=" + sureName + ", age=" + age + '}';
    }

}
