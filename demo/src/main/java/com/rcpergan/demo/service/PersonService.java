package com.rcpergan.demo.service;

import com.rcpergan.demo.repository.IPersonRepository;
import com.rcpergan.demo.repository.entity.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonService {

    @Autowired
    IPersonRepository iPersonRepository;

    public void save(Person person) {
        iPersonRepository.save(person);
    }
    public void update(Person person) {
        iPersonRepository.save(person);
    }
    public void delete(Person person) {
        iPersonRepository.delete(person);
    }
    public List<Person> findAll() {
        return iPersonRepository.findAll();
    }
    public List<Person> findByName(String name) {
        return iPersonRepository.findByName(name);
    }

}
