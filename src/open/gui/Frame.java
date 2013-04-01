package open.gui;

import java.awt.Graphics2D;
import java.awt.image.VolatileImage;

import javax.swing.JFrame;

public class Frame extends JFrame implements Runnable {

	public Frame() {
		setTitle("Team RPG");
		setSize( 800, 600 );
		setResizable( false );
		setDefaultCloseOperation( EXIT_ON_CLOSE );
		setVisible( true );
		
		new Thread( this ).start();
	}
	
	/** paint the screen **/
	public void run() {
		while( true ) {
			try {
				buffer();
				Thread.sleep( 1 );
			} catch( Exception e ) {
				e.printStackTrace();
			}
		}
	}
	
	/** elimates screen flashing **/
	public void buffer() {
		buffer = createVolatileImage( getWidth(), getHeight() );
		game.render( buffer.createGraphics() );

		getGraphics().setClip( 0, 24, getWidth(), getHeight() );
		getGraphics().drawImage( buffer, 0, 24, this );
	}
	
	

	private VolatileImage buffer;
	private Draw game = new Draw();
}
