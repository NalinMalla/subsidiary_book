package com.strugglers.InfoOutlet.service;

import com.strugglers.InfoOutlet.Model.Admin;
import com.strugglers.InfoOutlet.Model.Customer;
import com.strugglers.InfoOutlet.dto.AdminDTO;
import com.strugglers.InfoOutlet.dto.CustomerDTO;

import java.util.List;

public interface CustomerService {
    Customer addCustomer(Customer customer);
    CustomerDTO findById(int id);
    List<CustomerDTO> findAll();        //Retrieve
    CustomerDTO updateCustomer(CustomerDTO customerDTO);        //Update
    void deleteCustomer(int id);
}
