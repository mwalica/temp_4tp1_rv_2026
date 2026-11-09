package ch.walica.a50_temp91126_4tp1_rv.model;

import java.util.concurrent.ThreadLocalRandom;

public class Person {

    private String name;
    private int age;

    public Person(String name) {
        this.name = name;
        this.age = ThreadLocalRandom.current().nextInt(18, 100);
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
