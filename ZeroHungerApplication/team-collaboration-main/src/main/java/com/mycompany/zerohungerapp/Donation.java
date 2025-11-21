/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.zerohungerapp;

/**
 *
 * @author ITwork
 */
public class Donation {
    
    private static int nextId = 1;   // Auto-generate unique ID's

    private int donationId;          // Each donation gets its own ID
    
    private Donor donor; // The donor who made the donation
    private String date;
    private String typeOfFood;
    private int quantity;

    //Constructor
    public Donation(Donor donor, String date, String typeOfFood, int quantity) {
        this.donor = donor;
        this.date = date;
        this.typeOfFood = typeOfFood;
        this.quantity = quantity;
        this.donationId = nextId++;
    }
    
    // Getters
    public Donor getDonor() {
        return donor;
    }

    public int getDonationId() {
        return donationId;
    }

    public String getDate() {
        return date;
    }

    public String getTypeOfFood() {
        return typeOfFood;
    }

    public int getQuantity() {
        return quantity;
    }

    @Override
    public String toString() {
        return "=== Donation #" + donationId + " ===\n"
                + donor.toString() + "\n"
                + "Food: " + typeOfFood + "\n"
                + "Quantity: " + quantity + "\n"
                + "Date: " + date + "\n";
    }
}
