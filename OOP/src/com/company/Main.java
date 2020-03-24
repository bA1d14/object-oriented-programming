package com.company;
import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        JFrame frame  = new JFrame("GameForOOP");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(852, 480);
        frame.add(new Table());
        frame.setVisible(true);


    }
}
