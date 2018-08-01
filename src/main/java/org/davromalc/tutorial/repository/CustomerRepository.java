package org.davromalc.tutorial.repository;

import java.util.List;

import org.davromalc.tutorial.model.Customer;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

public interface CustomerRepository extends MongoRepository<Customer, String> {

    public Customer findByFirstName(String firstName);
    public List<Customer> findByLastName(String lastName);
    @Query("{ 'country' : ?0 }")
    public List<Customer> findByCountry(String country);

}
