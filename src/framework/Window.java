package framework;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Point;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;

import framework.Keyboard;
import framework.Mouse;

import user_files.YourFileName;

@SuppressWarnings( "serial" )
public class Window extends JPanel
{
	static JFrame   frm = new JFrame();
	static Window   wnd = new Window();
	       Keyboard kbd = new Keyboard();
	       Mouse    ms  = new Mouse();
	
	public static final int SCREEN_WIDTH = 800;
	public static final int SCREEN_HEIGHT = 600;
	
	Image[] images = new Image[50];
	int curImage = 0;
	
	// User Variables \/ \/ \/
	private YourFileName test = new YourFileName();
	//
	public static void main( String[] args ) throws InterruptedException
	{
		frm.setTitle( "JavaJ Framework 1.1.2" );
		
		frm.getContentPane().setPreferredSize( new Dimension( SCREEN_WIDTH,SCREEN_HEIGHT ) );
		frm.pack();
		
		frm.setVisible( true );
		frm.setResizable( false );
		frm.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
		
		frm.add( wnd );
		
		while( 3 < 4 )
		{
			wnd.Update();
			wnd.repaint();
			Thread.sleep( 10 );
		}
	}
	
	public Window()
	{
		addKeyListener( new KeyListener()
		{
			@Override
			public void keyTyped( KeyEvent e )
			{
				// TODO: Implement something here. ;)
			}
			@Override
			public void keyReleased( KeyEvent e )
			{
				kbd.Key( e.getKeyCode(),false );
			}
			@Override
			public void keyPressed( KeyEvent e )
			{
				kbd.Key( e.getKeyCode(),true );
			}
		} );
		
		addMouseListener( new MouseAdapter()
		{
            @Override
            public void mousePressed( MouseEvent e )
            {
            	ms.IsDown( true );
            }

            @Override
            public void mouseReleased( MouseEvent e )
            {
                ms.IsDown( false );
            }
        } );
		
		setFocusable( true );
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
		gfx.drawImage( images[id],x,y,width,height,wnd );
	}
	
	private void Update()
	{
		final Point mousePos = frm.getContentPane().getMousePosition();
		if( mousePos != null )
		{
			ms.X( mousePos.x );
			ms.Y( mousePos.y );
		}
		// Update Stuff \/ \/ \/
		
		//
	}
	
	@Override
	public void paint( Graphics gfx )
	{
		gfx.translate( 5,5 );
		
		gfx.setColor( Color.black );
		gfx.fillRect( 0,0,SCREEN_WIDTH,SCREEN_HEIGHT );
		// Draw Stuff \/ \/ \/
		test.Draw( gfx );
		//
	}
	// User Defined Functions \/ \/ \/
	
	//
}