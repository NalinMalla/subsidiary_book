package com.codeSlayers.Subsidiary_Book.repository;

import com.codeSlayers.Subsidiary_Book.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;
//Repository is for getting data stored in the database unlike User which is used to add data in the database
//In spring boot no need to use DBMS queries manually all are done automatically.
@Repository     //We need UserRepository object in the beginning of the program so that database can be connected to it.
//The Java Persistence API (JPA) is a specification of Java. It is used to persist data between Java object and relational database. JPA acts as a bridge between object-oriented domain models and relational database systems. As JPA is just a specification, it doesn't perform any operation by itself.
public interface UserRepository extends JpaRepository<User, Integer> {      //Integer is the wrapper class of data type of the primary key
    //If we use UserDTO it shows error.
    //@Query("Select * from User where username = :username and password = :password")      //When there is a named query like given below we shouldn't give @Query
    Optional<User> findByUsernameAndPassword(String username, String password);
}

//UserRepository -> JpaRepository -> PagingAndSortingRepository -> CrudRepository