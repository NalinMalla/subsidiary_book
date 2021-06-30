package com.strugglers.InfoOutlet.controller;

import com.strugglers.InfoOutlet.dto.CustomerDTO;
import com.strugglers.InfoOutlet.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/customers")
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @GetMapping
    public List<CustomerDTO> getAll() {
        return customerService.findAll();
    }

    @GetMapping("/{id}")
    public CustomerDTO getById(@PathVariable int id) {
        return customerService.findById(id);
    }

    @DeleteMapping("/{id}")
    public String deleteCustomer(@PathVariable int id) {
        customerService.deleteCustomer((id));
        return "Customer of id : " + id + " deleted";
    }

    @PutMapping
    public CustomerDTO updateCustomer(@RequestBody CustomerDTO customerDTO) {
        return customerService.updateCustomer(customerDTO);
    }

}
