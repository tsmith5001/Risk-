import java.awt.Graphics;
import java.util.ArrayList;

public class RiskBoard {

	int[] xcoord ={500,400,300,200,150,200,300,400,650,740};
	int[] ycoord = {500,500,500,500,450,200,200,200,200,450};
	int[] xcoordSide = {100,100,250,350,650};
	int[] ycoordSide = {350,300,125,125,500};
	ArrayList<Classroom> builds;
	ArrayList<Classroom> Sidebuilds;
	GraphicsPanel graph;
	Building b= new Building();
	
	public RiskBoard(GraphicsPanel graphicsPanel) {
		graph = graphicsPanel;
		builds = new ArrayList<Classroom>();
		Sidebuilds = new ArrayList<Classroom>();
		for (int j = 0; j < xcoord.length; j++) {
				builds.add(new Classroom(j, j, j, null));
			}
		for(int w=0; w<xcoordSide.length;w++){
			Sidebuilds.add(new Classroom(w, w, w, null));
		}
	
	}
	
	public void draw(Graphics g){
		for(int x = 0; x<builds.size();x++){
			builds.get(x).drawBuilding(g, xcoord[x], ycoord[x]);	
		}
		for(int y = 0; y<Sidebuilds.size();y++){
			builds.get(y).drawSidewaysBuilding(g, xcoordSide[y], ycoordSide[y]);
		}
		
		
	}
	public void Clickloc(Graphics g, int tX, int tY) {
		if(graph.isPressed() == true){
			for(int x = 0; x<builds.size();x++){
				if(graph.getmouseX() <=xcoord[x]+40 && graph.getmouseX() >=xcoord[x] 
						&& graph.getmouseY() >= ycoord[x] &&graph.getmouseY() <= ycoord[x]+60){
					builds.get(x).click(g, xcoord[x], ycoord[x]);
				}

			}
			for(int y = 0; y<Sidebuilds.size();y++){
				if(graph.getmouseX() <= xcoordSide[y]+60 && graph.getmouseX()>=xcoordSide[y]
						&& graph.getmouseY()>= ycoordSide[y] && graph.getmouseY() <= ycoordSide[y]+40 ){
					Sidebuilds.get(y).clickSide(g, xcoordSide[y], ycoordSide[y]);
				}
			}
			
		}
	}

	

}