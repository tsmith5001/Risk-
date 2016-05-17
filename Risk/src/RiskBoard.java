import java.awt.Graphics;
import java.util.ArrayList;

public class RiskBoard {

	int[] xcoord ={500,400,300,200,150,100,100,200,250,300,350,400,650,650,740};
	int[] ycoord = {700,700,700,700,650,550,500,400,325,400,325,400,400,700,650};
	ArrayList<Building> builds;
	GraphicsPanel graph;
	Building b= new Building();
	public RiskBoard(GraphicsPanel graphicsPanel) {
		graph = graphicsPanel;
		builds = new ArrayList<Building>();
		for (int j = 0; j < xcoord.length; j++) {
				builds.add(new Building());
			}
		System.out.println("xcoords: " +xcoord);
		System.out.println("ycoords: " +ycoord);
	}
	
	public void draw(Graphics g){
		for(int x = 0; x<builds.size();x++){
			b.add(builds.get(x));
			builds.get(x).drawBuilding(g, xcoord[x], ycoord[x]);
			
		}
		
	}
	public void loc(Graphics g, int tX, int tY) {
		for(int x = 0; x<builds.size();x++){
			if(graph.isPressed()==true && graph.getmouseX() >=xcoord[x]+40 && graph.getmouseX() <=xcoord[x] && graph.getmouseY() == ycoord[x] &&graph.getmouseY() == ycoord[x]+60){
				builds.get(x).changeColor(g,xcoord[x], ycoord[x]);
				System.out.println("YOU CLICKED A PILE MAN");
			}
		}
	}

	

}