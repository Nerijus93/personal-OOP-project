/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.zerohungerapp;

/**
 *
 * @author ITwork
 */
public abstract class Person {

    protected String name;
    protected String lastName;
    protected String email;
    protected String phone;

    /**
     * Constructor: initialize all person fields.
     *
     * @param name person's first name
     * @param lastName person's last name
     * @param email person's email address
     * @param phone person's phone number
     */
    public Person(String name, String lastName, String email, String phone) {
        this.name = name;           // store first name
        this.lastName = lastName;   // store last name
        this.email = email;         // store email
        this.phone = phone;         // store phone
    }

    // getters

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

    /**
     *
     * @return role information string
     */
    public abstract String getRoleInfo();

    /**
     *
     * @return multi-line representation of the person
     */
    @Override
    public String toString() {
        return "Name: " + name +
               "\nLast Name: " + lastName +
               "\nEmail: " + email +
               "\nPhone: " + phone;
    }
}
