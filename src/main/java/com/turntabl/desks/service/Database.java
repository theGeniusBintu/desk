package com.turntabl.desks.service;


import com.turntabl.desks.model.Desks;
import com.turntabl.desks.repository.DeskRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

@Configuration
class Database {
    private static final Logger log = LoggerFactory.getLogger(Database.class);

    CommandLineRunner initDatabase(DeskRepository repository){
        return args -> {
            log.info("Preloading "+ repository.save(new Desks("available", "Advantage Place")));
            log.info("Preloading "+ repository.save(new Desks("available", "Sonnidom")));

        };
    }
}
