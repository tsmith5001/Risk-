import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;

public class Building {

	int numTroops, x,y;
	private ArrayList<Building> pile;
	
	public Building() {
		
	}
	
	public int addTroops(){
		return numTroops;
	}
	
	public void drawBuilding(Graphics g, int i, int j){
		g.setColor(Color.GRAY);
		g.fillRect(i, j, 40, 60);
	}
	
	public void drawSidewaysBuilding(Graphics g, int i, int j){
		g.setColor(Color.GRAY);
		g.fillRect(i, j, 60, 40);
	}
	
	public void changeColor(Graphics g, int i, int j){
		g.setColor(Color.BLUE);
		g.fillRect(i, j, 40, 60);
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

	public void clickSide(Graphics g, int i, int j) {
		// TODO Auto-generated method stub
		Building b1 = new Building();
		clickedDrawSIDE(b1, g,i, j);
	}

	private void clickedDrawSIDE(Building b1, Graphics g, int i, int j) {
		// TODO Auto-generated method stub
		b1.changeSideColor(g, i,j);
	}

	private void changeSideColor(Graphics g, int i, int j) {
		// TODO Auto-generated method stub
		g.setColor(Color.BLUE);
		g.fillRect(i, j, 60, 40);
	}
}
