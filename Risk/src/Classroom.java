import java.awt.Color;
import java.awt.Graphics;

public class Classroom extends Building{
	int troop;
	int x,y;
	String name;
	
 public Classroom(int troops,int x2,int y2,String names){
	 name=names;
	 troop= troops;
	 x=x2;
	 y=y2;
	 name = names;
	 
 }
 
 public void addtroop(){
	 troop++;
 }
 public void attack(Classroom r){
	 if(r.getnumtroops()-1>this.getnumtroops()-1){
		 r.setnumtroops(r.getnumtroops()-this.getnumtroops());
	 }
	 else if(this.getnumtroops()-1>r.getnumtroops()-1){
		 this.setnumtroops(this.getnumtroops()-r.getnumtroops());
	 }
	 else{
		 r.setnumtroops(1);
		 this.setnumtroops(1);
	 }
 }
 public int  getnumtroops(){
	 return troop;
 }
 public void setnumtroops(int x){
	 troop=x;
 }
 public String named(){
	 return name;
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
		Classroom b1 = new Classroom(tY, tY, tY, name);
		clickedDraw(b1, g,tX, tY);
	}
	
	private void clickedDraw(Classroom buildsMe,Graphics g, int x, int y) {
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
		Classroom b1 = new Classroom(j, j, j, name);
		clickedDrawSIDE(b1, g,i, j);
	}

	private void clickedDrawSIDE(Classroom b1, Graphics g, int i, int j) {
		// TODO Auto-generated method stub
		b1.changeSideColor(g, i,j);
	}

	private void changeSideColor(Graphics g, int i, int j) {
		// TODO Auto-generated method stub
		g.setColor(Color.BLUE);
		g.fillRect(i, j, 60, 40);
	}
 
 
}
