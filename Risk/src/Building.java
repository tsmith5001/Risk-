import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;

public class Building {

	int numTroops, x,y;
	ArrayList<Building> objs;
	GraphicsPanel graph = new GraphicsPanel();
	
	public Building() {
		//player, loc
		//numTroops = numTroops1;
		//x=startx;
		//y=starty;
		objs = new ArrayList<Building>();
	}
	public void draw(Graphics g){
		//for(int x = 0; x<objs.size();x++){
			g.fillRect(x, y, 50, 50);
		//}
	}
	public void drawBuilding(Graphics g, int i, int j){
		g.setColor(Color.GRAY);
		g.fillRect(i, j, 40, 60);
	}
	public void drawSidewaysBuilding(Graphics g, int i, int j){
		g.setColor(Color.GRAY);
		g.fillRect(i, j, 60, 40);
		//if(graph.isPressed()==true){
			//g.setColor(Color.GREEN);
		//}
	}
	public int getX(){
		return x;
	}
	public int gety(){
		return y;
	}
}
