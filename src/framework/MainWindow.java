package framework;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JFrame;
import javax.swing.JPanel;

@SuppressWarnings( "serial" )
public class MainWindow extends JPanel
{
	static JFrame frame = new JFrame();
	static MainWindow window = new MainWindow();
	
	final static int SCREEN_WIDTH = 800;
	final static int SCREEN_HEIGHT = 600;
	// User Variables \/ \/ \/
	
	//
	public static void main( String[] args ) throws InterruptedException
	{
		frame.setTitle( "Java Framework" );
		frame.setSize( SCREEN_WIDTH,SCREEN_HEIGHT );
		frame.setResizable( false );
		frame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
		frame.setVisible( true );
		frame.add( window );
		
		while ( true )
		{
			Update();
			window.repaint();
			Thread.sleep( 10 );
		}
	}
	private MainWindow()
	{
		addKeyListener( new KeyListener()
		{
			@Override
			public void keyTyped( KeyEvent e )
			{
				
			}
			@Override
			public void keyReleased( KeyEvent e )
			{
				
			}
			@Override
			public void keyPressed( KeyEvent e )
			{
				// TODO: Fix this :D
				System.out.println( e.getKeyChar() );
			}
		} );
		setFocusable( true );
	}
	private static void Update()
	{
		// Update Stuff \/ \/ \/
		
		//
	}
	@Override
	public void paint( Graphics g )
	{
		g.setColor( Color.black );
		g.fillRect( 0,0,SCREEN_WIDTH,SCREEN_HEIGHT );
		// Draw Stuff \/ \/ \/
		
		//
	}
	// User Functions \/ \/ \/
	
	//
}