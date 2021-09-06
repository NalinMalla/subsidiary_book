package com.codeSlayers.Subsidiary_Book.service;

import com.codeSlayers.Subsidiary_Book.Model.Admin;
import com.codeSlayers.Subsidiary_Book.Model.Customer;
import com.codeSlayers.Subsidiary_Book.dto.AdminDTO;
import com.codeSlayers.Subsidiary_Book.dto.CustomerDTO;

import java.util.List;

public interface CustomerService {
    Customer addCustomer(Customer customer);
    CustomerDTO findById(int id);
    List<CustomerDTO> findAll();        //Retrieve
    CustomerDTO updateCustomer(CustomerDTO customerDTO);        //Update
    void deleteCustomer(int id);
}
