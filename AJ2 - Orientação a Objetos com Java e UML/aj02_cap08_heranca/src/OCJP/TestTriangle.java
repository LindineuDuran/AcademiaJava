package OCJP;

class Point
{
	private int x, y;
	
	public Point(int x, int y)
	{
		this.x = x;
		this.y = y;
	}

	/**
	 * @return the x
	 */
	public int getX()
	{
		return x;
	}

	/**
	 * @param x the x to set
	 */
	public void setX(int x)
	{
		this.x = x;
	}

	/**
	 * @return the y
	 */
	public int getY()
	{
		return y;
	}

	/**
	 * @param y the y to set
	 */
	public void setY(int y)
	{
		this.y = y;
	}
	
}

class Shape
{
	public final void drawLine(Point start, Point end)
	{
		
	}
}

class Triangle extends Shape
{
	private Point a, b, c;
	
	public Triangle(Point a, Point b, Point c)
	{
		this.a = a;
		this.b = b;
		this.c = c;
	}
	
	public void draw()
	{
		drawLine(a,b);
		drawLine(b,c);
		drawLine(c,a);
	}
}

public class TestTriangle
{
	public static void main(String[] args)
	{
		Point a = new Point(0,0);
		Point b = new Point(15,15);
		Point c = new Point(30,0);
		
		Triangle t = new Triangle(a,b,c);
		t.draw();
	}
}
