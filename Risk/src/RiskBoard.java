import java.awt.Graphics;
import java.util.ArrayList;

public class RiskBoard {

	int[] Office = {500,500,520,500,500,520,520,520,500,540,520,540};
	int[] Bbuilding = {400,500,420,500,400,520,420,520,400,540,420,540};
	int[] Cbuilding = {300,500,320,500,300,520,320,520,300,540,320,540};
	int[] Dbuilding = {200,500,220,500,200,520,220,520,200,540,220,540};
	int[] Ebuilding = {150,450,170,450,150,470,170,470,150,490,170,490};
	int[] Fbuilding = {100,350,120,350,140,350,100,370,120,370,140,370};
	int[] Gbuilding = {100,300,120,300,140,300,100,320,120,320,140,320};
	int[] Hbuilding = {200,200,220,200,200,220,220,220,200,240,220,240};
	int[] Ibuilding = {250,125,270,125,290,125,250,145,270,145,290,145};
	int[] Jbuilding = {300,200,320,200,300,220,320,220,300,240,320,240};
	int[] Lbuilding = {350,125,370,125,390,125,350,145,370,145,390,145};
	int[] Mbuilding = {400,200,420,200,400,220,420,220,400,240,420,240};
	int[] Qbuilding = {650,500,670,500,690,500,650,520,670,520,690,520};
	int[] Q1building = {740,450,760,450,740,470,760,470,740,490,760,490};
	int[] Pbuilding = {650,200,670,200,650,220,670,220,650,240,670,240};
	
	ArrayList<Classroom> off;
	ArrayList<Classroom> B;
	ArrayList<Classroom> C;
	ArrayList<Classroom> D;
	ArrayList<Classroom> E;
	ArrayList<Classroom> F;
	ArrayList<Classroom> G;
	ArrayList<Classroom> H;
	ArrayList<Classroom> I;
	ArrayList<Classroom> J;
	ArrayList<Classroom> L;
	ArrayList<Classroom> M;
	ArrayList<Classroom> Q;
	ArrayList<Classroom> Q1;
	ArrayList<Classroom> P;
	GraphicsPanel graph;
	
	public RiskBoard(GraphicsPanel graphicsPanel) {
		graph = graphicsPanel;
		off = new ArrayList<Classroom>();
		B = new ArrayList<Classroom>();
		C = new ArrayList<Classroom>();
		D = new ArrayList<Classroom>();
		E = new ArrayList<Classroom>();
		F = new ArrayList<Classroom>();
		G = new ArrayList<Classroom>();
		H = new ArrayList<Classroom>();
		J = new ArrayList<Classroom>();
		L = new ArrayList<Classroom>();
		I = new ArrayList<Classroom>();
		M = new ArrayList<Classroom>();
		Q = new ArrayList<Classroom>();
		Q1 = new ArrayList<Classroom>();
		P = new ArrayList<Classroom>();
		for (int j = 0; j < Office.length; j++) {
			off.add(new Classroom(j, j, j, null));
		}
		for (int j = 0; j < Bbuilding.length; j++) {
			B.add(new Classroom(j, j, j, null));
		}
		for (int j = 0; j < Cbuilding.length; j++) {
			C.add(new Classroom(j, j, j, null));
		}
		for (int j = 0; j < Dbuilding.length; j++) {
			D.add(new Classroom(j, j, j, null));
		}
		for (int j = 0; j < Ebuilding.length; j++) {
			E.add(new Classroom(j, j, j, null));
		}
		for (int j = 0; j < Fbuilding.length; j++) {
			F.add(new Classroom(j, j, j, null));
		}
		for (int j = 0; j < Gbuilding.length; j++) {
			G.add(new Classroom(j, j, j, null));
		}
		for (int j = 0; j < Hbuilding.length; j++) {
			H.add(new Classroom(j, j, j, null));
		}
		for (int j = 0; j < Ibuilding.length; j++) {
			I.add(new Classroom(j, j, j, null));
		}
		for (int j = 0; j < Jbuilding.length; j++) {
			J.add(new Classroom(j, j, j, null));
		}
		for (int j = 0; j < Lbuilding.length; j++) {
			L.add(new Classroom(j, j, j, null));
		}
		for (int j = 0; j < Mbuilding.length; j++) {
			M.add(new Classroom(j, j, j, null));
		}
		for (int j = 0; j < Qbuilding.length; j++) {
			Q.add(new Classroom(j, j, j, null));
		}
		for (int j = 0; j < Q1building.length; j++) {
			Q1.add(new Classroom(j, j, j, null));
		}
		for (int j = 0; j < Pbuilding.length; j++) {
			P.add(new Classroom(j, j, j, null));
		}
		
		
	}
	
