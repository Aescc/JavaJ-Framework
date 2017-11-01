package framework;

import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JFrame;

public class Graphic
{
	JFrame frm = null;
	Image[] images = new Image[50];
	int curImage = 0;
	// 
	public Graphic( JFrame frame )
	{
		frm = frame;
	}
	
	public int LoadImage( String url )
	{
		Image img = null;
		try
		{
			img = ImageIO.read( new File( url ) );
		}
		catch ( IOException e )
		{
			e.printStackTrace();
		}
		images[curImage++] = img;
		return curImage - 1;
	}
	
	public void DrawImage( int id,int x,int y,int width,int height,Graphics gfx )
	{
		gfx.drawImage( images[id],x,y,width,height,frm );
	}
}
