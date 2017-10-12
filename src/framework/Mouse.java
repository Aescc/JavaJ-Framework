package framework;

public class Mouse
{
	private boolean mouseIsPressed = false;
	private int x = 0;
	private int y = 0;
	
	public boolean IsDown()
	{
		return mouseIsPressed;
	}
	
	public void IsDown( boolean isPressed )
	{
		mouseIsPressed = isPressed;
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
