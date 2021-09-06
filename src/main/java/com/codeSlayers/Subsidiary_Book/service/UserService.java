package com.codeSlayers.Subsidiary_Book.service;

import com.codeSlayers.Subsidiary_Book.Model.User;
import com.codeSlayers.Subsidiary_Book.dto.UserDTO;
import java.util.List;

//This is mainly for adding features of the database into the actual user interface that the user uses so it uses UserDTO as it is responsible for the interface side data.
public interface UserService {
    UserDTO addUser(UserDTO userDTO);       //Create
    UserDTO login(String username, String password);
    UserDTO findByID(int id);
    List<UserDTO> findAll();        //Retrieve
    UserDTO updateUser(UserDTO userDTO);        //Update
    void deleteUser(int id);        //Delete
}

//What connects UserService to UserServiceImplementation such that every function used here is directed to UserServiceImplementation.
//This is because of the implements.
//Usually there is only one implementation but in case of multiple implementation we add @Qualifiers to the @Service and @AutoWire.
//If @Qualifier is not set it will show ambiguity error.
//After specifying @Qualifiers we can select which one to use in from the UserController.