package com.codeSlayers.Subsidiary_Book.repository;

import com.codeSlayers.Subsidiary_Book.Model.Admin;
import com.codeSlayers.Subsidiary_Book.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;
//The Java Persistence API (JPA) is a specification of Java. It is used to persist data between Java object and relational database. JPA acts as a bridge between object-oriented domain models and relational database systems. As JPA is just a specification, it doesn't perform any operation by itself.
public interface AdminRepository extends JpaRepository<Admin, Integer> {        //if we use User instead of Admin here we get " No property user found for type User!" error.


    Optional<Admin>findByUser_usernameAndUser_password(String username, String password);      //firstName which is inside User which is inside Admin

}
