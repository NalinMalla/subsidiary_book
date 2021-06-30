package com.strugglers.InfoOutlet.dto;

import com.strugglers.InfoOutlet.Model.Customer;

import java.time.LocalDate;

public class CustomerDTO {
    private int id;
    private LocalDate registerDate;
    private boolean membership;
    private String citizenshipId;
    private UserDTO userDTO;

    public CustomerDTO() {
    }

    public CustomerDTO(Customer customer) {
        this.id = customer.getId();
        this.registerDate = customer.getRegisterDate();
        this.membership = customer.isMembership();
        this.citizenshipId = customer.getCitizenshipId();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public LocalDate getRegisterDate() {
        return registerDate;
    }

    public void setRegisterDate(LocalDate registerDate) {
        this.registerDate = registerDate;
    }

    public boolean isMembership() {
        return membership;
    }

    public void setMembership(boolean membership) {
        this.membership = membership;
    }

    public String getCitizenshipId() {
        return citizenshipId;
    }

    public void setCitizenshipId(String citizenshipId) {
        this.citizenshipId = citizenshipId;
    }

    public UserDTO getUserDTO() {
        return userDTO;
    }

    public void setUserDTO(UserDTO userDTO) {
        this.userDTO = userDTO;
    }
}
