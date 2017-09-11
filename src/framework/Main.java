package framework;

import java.awt.Dimension;

import javax.swing.JFrame;

import framework.Window;

import user_files.YourFileName;

public class Main
{
	static JFrame frame = new JFrame();
	static Window window = new Window();
	
	// User Variables \/ \/ \/
	private YourFileName test = new YourFileName();
	//
	
	public static void main( String[] args ) throws InterruptedException
	{
		frame.setTitle( "JavaJ Framework 1.0.2" );
		
		frame.getContentPane().setPreferredSize( new Dimension( Window.SCREEN_WIDTH,Window.SCREEN_HEIGHT ) );
		frame.pack();
		
		frame.setVisible( true );
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
}
