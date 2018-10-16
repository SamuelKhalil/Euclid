/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication5;
import java.awt.*;
import javax.swing.*;
import java.awt.Canvas;
import java.awt.Graphics;
import javax.swing.JFrame;


/**
 *
 * @author Adrian
 */
public class Display extends Canvas {
    
    public static void main(String[] args) {
      
        
        createWindow();
    }
     public void paint(Graphics g) {
        g.fillRect(100, 100, 200, 200);
    }
    private static void createWindow(){
        JFrame frame = new JFrame("Euclid");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //JLabel textLabel = new JLabel("Euclid",SwingConstants.CENTER);
        //textLabel.setPreferredSize(new Dimension(300, 100));
        //frame.getContentPane().add(textLabel, BorderLayout.CENTER);
        
        frame.setLocationRelativeTo(null);
        frame.setSize(900,800);
        Canvas canvas = new Display();
        canvas.setSize(400, 400);
        canvas.setLocation(400, 0);
        frame.add(canvas);
        Canvas canvas2 = new Display();
        canvas2.setSize(400, 400);
        canvas2.setLocation(400, 350);
        frame.add(canvas2);
        Canvas canvas3 = new Display();
        canvas3.setSize(400, 400);
        canvas3.setLocation(0, 350);
        frame.add(canvas3);
        Canvas canvas4 = new Display();
        canvas4.setSize(400, 400);
        frame.add(canvas4);
        frame.setVisible(true);
        
        
        
    }
    
}
