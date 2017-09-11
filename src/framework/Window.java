package framework;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JPanel;

import framework.Keyboard;

@SuppressWarnings( "serial" )
public class Window extends JPanel
{
	Keyboard kbd = new Keyboard();
	
	public static final int SCREEN_WIDTH  = 800;
	public static final int SCREEN_HEIGHT = 600;
	
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
				// keyMap[e.getKeyCode()] = false;
				kbd.SetKey( e.getKeyCode(),false );
			}
			@Override
			public void keyPressed( KeyEvent e )
			{
				// keyMap[e.getKeyCode()] = true;
				kbd.SetKey( e.getKeyCode(),true );
			}
		} );
		
		setFocusable( true );
	}
	
	public void Update()
	{
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
		
		//
	}
	// User Defined Functions \/ \/ \/
	
	//
}