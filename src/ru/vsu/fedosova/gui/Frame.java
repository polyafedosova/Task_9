package ru.vsu.fedosova.gui;

import ru.vsu.fedosova.gui.listener.ApplyButtonListener;

import javax.swing.*;

public class Frame extends JFrame {
    private JPanel mainPanel;
    private JTextField inputList;
    private JButton applyButton;
    private JTextField outputSortedList;

    public Frame() {
        this.setTitle("Sort the list");
        this.setContentPane(mainPanel);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.pack();
        this.setBounds(750, 300, 500, 150);

        this.applyButton.addActionListener(new ApplyButtonListener(inputList, outputSortedList));

        this.setVisible(true);
    }
}
