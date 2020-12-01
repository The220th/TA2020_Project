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
    private Color SunMoon;
	private boolean redCatched;

    private int BeginX = 10;
    private int BeginY = 350;

    private int currentState;

    Car c;
    Queue<Integer> DeWayX;
    Queue<Integer> DeWayY;

    private int nextState(int in)
    {
        int out = -1;
        switch(currentState)
        {
            case 0:
            {
                switch(in)
                {
                    case 0:
                    {
                        currentState = 1;
                        out = 1;
                        break;
                    }
                    case 1:
                    {
                        currentState = 0;
                        out = 0;
                        break;
                    }
                    case 2:
                    {
                        currentState = 0;
                        out = 0;
                        break;
                    }
                    case 3:
                    {
                        currentState = 0;
                        out = 3;
                        break;
                    }
                    case 4:
                    {
                        currentState = 2;
                        out = 0;
                        break;
                    }
                    case 5:
                    {
                        currentState = 0;
                        out = 0;
                        break;
                    }
                    case 6:
                    {
                        currentState = 0;
                        out = 0;
                        break;
                    }
                    case 7:
                    {
                        currentState = 4;
                        out = 0;
                        break;
                    }
                }
                break;
            }
            case 1:
            {
                switch(in)
                {
                    case 0:
                    {
                        currentState = 1;
                        out = 0;
                        break;
                    }
                    case 1:
                    {
                        currentState = 0;
                        out = 1;
                        break;
                    }
                    case 2:
                    {
                        currentState = 1;
                        out = 0;
                        break;
                    }
                    case 3:
                    {
                        currentState = 1;
                        out = 3;
                        break;
                    }
                    case 4:
                    {
                        currentState = 2;
                        out = 0;
                        break;
                    }
                    case 5:
                    {
                        currentState = 1;
                        out = 0;
                        break;
                    }
                    case 6:
                    {
                        currentState = 1;
                        out = 0;
                        break;
                    }
                    case 7:
                    {
                        currentState = 5;
                        out = 0;
                        break;
                    }
                }
                break;
            }
            case 2:
            {
                switch(in)
                {
                    case 0:
                    {
                        currentState = 3;
                        out = 2;
                        break;
                    }
                    case 1:
                    {
                        currentState = 3;
                        out = 2;
                        break;
                    }
                    case 2:
                    {
                        currentState = 3;
                        out = 2;
                        break;
                    }
                    case 3:
                    {
                        currentState = 3;
                        out = 2;
                        break;
                    }
                    case 4:
                    {
                        currentState = 2;
                        out = 2;
                        break;
                    }
                    case 5:
                    {
                        currentState = 3;
                        out = 2;
                        break;
                    }
                    case 6:
                    {
                        currentState = 2;
                        out = 0;
                        break;
                    }
                    case 7:
                    {
                        currentState = 6;
                        out = 2;
                        break;
                    }
                }
                break;
            }
            case 3:
            {
                switch(in)
                {
                    case 0:
                    {
                        currentState = 0;
                        out = 2;
                        break;
                    }
                    case 1:
                    {
                        currentState = 0;
                        out = 2;
                        break;
                    }
                    case 2:
                    {
                        currentState = 0;
                        out = 2;
                        break;
                    }
                    case 3:
                    {
                        currentState = 0;
                        out = 2;
                        break;
                    }
                    case 4:
                    {
                        currentState = 2;
                        out = 0;
                        break;
                    }
                    case 5:
                    {
                        currentState = 0;
                        out = 2;
                        break;
                    }
                    case 6:
                    {
                        currentState = 3;
                        out = 0;
                        break;
                    }
                    case 7:
                    {
                        currentState = 7;
                        out = 0;
                        break;
                    }
                }
                break;
            }
            case 4:
            {
                switch(in)
                {
                    case 0:
                    {
                        currentState = 5;
                        out = 1;
                        break;
                    }
                    case 1:
                    {
                        currentState = 4;
                        out = 0;
                        break;
                    }
                    case 2:
                    {
                        currentState = 4;
                        out = 2;
                        break;
                    }
                    case 3:
                    {
                        currentState = 4;
                        out = 3;
                        break;
                    }
                    case 4:
                    {
                        currentState = 6;
                        out = 0;
                        break;
                    }
                    case 5:
                    {
                        currentState = 4;
                        out = 0;
                        break;
                    }
                    case 6:
                    {
                        currentState = 0;
                        out = 0;
                        break;
                    }
                    case 7:
                    {
                        currentState = 4;
                        out = 0;
                        break;
                    }
                }
                break;
            }
            case 5:
            {
                switch(in)
                {
                    case 0:
                    {
                        currentState = 5;
                        out = 0;
                        break;
                    }
                    case 1:
                    {
                        currentState = 4;
                        out = 1;
                        break;
                    }
                    case 2:
                    {
                        currentState = 5;
                        out = 2;
                        break;
                    }
                    case 3:
                    {
                        currentState = 5;
                        out = 3;
                        break;
                    }
                    case 4:
                    {
                        currentState = 6;
                        out = 0;
                        break;
                    }
                    case 5:
                    {
                        currentState = 5;
                        out = 0;
                        break;
                    }
                    case 6:
                    {
                        currentState = 1;
                        out = 0;
                        break;
                    }
                    case 7:
                    {
                        currentState = 5;
                        out = 0;
                        break;
                    }
                }
                break;
            }
            case 6:
            {
                switch(in)
                {
                    case 0:
                    {
                        currentState = 7;
                        out = 2;
                        break;
                    }
                    case 1:
                    {
                        currentState = 7;
                        out = 2;
                        break;
                    }
                    case 2:
                    {
                        currentState = 6;
                        out = 2;
                        break;
                    }
                    case 3:
                    {
                        currentState = 7;
                        out = 2;
                        break;
                    }
                    case 4:
                    {
                        currentState = 6;
                        out = 0;
                        break;
                    }
                    case 5:
                    {
                        currentState = 7;
                        out = 2;
                        break;
                    }
                    case 6:
                    {
                        currentState = 2;
                        out = 0;
                        break;
                    }
                    case 7:
                    {
                        currentState = 6;
                        out = 0;
                        break;
                    }
                }
                break;
            }
            case 7:
            {
                switch(in)
                {
                    case 0:
                    {
                        currentState = 4;
                        out = 2;
                        break;
                    }
                    case 1:
                    {
                        currentState = 4;
                        out = 2;
                        break;
                    }
                    case 2:
                    {
                        currentState = 7;
                        out = 2;
                        break;
                    }
                    case 3:
                    {
                        currentState = 4;
                        out = 2;
                        break;
                    }
                    case 4:
                    {
                        currentState = 6;
                        out = 0;
                        break;
                    }
                    case 5:
                    {
                        currentState = 4;
                        out = 2;
                        break;
                    }
                    case 6:
                    {
                        currentState = 3;
                        out = 0;
                        break;
                    }
                    case 7:
                    {
                        currentState = 7;
                        out = 0;
                        break;
                    }
                }
                break;
            }
        }
        return out;
    }

    public sComponent()
    {
        DEFAULT_WIDTH = 1000;
        DEFAULT_HEIGHT = 1000;
        BusinessLogic();
        currentState = 0;
        SunMoon = Color.YELLOW;
		redCatched = false;
    }

    private void genIn()
    {
        Random r = new Random();
        int in = r.nextInt(8);
        if(in <= 5)
		{
			if(in == 4)
				redCatched = false;
            c = new Car(BeginX, BeginY, in);
		}
        else
        {
            if(in == 6)
                SunMoon = Color.YELLOW;
            if(in == 7)
                SunMoon = Color.WHITE;
            c = null;
            DeWayX = null;
            DeWayY = null;
        }
        int out = nextState(in);
        DeWayX = new LinkedList<Integer>();
        DeWayY = new LinkedList<Integer>();
        switch(out)
        {
            case 0:
            {
                DeWayX.add(Integer.valueOf(1000));
                DeWayY.add(Integer.valueOf(BeginY));
                break;
            }
            case 1:	//Поймать
            {
				redCatched = !redCatched;
                DeWayX.add(Integer.valueOf(550));
                DeWayY.add(Integer.valueOf(BeginY));
                DeWayX.add(Integer.valueOf(550));
                DeWayY.add(Integer.valueOf(570));
                break;
            }
            case 2:
            {
                DeWayX.add(Integer.valueOf(750));
                DeWayY.add(Integer.valueOf(BeginY));
                DeWayX.add(Integer.valueOf(750));
                DeWayY.add(Integer.valueOf(770));
                DeWayX.add(Integer.valueOf(0));
                DeWayY.add(Integer.valueOf(770));
                break;
            }
            case 3:	//Добавить по центру дороги НАДО НОРМАЛЬНУЮ ДОРОГУ!!!!
            {
                DeWayX.add(Integer.valueOf(670));
                DeWayY.add(Integer.valueOf(BeginY));
				DeWayX.add(Integer.valueOf(825));
				DeWayY.add(Integer.valueOf(140));
                DeWayX.add(Integer.valueOf(925));
                DeWayY.add(Integer.valueOf(0));
                break;
            }
        }
    }

    private void BusinessLogic()
    {
        Runnable task = () ->
        {
            while(true)
            {
                if(c == null)
                    genIn();
                
                if(!DeWayX.isEmpty())
                {
                    if(c != null && c.isBusy() == false)
                    {
                        c.goTo(DeWayX.poll().intValue(), DeWayY.poll().intValue());
                    }
                }
                else
                {
                    if(c != null && c.isBusy() == false)
                        c = null;
                }


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

        
        printBack(g);
        if(c != null)
            c.paint(g);
    }

    private void printBack(Graphics2D g)
    {
        Color prev = g.getColor();

        //sun or moon
        g.setPaint(SunMoon);
        g.fillOval(10, 10, 75, 75);

        //road
        g.setPaint(new Color(50, 50, 50));
        g.drawLine(0, 300,  700, 300);
        g.drawLine(0, 450,  700, 450);
        g.drawLine(850, 450, 1000, 450);
        g.drawLine(850, 300, 1000, 300);
        g.setPaint(Color.GRAY);
        g.fillRect(870, 330, 70, 30);
        g.setPaint(Color.BLACK);
        g.drawString("Direct", 870, 350);
        //back
        g.drawLine(700, 450, 700, 700);
        g.drawLine(850, 450, 850, 850);
        g.drawLine(700, 700, 0, 700);
        g.drawLine(850, 850, 0, 850);
        g.setPaint(Color.GRAY);
        g.fillRect(720, 480, 70, 30);
        g.setPaint(Color.BLACK);
        g.drawString("Backward", 720, 500);
        //yellow road
        g.drawLine(700, 300, 850, 0);
        g.drawLine(850, 300, 1000, 50);
        g.setPaint(Color.YELLOW);
        g.fillRect(730, 250, 70, 30);
        g.setPaint(Color.BLACK);
        g.drawString("Yellow road", 730, 270);

        //KAPMAH
        g.drawLine(500, 450, 500, 600);
        g.drawLine(650, 450, 650, 600);
        g.drawLine(500, 600, 650, 600);
		if(redCatched)
			g.setPaint(Color.RED);
		else
			g.setPaint(Color.WHITE);
        g.fillOval(480, 500, 10, 10);
        //ABTOMAT
        g.setPaint(new Color(111, 0, 255));
        g.fillRect(300, 470, 100, 100);
        g.setPaint(Color.BLACK);
        g.drawString("ABTOMAT", 300, 580);

        g.setPaint(prev);
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
		this.setResizable(false);
        this.pack();
    }
}