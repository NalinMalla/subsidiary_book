package com.strugglers.InfoOutlet.service.implementation;

import com.strugglers.InfoOutlet.Model.Admin;
import com.strugglers.InfoOutlet.Model.Customer;
import com.strugglers.InfoOutlet.Model.User;
import com.strugglers.InfoOutlet.dto.AdminDTO;
import com.strugglers.InfoOutlet.dto.CustomerDTO;
import com.strugglers.InfoOutlet.dto.UserDTO;
import com.strugglers.InfoOutlet.repository.CustomerRepository;
import com.strugglers.InfoOutlet.repository.UserRepository;
import com.strugglers.InfoOutlet.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class CustomerImpl implements CustomerService {

    @Autowired
    private CustomerRepository customerRepository;

    @Autowired
    private UserRepository userRepository;

    @Override
    public Customer addCustomer(Customer customer) {
        return customerRepository.save(customer);
    }

    @Override
    public CustomerDTO findById(int id) {
        Optional<Customer> customerOptional = customerRepository.findById(id);
        Customer customer = customerOptional.orElseThrow(() -> new RuntimeException("Customer with given ID not found."));
        CustomerDTO customerDTO = new CustomerDTO(customer);
        UserDTO userDTO = new UserDTO(customer.getUser());
        customerDTO.setUserDTO(userDTO);
        return customerDTO;
    }

    @Override
    public List<CustomerDTO> findAll() {
        List<Customer> customers = customerRepository.findAll();
        List<CustomerDTO> customerDTOS = new ArrayList<>();
        for (Customer customer : customers) {
            CustomerDTO customerDTO = new CustomerDTO(customer);
            UserDTO userDTO = new UserDTO(customer.getUser());
            customerDTO.setUserDTO(userDTO);
            customerDTOS.add(customerDTO);
        }
        return customerDTOS;
    }

    @Override
    public CustomerDTO updateCustomer(CustomerDTO customerDTO) {
        Optional<Customer> optionalCustomer = customerRepository.findById(customerDTO.getId());
        Customer customer = optionalCustomer.orElseThrow(() -> new RuntimeException("Customer with given ID not found."));
        customer.setMembership(customerDTO.isMembership());
        customer.setCitizenshipId(customerDTO.getCitizenshipId());
        customer.setRegisterDate(customerDTO.getRegisterDate());

        UserDTO userDTO = customerDTO.getUserDTO();
        User user = customer.getUser();
        user.setAddress(userDTO.getAddress());
        user.setEmail(userDTO.getEmail());
        user.setFirstName(userDTO.getFirstName());
        user.setLastName(userDTO.getLastName());

        //Save the updatedUser to user repository
        User updatedUser = userRepository.save(user);
        //set the updated user to admin
        customer.setUser(updatedUser);

        //save the updated admin
        Customer updatedCustomer = customerRepository.save(customer);
        //convert the updated admin and user to DTOs so that they can be sent back to the interface side
        CustomerDTO updatedAdminDTO = new CustomerDTO(updatedCustomer);
        updatedAdminDTO.setUserDTO(new UserDTO(updatedCustomer.getUser()));
        return updatedAdminDTO;
    }

    @Override
    public void deleteCustomer(int id) {
        customerRepository.deleteById(id);
    }
}
