import java.awt.Graphics;

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
	private Building QBuild = new Building();
	
	public RiskBoard(GraphicsPanel graphicsPanel) {
		// TODO Auto-generated constructor stub
	}
	public void draw(Graphics g){
		Office.drawBuilding(g, 500, 700);
		BBuild.drawBuilding(g, 400, 700);
		CBuild.drawBuilding(g, 300, 700);
		DBuild.drawBuilding(g, 200, 700);
		EBuild.drawBuilding(g, 150, 650);
		FBuild.drawSidewaysBuilding(g, 100, 550);
		GBuild.drawSidewaysBuilding(g, 100, 500);
		//HBuild.drawBuilding(g, , j);
	}

}