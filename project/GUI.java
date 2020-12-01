package project;

import java.lang.*;
import java.util.*;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.*;

import project.Car;

class sComponent extends JComponent
{
    private int DEFAULT_WIDTH;
    private int DEFAULT_HEIGHT;

    Car c;

    public sComponent()
    {
        DEFAULT_WIDTH = 1000;
        DEFAULT_HEIGHT = 1000;
        BusinessLogic();
    }

    private void BusinessLogic()
    {
        c = new Car(30, 10, Car.ORANGE);
        Runnable task = () ->
        {
            c.goTo(500, 777);
            while(true)
            {
                repaint();
                try
                {
                    Thread.sleep(100);
                }
                catch(InterruptedException e)
                {
                    System.out.println(e);
                }
            }

        };
        new Thread(task).start();
    }

    public void paintComponent(Graphics gOld)
    {
        Graphics2D g = (Graphics2D)gOld;

        c.paint(g);
    }

    private void printBack(Graphics2D g)
    {
        Color prev = g.getColor();
    }

    public Dimension getPreferredSize()
    {
        return new Dimension(DEFAULT_WIDTH, DEFAULT_HEIGHT);
    }

    private void paintPixel(int X, int Y, Color c, Graphics2D g)
    {
        g.setPaint(c);
        g.fillRect(X, Y, 1, 1);
    }
}

public class GUI
{
    public static void main(String[] args)
    {
        EventQueue.invokeLater( () ->
        {
            sFrame frame = new sFrame();
            frame.setTitle("Road");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setVisible(true);
        }
        );
    }
}

class sFrame extends JFrame
{
    public sFrame()
    {
        this.add(new JScrollPane(new sComponent()));
        this.pack();
    }
}