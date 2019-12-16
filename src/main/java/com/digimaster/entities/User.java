package com.digimaster.entities;

import com.fasterxml.jackson.annotation.JsonFilter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;
import java.util.List;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;


//Entity
// and
@ApiModel(description = "This model is to create a user")
@Entity
@Table(name = "user")
//@JsonIgnoreProperties({"firstname", "lastname"})
//@JsonFilter(value = "userFilter")
public class User {

    @ApiModelProperty(notes = " Auto generated unique id", required = true, position = 1)
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;

    @ApiModelProperty(notes = "username should be in format flname", example = "kreddy", required = false, position = 2)
    @Size(min = 2, max = 50)
    @NotEmpty(message = "Username is Mandatory field. Please provide username")
    @Column(name = "USER_NAME", length = 50, nullable = false, unique = true)
    private String username;

    @Size(min=2, max = 50,  message="FirstName should have atleast 2 characters")
    @Column(name = "FIRST_NAME", length = 50, nullable = false)
    private String firstname;

    @Column(name = "LAST_NAME", length = 50, nullable = false)
    private String lastname;

    @Column(name = "EMAIL_ADDRESS", length = 50, nullable = false)
    private String email;

    @Column(name = "ROLE", length = 50, nullable = false)
    private String role;

    @Column(name = "SSN", length = 50, nullable = false, unique = true)
//    @JsonIgnore
    private String ssn;

    @Column(name = "PASSWORD", length = 100, nullable = false)
    private String password;

    @OneToMany(
            cascade = CascadeType.ALL,
            mappedBy="user")
    private List<Order> orders;

    @Column(name = "ADDRESS")
    private String address;

    // No Argument Constructor
    public User() {
    }

    // Fields Constructor
<<<<<<< HEAD
    public User(Long id, String username, String firstname, String lastname, String email,
                String role, String ssn) {
        this.id = id;
=======
    public User(String username, String firstname, String lastname, String email, String role, String ssn, String address, List<Order> orders, String password) {
>>>>>>> a4d6f62e2fe0f5154708ae649bd192010c9f6d3f
        this.username = username;
        this.firstname = firstname;
        this.lastname = lastname;
        this.email = email;
        this.role = role;
        this.ssn = ssn;
        this.address = address;
        this.orders = orders;
        this.password = password;
    }

    // Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getSsn() {
        return ssn;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }

    public List<Order> getOrders() {
        return orders;
    }

    public void setOrders(List<Order> orders) {
        this.orders = orders;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    // To String
//    @Override
//    public String toString() {
//        return "User{" +
//                "id=" + id +
//                ", username='" + username + '\'' +
//                ", firstname='" + firstname + '\'' +
//                ", lastname='" + lastname + '\'' +
//                ", email='" + email + '\'' +
//                ", role='" + role + '\'' +
//                ", ssn='" + ssn + '\'' +
//                ", orders=" + orders +
//                ", address='" + address + '\'' +
//                '}';
//    }
}
