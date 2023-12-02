package com.example.demo.repository;

import com.example.demo.entities.Person;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

public interface PersonRepository extends ElasticsearchRepository<Person, String> {

    //implementation is in Simple SimpleElasticsearchRepository
}
