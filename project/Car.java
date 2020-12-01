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
	private int form;

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
		Random r = new Random();
		form = r.nextInt(100);
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
            case DIF://поменять разрешили))))
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

/* 150x150 maximum */

    public void paint(Graphics2D g)
    {
		Color prev = g.getColor();
		//Перевертыш 0
		if(form == 0)
		{
			Rectangle2D body = new Rectangle2D.Double(X+5, Y+10, 70, 40);
			Rectangle2D lights = new Rectangle2D.Double(X+65, Y+8, 5, 5);
			Ellipse2D lWheel = new Ellipse2D.Double();
			lWheel.setFrame(new Rectangle2D.Double(X+8, Y+9, 10, 10));
			Ellipse2D rWheel = new Ellipse2D.Double();
			rWheel.setFrame(new Rectangle2D.Double(X+52, Y+9, 10, 10));
			
			g.setPaint(CURCOLOR);
			g.fill(body);
			
			g.setPaint(Color.BLACK);
			g.fill(lWheel);
			g.fill(rWheel);
			g.setPaint(Color.YELLOW);
			g.fill(lights);
		}
		//Боксер 1
		else if(form == 1)
		{
			Rectangle2D body = new Rectangle2D.Double(X+5, Y+10, 30, 40);
			Rectangle2D body2 = new Rectangle2D.Double(X+35, Y+5, 27, 28);
			Rectangle2D lights = new Rectangle2D.Double(X+55, Y+8, 5, 5);
			Ellipse2D lWheel = new Ellipse2D.Double();
			lWheel.setFrame(new Rectangle2D.Double(X+8, Y+9, 10, 10));
			Ellipse2D rWheel = new Ellipse2D.Double();
			rWheel.setFrame(new Rectangle2D.Double(X+52, Y+29, 10, 10));
			
			g.setPaint(CURCOLOR);
			g.fill(body);
			g.fill(body2);
			
			g.setPaint(Color.BLACK);
			g.fill(lWheel);
			g.fill(rWheel);
			g.setPaint(Color.YELLOW);
			g.fill(lights);
		}
		
		//Автобус 2-29
		else if(form < 30)
		{
			Rectangle2D body = new Rectangle2D.Double(X, Y, 70, 30);
			Rectangle2D lights = new Rectangle2D.Double(X+65, Y+22, 5, 5);
			Ellipse2D lWheel = new Ellipse2D.Double();
			lWheel.setFrame(new Rectangle2D.Double(X+8, Y+25, 10, 10));
			Ellipse2D rWheel = new Ellipse2D.Double();
			rWheel.setFrame(new Rectangle2D.Double(X+52, Y+25, 10, 10));
			
			g.setPaint(CURCOLOR);
			g.fill(body);
			
			g.setPaint(Color.BLACK);
			g.fill(lWheel);
			g.fill(rWheel);
			g.setPaint(Color.YELLOW);
			g.fill(lights);
		}
		
		//Грузовая 30-48
		else if(form < 49)
		{
			Rectangle2D body = new Rectangle2D.Double(X, Y, 90, 20);
			Rectangle2D back = new Rectangle2D.Double(X, Y-15, 65, 15);
			Rectangle2D lights = new Rectangle2D.Double(X+85, Y+12, 5, 5);
			Ellipse2D lWheel = new Ellipse2D.Double();
			lWheel.setFrame(new Rectangle2D.Double(X+6, Y+15, 10, 10));
			Ellipse2D lWheel2 = new Ellipse2D.Double();
			lWheel2.setFrame(new Rectangle2D.Double(X+18, Y+15, 10, 10));
			Ellipse2D rWheel = new Ellipse2D.Double();
			rWheel.setFrame(new Rectangle2D.Double(X+68, Y+15, 10, 10));
			
			g.setPaint(CURCOLOR);
			g.fill(body);
			g.fill(back);
			
			g.setPaint(Color.BLACK);
			g.fill(lWheel2);
			g.fill(lWheel);
			g.fill(rWheel);
			g.setPaint(Color.YELLOW);
			g.fill(lights);
		}
		
		//Пикап 49-68
		else if(form < 69)
		{
			Rectangle2D body = new Rectangle2D.Double(X, Y, 80, 15);
			Rectangle2D roof = new Rectangle2D.Double(X+40, Y-10, 25, 10);
			Rectangle2D lights = new Rectangle2D.Double(X+75, Y+8, 5, 5);
			
			Ellipse2D lWheel = new Ellipse2D.Double();
			lWheel.setFrame(new Rectangle2D.Double(X+12, Y+9, 10, 10));
			Ellipse2D rWheel = new Ellipse2D.Double();
			rWheel.setFrame(new Rectangle2D.Double(X+60, Y+9, 10, 10));
			
			g.setPaint(CURCOLOR);
			g.fill(body);
			g.fill(roof);
			
			g.setPaint(Color.BLACK);
			g.fill(lWheel);
			g.fill(rWheel);
			g.setPaint(Color.YELLOW);
			g.fill(lights);
		}
		
		//Легковая 69-99
		else
		{
			Rectangle2D body = new Rectangle2D.Double(X, Y, 70, 15);
			Rectangle2D roof = new Rectangle2D.Double(X+20, Y-10, 30, 10);
			Rectangle2D lights = new Rectangle2D.Double(X+65, Y+8, 5, 5);
			Ellipse2D lWheel = new Ellipse2D.Double();
			lWheel.setFrame(new Rectangle2D.Double(X+8, Y+9, 10, 10));
			Ellipse2D rWheel = new Ellipse2D.Double();
			rWheel.setFrame(new Rectangle2D.Double(X+52, Y+9, 10, 10));

			g.setPaint(CURCOLOR);
			g.fill(body);
			g.fill(roof);
			
			g.setPaint(Color.BLACK);
			g.fill(lWheel);
			g.fill(rWheel);
			g.setPaint(Color.YELLOW);
			g.fill(lights);
		}
		
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
                int Uy = 40;
                if(this.Y > y)
                    Uy *= -1;

                int Ux = 40;
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

    public boolean isBusy()
    {
        return MOVED;
    }
}