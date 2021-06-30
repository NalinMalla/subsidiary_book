package com.strugglers.InfoOutlet.repository;


import com.strugglers.InfoOutlet.Model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Integer> {
}
