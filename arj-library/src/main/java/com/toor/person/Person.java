package com.toor.person;

public class Person {

    private final String name;
    private final Job job;

    private Person(String name, Job job) {
        this.name = name;
        this.job = job;
    }

    public static Person of(String name, Job job) {
        return new Person(name, job);
    }

    public String getName() {
        return name;
    }

    public Job getJob() {
        return job;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", job='" + job + '\'' +
                '}';
    }
}
