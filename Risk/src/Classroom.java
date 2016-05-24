import java.awt.Color;
import java.awt.Graphics;

public class Classroom{
	int troop;
	int x,y;
	String name;
	//int numClicks = 0;
	//int total = this.getnumtroops()+troop;
	
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
	return getnumtroops();
 }
	
	public void drawClassroom(Graphics g, int i, int j){
		g.setColor(Color.GRAY);
		g.fillRect(i, j, 20, 20);
		g.setColor(Color.BLACK);
		g.drawRect(i, j, 20, 20);
	}
	
	public void changeColor(Graphics g, int i, int j){
		g.setColor(Color.BLUE);
		g.fillRect(i, j, 20, 20);
		g.setColor(Color.BLACK);
		g.drawString(""+this.getnumtroops(), i, j+20);
	}
	
	
	public void click(Graphics g,int tX, int tY){
		Classroom b1 = new Classroom(this.getnumtroops(), tX, tY, name);
		clickedDraw(b1, g,tX, tY,b1.getnumtroops());
		this.addtroop();
	}
	
	private void clickedDraw(Classroom buildsMe,Graphics g, int x, int y,int troops) {
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
