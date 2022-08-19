package com.dio.heroes.configuration;

import com.dio.heroes.model.Hero;
import com.dio.heroes.repository.HeroRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class LoadDatabase {

    @Bean
    CommandLineRunner initDatabase(HeroRepository heroRepository){

        return args -> {
            heroRepository.save(new Hero("Superman", "O homem mais forte do mundo, com diversos poderes"));
            heroRepository.save(new Hero("Batman", "Rico"));
        };
    }
}
