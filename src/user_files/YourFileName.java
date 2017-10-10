package user_files;

import java.awt.Color;
import java.awt.Graphics;

public class YourFileName
{
	private int x = 50;
	private int y = 70;
	
	public void Draw( Graphics gfx )
	{
		gfx.setColor( Color.CYAN );
		gfx.fillRect( x,y,10,10 );
	}
}
