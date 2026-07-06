package com.cognizant.springlearn.service;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Service;

import com.cognizant.springlearn.Country;
import com.cognizant.springlearn.exception.CountryNotFoundException;

@Service
public class CountryService {

    private static List<Country> countryList;

    @SuppressWarnings("unchecked")
    public CountryService() {

        ApplicationContext context =
                new ClassPathXmlApplicationContext("country.xml");

        countryList = (List<Country>) context.getBean("countryList");

        ((ClassPathXmlApplicationContext) context).close();
    }

    // GET ALL
    public List<Country> getAllCountries() {
        return countryList;
    }

    // GET BY CODE
    public Country getCountry(String code)
            throws CountryNotFoundException {

        return countryList.stream()
                .filter(country -> country.getCode().equalsIgnoreCase(code))
                .findFirst()
                .orElseThrow(() ->
                        new CountryNotFoundException("Country not found"));
    }

    // CREATE
    public Country addCountry(Country country) {

        countryList.add(country);

        return country;
    }

    // UPDATE
    public Country updateCountry(Country updatedCountry)
            throws CountryNotFoundException {

        Country country = getCountry(updatedCountry.getCode());

        country.setName(updatedCountry.getName());

        return country;
    }

    // DELETE
    public void deleteCountry(String code)
            throws CountryNotFoundException {

        Country country = getCountry(code);

        countryList.remove(country);
    }

}