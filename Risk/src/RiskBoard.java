import java.awt.Graphics;
import java.util.ArrayList;

public class RiskBoard {

	private Building Office = new Building();
	private Building BBuild = new Building();
	private Building CBuild = new Building();
	private Building DBuild = new Building();
	private Building EBuild = new Building();
	private Building FBuild = new Building();
	private Building GBuild = new Building();
	private Building HBuild = new Building();
	private Building IBuild = new Building();
	private Building JBuild = new Building();
	private Building LBuild = new Building();
	private Building MBuild = new Building();
	private Building PBuild = new Building();
	private Building Q1Build = new Building();
	private Building Q2Build = new Building();
	ArrayList<Integer> xcoord;
	ArrayList<Integer> ycoord;
	
	public RiskBoard(GraphicsPanel graphicsPanel) {
		// TODO Auto-generated constructor stub
		xcoord= new ArrayList<Integer>();
		ycoord = new ArrayList<Integer>();
		addvals();
		System.out.println("xcoords: " +xcoord);
		System.out.println("ycoords: " +ycoord);
	}
	private void addvals() {
		// TODO Auto-generated method stub
		//x coords
		xcoord.add(500);
		xcoord.add(400);
		xcoord.add(300);
		xcoord.add(200);
		xcoord.add(150);
		xcoord.add(100);
		xcoord.add(100);
		xcoord.add(200);
		xcoord.add(250);
		xcoord.add(300);
		xcoord.add(350);
		xcoord.add(400);
		xcoord.add(650);
		xcoord.add(650);
		xcoord.add(740);
		//y coords
		ycoord.add(700);
		ycoord.add(700);
		ycoord.add(700);
		ycoord.add(700);
		ycoord.add(650);
		ycoord.add(550);
		ycoord.add(500);
		ycoord.add(400);
		ycoord.add(325);
		ycoord.add(400);
		ycoord.add(325);
		ycoord.add(400);
		ycoord.add(400);
		ycoord.add(700);
		ycoord.add(650);
	}
	public void draw(Graphics g){
		Office.drawBuilding(g, 500, 700);
		BBuild.drawBuilding(g, 400, 700);
		CBuild.drawBuilding(g, 300, 700);
		DBuild.drawBuilding(g, 200, 700);
		EBuild.drawBuilding(g, 150, 650);
		FBuild.drawSidewaysBuilding(g, 100, 550);
		GBuild.drawSidewaysBuilding(g, 100, 500);
		HBuild.drawBuilding(g, 200, 400);
		IBuild.drawSidewaysBuilding(g, 250, 325);
		JBuild.drawLargeBuild(g,300,400);
		LBuild.drawSidewaysBuilding(g, 350, 325);
		MBuild.drawBuilding(g, 400, 400);
		PBuild.drawBuilding(g, 650, 400);
		Q1Build.drawLargeBuild(g, 650, 700);
		Q2Build.drawLargeBuild(g,740,650);
	}

}