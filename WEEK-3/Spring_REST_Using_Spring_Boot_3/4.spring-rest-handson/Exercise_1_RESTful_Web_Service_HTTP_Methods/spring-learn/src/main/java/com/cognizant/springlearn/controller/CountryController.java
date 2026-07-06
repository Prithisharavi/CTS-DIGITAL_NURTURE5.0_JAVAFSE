package com.cognizant.springlearn.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cognizant.springlearn.Country;
import com.cognizant.springlearn.exception.CountryNotFoundException;
import com.cognizant.springlearn.service.CountryService;

@RestController
@RequestMapping("/countries")
public class CountryController {

    private static final Logger LOGGER =
            LoggerFactory.getLogger(CountryController.class);

    @Autowired
    private CountryService countryService;

    // GET ALL COUNTRIES
    @GetMapping
    public List<Country> getAllCountries() {

        LOGGER.info("START");

        List<Country> countryList = countryService.getAllCountries();

        LOGGER.info("END");

        return countryList;
    }

    // GET COUNTRY BY CODE
    @GetMapping("/{code}")
    public Country getCountry(@PathVariable String code)
            throws CountryNotFoundException {

        LOGGER.info("START");

        Country country = countryService.getCountry(code);

        LOGGER.info("END");

        return country;
    }

    // CREATE COUNTRY
    @PostMapping
    public Country addCountry(@RequestBody Country country) {

        LOGGER.info("START");

        Country newCountry = countryService.addCountry(country);

        LOGGER.info("END");

        return newCountry;
    }

    // UPDATE COUNTRY
    @PutMapping
    public Country updateCountry(@RequestBody Country country)
            throws CountryNotFoundException {

        LOGGER.info("START");

        Country updatedCountry = countryService.updateCountry(country);

        LOGGER.info("END");

        return updatedCountry;
    }

    // DELETE COUNTRY
    @DeleteMapping("/{code}")
    public String deleteCountry(@PathVariable String code)
            throws CountryNotFoundException {

        LOGGER.info("START");

        countryService.deleteCountry(code);

        LOGGER.info("END");

        return "Country deleted successfully";
    }

}