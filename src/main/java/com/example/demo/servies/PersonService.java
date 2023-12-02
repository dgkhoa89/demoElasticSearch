package com.example.demo.servies;

import com.example.demo.entities.Person;
import com.example.demo.repository.PersonRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class PersonService {

    @Autowired
    PersonRepository personRepository;

    public void save(final Person person) {
        personRepository.save(person);
    }

    public Person getPerson(String id) {
        return personRepository.findById(id).orElse(null);
    }
}
