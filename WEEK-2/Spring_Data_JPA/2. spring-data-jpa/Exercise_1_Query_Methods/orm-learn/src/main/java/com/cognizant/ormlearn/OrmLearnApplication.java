package com.cognizant.ormlearn;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.cognizant.ormlearn.model.Country;
import com.cognizant.ormlearn.service.CountryService;

@SpringBootApplication
public class OrmLearnApplication {

    private static final Logger LOGGER =
            LoggerFactory.getLogger(OrmLearnApplication.class);

    private static CountryService countryService;

    public static void main(String[] args) {

        ApplicationContext context =
                SpringApplication.run(OrmLearnApplication.class, args);

        countryService = context.getBean(CountryService.class);

        testSearchContaining();

        testSearchStartingWith();

        testSortedCountries();
    }

    private static void testSearchContaining() {

        LOGGER.info("Start");

        List<Country> countries =
                countryService.searchCountries("Ind");

        LOGGER.debug("Countries={}", countries);

        LOGGER.info("End");
    }

    private static void testSearchStartingWith() {

        LOGGER.info("Start");

        List<Country> countries =
                countryService.searchCountriesStartingWith("A");

        LOGGER.debug("Countries={}", countries);

        LOGGER.info("End");
    }

    private static void testSortedCountries() {

        LOGGER.info("Start");

        List<Country> countries =
                countryService.getCountriesSorted();

        LOGGER.debug("Countries={}", countries);

        LOGGER.info("End");
    }

}