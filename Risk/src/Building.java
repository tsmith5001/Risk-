import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;

public class Building {

	int numTroops, x,y;
	private ArrayList<Building> pile;
	
	public Building() {
		
	}
	public void add(Building b){
		pile.add(b);
		System.out.println(pile);
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
	public void changeColor(Graphics g, int i, int j){
		g.setColor(Color.BLUE);
		g.fillRect(i, j, 60, 40);
	}
	public void drawLargeBuild(Graphics g, int i, int j){
		g.setColor(Color.GRAY);
		g.fillRect(i, j, 80, 60);
	}
	public void click(Graphics g,int tX, int tY){
		//Building tempfrontCard = pile.get();
		Building b1 = new Building();
		clickedDraw(b1, g,tX, tY);
	}
	private void clickedDraw(Building buildsMe,Graphics g, int x, int y) {
		// TODO Auto-generated method stub
		buildsMe.changeColor(g, x, y);
	}
	public int getX(){
		return x;
	}
	public int gety(){
		return y;
	}
}
