package com.toor.persons;

import com.toor.person.Job;
import com.toor.person.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {

    @Bean
    public Person carl() {
        var name = "Carl";
        var title = "Engineer";
        var salary = 1000;
        return Person.of(name, new Job(title, salary));
    }

    @Bean
    public Person lenny() {
        return Person.of("Lenny", new Job("Engineer", 2000));
    }

}
