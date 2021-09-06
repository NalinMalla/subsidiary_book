package com.codeSlayers.Subsidiary_Book.service;

import com.codeSlayers.Subsidiary_Book.Model.Admin;
import com.codeSlayers.Subsidiary_Book.Model.User;
import com.codeSlayers.Subsidiary_Book.dto.AdminDTO;
import com.codeSlayers.Subsidiary_Book.dto.AdminDTO;
import java.util.List;

//This is mainly for adding features of the database into the actual user interface that the user uses so it uses AdminDTO as it is responsible for the interface side data.
public interface  AdminService {

    AdminDTO login(String username, String password);
    AdminDTO findByID(int id);
    List<AdminDTO> findAll();        //Retrieve
    AdminDTO updateAdmin(AdminDTO adminDTO);        //Update
    void deleteAdmin(int id);        //Delete
}