import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.URL;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

public class GraphicsPanel extends JPanel {
	final int WIDTH = 900, HEIGHT = 600;
	private RiskBoard world;
	private Classroom obj;
	private BufferedImage bkgrnd;
	private int BCKGRD_W ;
	private int mousex = 0, mousey = 0;
	public boolean mousePressed = false;
	
	public GraphicsPanel(){
		setPreferredSize(new Dimension(WIDTH, HEIGHT));
		this.setLayout(null);
		world = new RiskBoard(this);
		setUpBackground();
		setUpButtons();
		setUpClicks();
	}

	private void setUpButtons() {
		// TODO Auto-generated method stub
		
	}

	private void setUpClicks() {
		// TODO Auto-generated method stub
		this.addMouseListener(new MouseListener() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				System.out.println("Just clicked: "+arg0);
			}
			@Override
			public void mouseEntered(MouseEvent arg0) {
				System.out.println("Just entered: "+arg0);
			}
			@Override
			public void mouseExited(MouseEvent arg0) {
				System.out.println("Just exited: "+arg0);
			}
			@Override
			public void mousePressed(MouseEvent e) {
				System.out.println("Just pressed: "+e);
				mousePressed = true;
				
			}
			@Override
			public void mouseReleased(MouseEvent e) {
				System.out.println("Just released: "+e);
				mousex = e.getX();
				mousey = e.getY();
				repaint();
			}
			
		});
	}
	public boolean isPressed(){
		if(mousePressed == true){
			return true;
		}
		return false;
	}

	private void setUpBackground() {
		URL url = getClass().getResource("subtle-checkers.png");
		System.out.println(url);
		
		try {
			this.bkgrnd=(BufferedImage) ImageIO.read(url);
		} catch (IOException e) {
			e.printStackTrace();
		}
		this.BCKGRD_W=bkgrnd.getWidth(null);
		System.out.println(this.BCKGRD_W);
	}

	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		drawBackground(g);
		System.out.println("repainting");
		world.draw(g);
		world.Clickloc(g,mousex, mousey);
		
	}
	public int getmouseX(){
		return mousex;
	}
	public int getmouseY(){
		return mousey;
	}
	private void drawBackground(Graphics g) {
		int x = this.BCKGRD_W/2-this.getWidth()/2;
		g.drawImage(this.bkgrnd, 0,0,this.getWidth(), this.getHeight(),null);
		if(x>= this.bkgrnd.getWidth()){
			x = x-this.bkgrnd.getWidth()*2;
		}
	}
}
