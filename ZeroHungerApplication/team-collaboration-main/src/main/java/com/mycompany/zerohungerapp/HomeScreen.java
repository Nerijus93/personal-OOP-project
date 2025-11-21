/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.zerohungerapp;

import java.awt.GridLayout;
import javax.swing.*;

/**
 *
 *
 * @author ITwork
 */
public class HomeScreen extends JFrame {

    public HomeScreen() {
        
        // Window title and size
        setTitle("Zero Hunger App");
        setSize(600, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        
        // Big title label at the top of UI
        JLabel pageTitleLabel = new JLabel("Welcome to The Zero Hunger App", SwingConstants.CENTER);
        pageTitleLabel.setFont(pageTitleLabel.getFont().deriveFont(30f));

        // Vertical buttons
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(0, 1));
        
        // Three action buttons
        JButton donationButton = new JButton("Donations Management");
        JButton memberButton = new JButton("Become a Member");
        JButton restaurantButton = new JButton("Restaurant Manager");

        // Open DonationScreen and Display it
        donationButton.addActionListener(e -> {
            DonationScreen ds = new DonationScreen(this);
            ds.setVisible(true);
            this.setVisible(false);
        });

        add(pageTitleLabel, "North");

        panel.add(donationButton);

        panel.add(memberButton);

        panel.add(restaurantButton);

        add(panel);

        setVisible(true);
    }
}
