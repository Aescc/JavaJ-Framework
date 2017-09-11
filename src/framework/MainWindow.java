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
public class MainWindow extends JPanel
{
	static JFrame frame = new JFrame();
	static MainWindow window = new MainWindow();
	Keyboard kbd = new Keyboard();
	
	public final static int SCREEN_WIDTH = 800;
	public final static int SCREEN_HEIGHT = 600;
	// User Variables \/ \/ \/
	private YourFileName test = new YourFileName();
	//
	public static void main( String[] args ) throws InterruptedException
	{
		frame.setTitle( "JavaJ Framework 1.0.1" );
		
		frame.getContentPane().setPreferredSize( new Dimension( SCREEN_WIDTH,SCREEN_HEIGHT ) );
		frame.pack();
		
		frame.setVisible(true);
		frame.setResizable( false );
		
		frame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
		
		frame.add( window );
		
		while( 3 < 4 )
		{
			window.Update();
			window.repaint();
			Thread.sleep( 10 );
		}
	}
	
	public MainWindow()
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