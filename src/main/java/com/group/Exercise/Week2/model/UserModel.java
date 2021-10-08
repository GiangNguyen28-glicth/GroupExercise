package com.group.Exercise.Week2.model;

import java.io.Serializable;

public class UserModel implements Serializable {
    private String firstName;
    private String lastName;
    private String email;


    private String heardFrom;

    private String wantsUpdates;
    private String contactVia;



    public UserModel() {
        firstName = "";
        lastName = "";
        email = "";
    }

    public UserModel(String firstName, String lastName, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
    }
    public UserModel(String firstName, String lastName, String email,String heardFrom,String wantsUpdates,String  contactVia) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.heardFrom=heardFrom;
        this.wantsUpdates=wantsUpdates;
        this.contactVia=contactVia;
    }

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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    public String getWantsUpdates() {
        return wantsUpdates;
    }

    public void setWantsUpdates(String wantsUpdates) {
        this.wantsUpdates = wantsUpdates;
    }
    public String getHeardFrom() {
        return heardFrom;
    }

    public void setHeardFrom(String heardFrom) {
        this.heardFrom = heardFrom;
    }

    public String getContactVia() {
        return contactVia;
    }

    public void setContactVia(String contactVia) {
        this.contactVia = contactVia;
    }

}
