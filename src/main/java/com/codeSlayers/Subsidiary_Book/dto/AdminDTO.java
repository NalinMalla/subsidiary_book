package com.codeSlayers.Subsidiary_Book.dto;

import com.codeSlayers.Subsidiary_Book.Model.Admin;
import com.codeSlayers.Subsidiary_Book.Model.User;

import java.time.LocalDate;

public class AdminDTO {
    private int id;
    private LocalDate joiningDate;
    private String position;
    private String phoneNumber;
    private String imagePath;
    private UserDTO userDTO;

    public AdminDTO()
    {
    }

    public  AdminDTO(Admin admin)
    {
        this.id = admin.getId();
        this.joiningDate = admin.getJoiningDate();
        this.position = admin.getPosition();
        //this.userDTO = new UserDTO(admin.getUser());        //Less good due to type coupling i.e. if there is a case where u need to use this constructor there is a high chance of sending this null.
        //We set the data of userDto in the AdminServiceImplementation.
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    public LocalDate getJoiningDate() {
        return joiningDate;
    }

    public void setJoiningDate(LocalDate joiningDate) {
        this.joiningDate = joiningDate;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public UserDTO getUserDTO() {
        return userDTO;
    }

    public void setUserDTO(UserDTO userDTO) {
        this.userDTO = userDTO;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getImagePath() {
        return imagePath;
    }

    public void setImagePath(String imagePath) {
        this.imagePath = imagePath;
    }
}
