package framework;

public class Mouse
{
	private boolean mouseIsPressed = false;
	private int x = 0;
	private int y = 0;
	
	public boolean MouseDown()
	{
		return mouseIsPressed;
	}
	
	public int X()
	{
		return x;
	}
	
	public int Y()
	{
		return y;
	}
	
	public void X( int newX )
	{
		x = newX;
	}
	
	public void Y( int newY )
	{
		y = newY;
	}
}
