package project;

import java.lang.*;
import java.util.*;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.geom.*;

public class Car
{
    private int X;
    private int Y;
    private int TYPE;
    private Color CURCOLOR;
    private boolean MOVED;

    public static final int RED = 0;
    public static final int BLUE = 1;
    public static final int BLACK = 2;
    public static final int YELLOW = 3;
    public static final int ORANGE = 4;
    public static final int DIF = 5;

    private static final int DELAY = 100;

    public Car(int x, int y, int type)
    {
        this.X = x;
        this.Y = y;
        this.TYPE = type;
        this.CURCOLOR = getColor(this.TYPE);
        this.MOVED = false;
    }

    private static Color getColor(int type)
    {
        Color res = new Color(255, 255, 255);
        switch(type)
        {
            case RED:
            {
                res = Color.RED;
                break;
            }
            case BLUE:
            {
                res = Color.BLUE;
                break;
            }
            case BLACK:
            {
                res = Color.BLACK;
                break;
            }
            case YELLOW:
            {
                res = Color.YELLOW;
                break;
            }
            case ORANGE:
            {
                res = Color.ORANGE;
                break;
            }
            case DIF:
            {
                Random r = new Random();
                res = new Color(r.nextInt(250-125)+125, 125, r.nextInt(250-125)+125);
                break;
            }
            default:
            {
                System.out.println("Failed successfully. Type = " + type);
                break;
            }
        }
        return res;
    }

    public void paint(Graphics2D g)
    {
        Rectangle2D back = new Rectangle2D.Double(X, Y, 75, 50);
        Rectangle2D cabine = new Rectangle2D.Double(X+75, Y+25, 25, 25);
        Ellipse2D lWheel = new Ellipse2D.Double();
        lWheel.setFrame(new Rectangle2D.Double(X+10, Y+45, 10, 10));
        Ellipse2D rWheel = new Ellipse2D.Double();
        rWheel.setFrame(new Rectangle2D.Double(X+65, Y+45, 10, 10));

        Color prev = g.getColor();

        g.setPaint(CURCOLOR);
        g.fill(back);
        g.fill(cabine);
        
        g.setPaint(Color.BLACK);
        g.fill(lWheel);
        g.fill(rWheel);

        g.setPaint(prev);
    }

    public boolean goTo(int x, int y)
    {
        if(this.MOVED)
            return false;
        
        this.MOVED = true;
        Runnable task = () ->
        {
            try
            {
                int Uy = 20;
                if(this.Y > y)
                    Uy *= -1;

                int Ux = 20;
                if(this.X > x)
                    Ux *= -1;
                
                int p0, p1;
                do
                {
                    p0 = this.X - x;
                    p0 = p0>0?(p0==0?0:1):-1;
                    if(p0 != 0)
                    {
                        this.X += Ux;
                        p1 = this.X - x;
                        p1 = p1>0?(p1==0?0:1):-1;
                        if(p1 != p0)
                            this.X = x;
                    }

                    p0 = this.Y - y;
                    p0 = p0>0?(p0==0?0:1):-1;
                    if(p0 != 0)
                    {
                        this.Y += Uy;
                        p1 = this.Y - y;
                        p1 = p1>0?(p1==0?0:1):-1;
                        if(p1 != p0)
                            this.Y = y;
                    }
                    Thread.sleep(DELAY);
                }while(this.X != x || this.Y != y);
                this.MOVED = false;
            }
            catch(InterruptedException e)
            {
                System.out.println(e);
            }
        };

        new Thread(task).start();
        return true;
    }
}