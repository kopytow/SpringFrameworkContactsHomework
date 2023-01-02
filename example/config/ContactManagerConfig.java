package org.example.config;

import org.example.ContactDao;
import org.example.InMemoryContactDao;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ContactManagerConfig {
    @Bean
    public ContactDao contactDao() {
        return new InMemoryContactDao();
    }
}
