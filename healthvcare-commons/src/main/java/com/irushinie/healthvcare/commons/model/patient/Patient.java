package com.irushinie.healthvcare.commons.model.patient;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "patient")
public class Patient implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;

    String firstName;
    String lastName;
    String age;
    String gender;
    String homeAddress;
    String phoneNumber;



    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getId() {

        return id;
    }

    public void setId(int id) {
        this.id = id;
    }



    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }


    public String getHomeAddress() {
        return homeAddress;
    }

    public void setHomeAddress(String homeAddress) {
        this.homeAddress = homeAddress;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }





}