/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication4;

import javax.swing.JFrame;

/**
 *
 * @author msa
 */
public class DrawSmileTest {
    public static void main(String[] args) {
        DrawSmile panel = new DrawSmile();
        JFrame application = new JFrame();
        application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        application.add(panel);
        application.setSize(230,250);
        application.setVisible(true);
        
    }
}
