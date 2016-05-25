import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.URL;

import javax.imageio.ImageIO;
import javax.swing.JButton;
import javax.swing.JPanel;

public class GraphicsPanel extends JPanel {
	final int WIDTH = 1200, HEIGHT = 800;
	private RiskBoard world;
	private Classroom obj;
	private BufferedImage bkgrnd;
	private int BCKGRD_W ;
	private int mousex = 0, mousey = 0;
	public boolean mousePressed = false;
	JButton PutTroopsButton = new JButton("Deploy Troops");
	JButton DeployButton = new JButton("Transfer/Attack");
	JButton ConfirmButton = new JButton("Confirm");
	int numClicks = 0;
	
	public GraphicsPanel(){
		setPreferredSize(new Dimension(WIDTH, HEIGHT));
		this.setLayout(null);
		world = new RiskBoard(this);
		setUpBackground();
		setUpClicks();
		this.add(PutTroopsButton);
		PutTroopsButton.setBounds(825, 50, 150, 100);
		this.add(DeployButton);
		DeployButton.setBounds(825, 150, 150, 100);
		this.add(ConfirmButton);
		ConfirmButton.setBounds(825, 250, 150, 100);
		setUpButtons();
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
				numClicks++;
				repaint();
			}
			
		});
	}
	private int getNumClicks(){
		return numClicks;
	}
	private void setUpButtons() {
		// TODO Auto-generated method stub
		PutTroopsButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// What do you want to do when the button is clicked????
				if(world.canAddTroop()==true){	
					System.out.println("i got here");
					obj.addtroop();
					repaint();
					System.out.println("Repainting man");
				}
			}
		});
		DeployButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// What do you want to do when the button is clicked????
				
			}
		});
		ConfirmButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// What do you want to do when the button is clicked????
				
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
