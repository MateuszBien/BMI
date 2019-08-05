package com.company.CalculatorBMI.repository;

import com.company.CalculatorBMI.model.Person;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;


public interface BmiRepository extends CrudRepository<Person,Integer> {
}
