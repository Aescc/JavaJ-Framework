package framework;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JFrame;
import javax.swing.JPanel;

import framework.Keyboard;

import user_files.YourFileName;

@SuppressWarnings( "serial" )
public class Window extends JPanel
{
	static JFrame   frm = new JFrame();
	static Window   wnd = new Window();
	       Keyboard kbd = new Keyboard();
	
	public static final int SCREEN_WIDTH = 800;
	public static final int SCREEN_HEIGHT = 600;
	
	// User Variables \/ \/ \/
	private YourFileName test = new YourFileName();
	//
	public static void main( String[] args ) throws InterruptedException
	{
		frm.setTitle( "JavaJ Framework 1.0.4" );
		
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
	
	private void Update()
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