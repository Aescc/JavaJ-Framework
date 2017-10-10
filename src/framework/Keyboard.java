package framework;

public class Keyboard
{
	private static boolean[] keyMap = new boolean[128];
	
	public Keyboard()
	{
		for( int i = 0; i < 127; ++i )
			keyMap[i] = false;
	}
	
	public void Key( int keyCode,boolean value )
	{
		keyMap[keyCode] = value;
	}
	
	public boolean KeyDown( int keyCode )
	{
		return keyMap[keyCode];
	}
	
	public boolean KeyDown( char keyChar )
	{
		return keyMap[(int)keyChar];
	}
}
