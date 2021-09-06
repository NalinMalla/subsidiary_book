package com.codeSlayers.Subsidiary_Book.repository;


import com.codeSlayers.Subsidiary_Book.Model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Integer> {
}
