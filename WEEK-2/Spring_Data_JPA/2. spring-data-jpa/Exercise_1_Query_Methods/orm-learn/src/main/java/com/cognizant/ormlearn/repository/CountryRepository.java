package com.cognizant.ormlearn.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cognizant.ormlearn.model.Country;

@Repository
public interface CountryRepository extends JpaRepository<Country, String> {

    // Search by containing text
    List<Country> findByNameContainingIgnoreCase(String text);

    // Search by containing text and sort ascending
    List<Country> findByNameContainingIgnoreCaseOrderByNameAsc(String text);

    // Search by starting letter
    List<Country> findByNameStartingWithIgnoreCase(String letter);

}