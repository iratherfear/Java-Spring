package com.iRatherFear.Gaming.HelloWorld;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

record Person(String name, int age) {}
record Address(String firstLine, String city) {}
@Configuration
public class HelloWorldConfiguration {
    @Bean
    public String name() {
        return "Suuuu";
    }

    @Bean int age() {
        return 15;
    }
    @Bean
    public Person person() {
        return new Person("Sheldon", 33);
    }

    @Bean
    public Person getPersonUsingExistingBean() {
        return new Person(name(), age());
    }

    @Bean
    public Address address() {
        return new Address("21B Baker Stree", "London");
    }

    @Bean(name = "getAddress")
    public Address address2() {
        return new Address("High Street", "Balewadi");
    }
}
