import javax.swing.JFrame;

public class GameStart extends JFrame{

	public GameStart() {
		super("Risk!");
		this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
		this.add(new GraphicsPanel());
		this.pack();
		this.setVisible(true);
	}
	
	public static void main(String[] args) {
		new GameStart();
	}
}
