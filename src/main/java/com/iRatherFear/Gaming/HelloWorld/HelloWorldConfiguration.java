package com.iRatherFear.Gaming.HelloWorld;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.amqp.RabbitConnectionDetails;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

//record Person(String name, int age) {}
record Person(String name, int age, Address address){}
record Address(String firstLine, String city) {}
@Configuration
public class HelloWorldConfiguration {
    public  HelloWorldConfiguration(){}
    @Bean
    public String name() {
        return "Suuuu";
    }

    @Bean int age() {
        return 15;
    }
    @Bean
    public Person person() {
        return new Person("Sheldon", 33, new Address("Pasadena", "California"));
    }

    @Bean
    public Person getPersonUsingExistingBean() {
        return new Person(name(), age(), address());
    }

    /*
    * The bean is created such a way that all the paramters of this function
    * is name of some other beans in this file.
    * When we call this bean, values corresponding to each bean will be called.
    * E.g. There are three parameters name, age and getAddress. When we call this
    * bean, beans with these name will be called.
    *   NOTE: You can name this variable anything. But no two bean should repeat the same data type.
    * */
    @Bean
    public Person personParameterised(String name, int age, @Qualifier("addressfor")Address getAddress) {
        return new Person(name, age, getAddress);
    }
    @Bean(name = "getAddress")
    @Primary
    public Address address() {
        return new Address("High Street", "Balewadi");
    }

    @Bean(name = "getAddress2")
    @Qualifier("addressfor")
    public Address address2() {
        return new Address("High Street", "Balewadi");
    }


}
