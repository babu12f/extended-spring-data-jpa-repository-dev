package com.github.babu12f.extendedspringdatajparepositorydev;

import com.github.babu12f.extendedspringdatajparepository.repository.support.SimpleExtendedJpaRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(repositoryBaseClass = SimpleExtendedJpaRepository.class)
public class ExtendedSpringDataJpaRepositoryDevApplication {

    public static void main(String[] args) {
        SpringApplication.run(ExtendedSpringDataJpaRepositoryDevApplication.class, args);
    }

}
