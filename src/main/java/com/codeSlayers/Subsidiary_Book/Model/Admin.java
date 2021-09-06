package com.codeSlayers.Subsidiary_Book.Model;


import com.codeSlayers.Subsidiary_Book.dto.AdminDTO;
import com.codeSlayers.Subsidiary_Book.dto.UserDTO;
import com.codeSlayers.Subsidiary_Book.utils.Roles;

import javax.persistence.*;
import java.time.LocalDate;

//Is mapped with database so represents the structure of the table in the database
@Entity     //Maps objects with database
@Table(name = "admin")       //Specify which table to map it with
public class Admin {
    @Id     //For primary key
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    //user id is auto incremented sequentially not randomly like in AUTO
    private int id;
    private LocalDate joiningDate;
    private String position;
    private String phoneNumber;
    private String imagePath;


    @OneToOne(fetch = FetchType.LAZY)       //When Admin is queried if we use EAGER then all data is retrieved and if LAZY is used only the necessary data is retrieved and the rest is retrieved when needed. Here, user foreign key is the unnecessary data.
    @JoinColumn(name = "user_id")       //user_id is a column in the admin table where the user data is mapped
    private User user;

    public  Admin()
    {}

    public  Admin(AdminDTO adminDTO)
    {
        this.id = adminDTO.getId();
        this.joiningDate = adminDTO.getJoiningDate();
        this.position = adminDTO.getPosition();
        this.phoneNumber = adminDTO.getPhoneNumber();
        //User related is set in Implementation
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

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
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