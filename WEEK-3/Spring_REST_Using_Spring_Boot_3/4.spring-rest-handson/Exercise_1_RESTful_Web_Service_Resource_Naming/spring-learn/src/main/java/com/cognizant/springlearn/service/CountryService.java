package com.cognizant.springlearn.service;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Service;

import com.cognizant.springlearn.Country;
import com.cognizant.springlearn.exception.CountryNotFoundException;

@Service
public class CountryService {

    @SuppressWarnings("unchecked")
    public List<Country> getAllCountries() {

        ApplicationContext context =
                new ClassPathXmlApplicationContext("country.xml");

        List<Country> countryList =
                (List<Country>) context.getBean("countryList");

        ((ClassPathXmlApplicationContext) context).close();

        return countryList;
    }

    @SuppressWarnings("unchecked")
    public Country getCountry(String code)
            throws CountryNotFoundException {

        ApplicationContext context =
                new ClassPathXmlApplicationContext("country.xml");

        List<Country> countryList =
                (List<Country>) context.getBean("countryList");

        ((ClassPathXmlApplicationContext) context).close();

        return countryList.stream()
                .filter(country -> country.getCode().equalsIgnoreCase(code))
                .findFirst()
                .orElseThrow(() ->
                        new CountryNotFoundException("Country not found"));
    }

}