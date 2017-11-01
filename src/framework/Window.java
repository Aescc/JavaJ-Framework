package framework;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.JPanel;

import framework.Keyboard;
import framework.Mouse;
import framework.Graphic;
import framework.Game;

@SuppressWarnings( "serial" )
public class Window extends JPanel
{
	static JFrame   frm = new JFrame();
	static Window   wnd = new Window();
	       Keyboard kbd = new Keyboard();
	       Mouse    ms  = new Mouse();
	       Graphic  fx = new Graphic( frm );
	       Game theGame = new Game();
	
	public static final int SCREEN_WIDTH = 800;
	public static final int SCREEN_HEIGHT = 600;
	// 
	public static void main( String[] args ) throws InterruptedException
	{
		frm.setTitle( "JavaJ Framework 1.2.0" );
		
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
	
	private void Update()
	{
		final Point mousePos = frm.getContentPane().getMousePosition();
		if( mousePos != null )
		{
			ms.X( mousePos.x );
			ms.Y( mousePos.y );
		}
		theGame.Update();
	}
	
	@Override
	public void paint( Graphics gfx )
	{
		gfx.translate( 5,5 );
		
		gfx.setColor( Color.black );
		gfx.fillRect( 0,0,SCREEN_WIDTH,SCREEN_HEIGHT );
		theGame.Draw( gfx );
	}
}