	public void draw(Graphics g){
		for(int x = 0; x<off.size();x++){
			off.get(x).drawClassroom(g, Office[x], Office[x+1]);	
			x++;
		}
		for(int x = 0; x<B.size();x++){
			B.get(x).drawClassroom(g, Bbuilding[x], Bbuilding[x+1]);	
			x++;
		}
		for(int x = 0; x<C.size();x++){
			C.get(x).drawClassroom(g, Cbuilding[x], Cbuilding[x+1]);	
			x++;
		}
		for(int x = 0; x<D.size();x++){
			D.get(x).drawClassroom(g, Dbuilding[x], Dbuilding[x+1]);	
			x++;
		}
		for(int x = 0; x<E.size();x++){
			E.get(x).drawClassroom(g, Ebuilding[x], Ebuilding[x+1]);	
			x++;
		}
		for(int x = 0; x<F.size();x++){
			F.get(x).drawClassroom(g, Fbuilding[x], Fbuilding[x+1]);	
			x++;
		}
		for(int x = 0; x<G.size();x++){
			G.get(x).drawClassroom(g, Gbuilding[x], Gbuilding[x+1]);	
			x++;
		}
		for(int x = 0; x<H.size();x++){
			H.get(x).drawClassroom(g, Hbuilding[x], Hbuilding[x+1]);	
			x++;
		}
		for(int x = 0; x<I.size();x++){
			I.get(x).drawClassroom(g, Ibuilding[x], Ibuilding[x+1]);	
			x++;
		}
		for(int x = 0; x<J.size();x++){
			J.get(x).drawClassroom(g, Jbuilding[x], Jbuilding[x+1]);	
			x++;
		}
		for(int x = 0; x<L.size();x++){
			L.get(x).drawClassroom(g, Lbuilding[x], Lbuilding[x+1]);	
			x++;
		}
		for(int x = 0; x<M.size();x++){
			M.get(x).drawClassroom(g, Mbuilding[x], Mbuilding[x+1]);	
			x++;
		}
		for(int x = 0; x<Q.size();x++){
			Q.get(x).drawClassroom(g, Qbuilding[x], Qbuilding[x+1]);	
			x++;
		}
		for(int x = 0; x<Q1.size();x++){
			Q1.get(x).drawClassroom(g, Q1building[x], Q1building[x+1]);	
			x++;
		}
		for(int x = 0; x<P.size();x++){
			P.get(x).drawClassroom(g, Pbuilding[x], Pbuilding[x+1]);	
			x++;
		}
		
	}
	public void Clickloc(Graphics g, int tX, int tY) {
		if(graph.isPressed() == true){
			for(int x = 0; x<off.size();x++){
				if(graph.getmouseX() <=Office[x]+20 && graph.getmouseX() >=Office[x] 
						&& graph.getmouseY() >= Office[x+1] &&graph.getmouseY() <= Office[x+1]+20){
					off.get(x).click(g, Office[x], Office[x+1]);
					x++;
				}

			}
			for(int x = 0; x<B.size();x++){
				if(graph.getmouseX() <=Bbuilding[x]+20 && graph.getmouseX() >=Bbuilding[x] 
						&& graph.getmouseY() >= Bbuilding[x+1] &&graph.getmouseY() <= Bbuilding[x+1]+20){
					B.get(x).click(g, Bbuilding[x], Bbuilding[x+1]);
					x++;
				}

			}
			for(int x = 0; x<C.size();x++){
				if(graph.getmouseX() <=Cbuilding[x]+20 && graph.getmouseX() >=Cbuilding[x] 
						&& graph.getmouseY() >= Cbuilding[x+1] &&graph.getmouseY() <= Cbuilding[x+1]+20){
					C.get(x).click(g, Cbuilding[x], Cbuilding[x+1]);
					x++;
				}

			}
			for(int x = 0; x<D.size();x++){
				if(graph.getmouseX() <=Dbuilding[x]+20 && graph.getmouseX() >=Dbuilding[x] 
						&& graph.getmouseY() >= Dbuilding[x+1] &&graph.getmouseY() <= Dbuilding[x+1]+20){
					D.get(x).click(g, Dbuilding[x], Dbuilding[x+1]);
					x++;
				}

			}
			for(int x = 0; x<E.size();x++){
				if(graph.getmouseX() <=Ebuilding[x]+20 && graph.getmouseX() >=Ebuilding[x] 
						&& graph.getmouseY() >= Ebuilding[x+1] &&graph.getmouseY() <= Ebuilding[x+1]+20){
					E.get(x).click(g, Ebuilding[x], Ebuilding[x+1]);
					x++;
				}

			}
			for(int x = 0; x<F.size();x++){
				if(graph.getmouseX() <=Fbuilding[x]+20 && graph.getmouseX() >=Fbuilding[x] 
						&& graph.getmouseY() >= Fbuilding[x+1] &&graph.getmouseY() <= Fbuilding[x+1]+20){
					F.get(x).click(g, Fbuilding[x], Fbuilding[x+1]);
					x++;
				}

			}
			for(int x = 0; x<G.size();x++){
				if(graph.getmouseX() <=Gbuilding[x]+20 && graph.getmouseX() >=Gbuilding[x] 
						&& graph.getmouseY() >= Gbuilding[x+1] &&graph.getmouseY() <= Gbuilding[x+1]+20){
					G.get(x).click(g, Gbuilding[x], Gbuilding[x+1]);
					x++;
				}

			}
			for(int x = 0; x<H.size();x++){
				if(graph.getmouseX() <=Hbuilding[x]+20 && graph.getmouseX() >=Hbuilding[x] 
						&& graph.getmouseY() >= Hbuilding[x+1] &&graph.getmouseY() <= Hbuilding[x+1]+20){
					H.get(x).click(g, Hbuilding[x], Hbuilding[x+1]);
					x++;
				}

			}
			for(int x = 0; x<I.size();x++){
				if(graph.getmouseX() <=Ibuilding[x]+20 && graph.getmouseX() >=Ibuilding[x] 
						&& graph.getmouseY() >= Ibuilding[x+1] &&graph.getmouseY() <= Ibuilding[x+1]+20){
					I.get(x).click(g, Ibuilding[x], Ibuilding[x+1]);
					x++;
				}

			}
			for(int x = 0; x<J.size();x++){
				if(graph.getmouseX() <=Jbuilding[x]+20 && graph.getmouseX() >=Jbuilding[x] 
						&& graph.getmouseY() >= Jbuilding[x+1] &&graph.getmouseY() <= Jbuilding[x+1]+20){
					J.get(x).click(g, Jbuilding[x], Jbuilding[x+1]);
					x++;
				}

			}
			for(int x = 0; x<L.size();x++){
				if(graph.getmouseX() <=Lbuilding[x]+20 && graph.getmouseX() >=Lbuilding[x] 
						&& graph.getmouseY() >= Lbuilding[x+1] &&graph.getmouseY() <= Lbuilding[x+1]+20){
					L.get(x).click(g, Lbuilding[x], Lbuilding[x+1]);
					x++;
				}

			}
			for(int x = 0; x<M.size();x++){
				if(graph.getmouseX() <=Mbuilding[x]+20 && graph.getmouseX() >=Mbuilding[x] 
						&& graph.getmouseY() >= Mbuilding[x+1] &&graph.getmouseY() <= Mbuilding[x+1]+20){
					M.get(x).click(g, Mbuilding[x], Mbuilding[x+1]);
					x++;
				}

			}
			for(int x = 0; x<Q.size();x++){
				if(graph.getmouseX() <=Qbuilding[x]+20 && graph.getmouseX() >=Qbuilding[x] 
						&& graph.getmouseY() >= Qbuilding[x+1] &&graph.getmouseY() <= Qbuilding[x+1]+20){
					Q.get(x).click(g, Qbuilding[x], Qbuilding[x+1]);
					x++;
				}

			}
			for(int x = 0; x<Q1.size();x++){
				if(graph.getmouseX() <=Q1building[x]+20 && graph.getmouseX() >=Q1building[x] 
						&& graph.getmouseY() >= Q1building[x+1] &&graph.getmouseY() <= Q1building[x+1]+20){
					Q1.get(x).click(g, Q1building[x], Q1building[x+1]);
					x++;
				}

			}
			for(int x = 0; x<P.size();x++){
				if(graph.getmouseX() <=Pbuilding[x]+20 && graph.getmouseX() >=Pbuilding[x] 
						&& graph.getmouseY() >= Pbuilding[x+1] &&graph.getmouseY() <= Pbuilding[x+1]+20){
					P.get(x).click(g, Pbuilding[x], Pbuilding[x+1]);
					x++;
				}

			}
			
		}
	}

	

}