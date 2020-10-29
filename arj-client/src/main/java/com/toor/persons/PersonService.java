package com.toor.persons;

import com.toor.person.Person;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonService {

    private final List<Person> personList;

    public PersonService(List<Person> personList) {
        this.personList = personList;
    }

    public List<Person> getPersonList() {
        return personList;
    }
}
