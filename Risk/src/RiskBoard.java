import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;

public class RiskBoard {

	int[] Office = {520,520,560,520,520,560,520,560,520,560,560,560};
	int[] Bbuilding = {420,520,460,520,420,560,460,560,420,560,460,560};
	int[] Cbuilding = {320,520,360,520,320,560,360,560,320,560,360,560};
	int[] Dbuilding = {420,520,260,520,420,560,260,560,420,560,260,560};
	int[] Ebuilding = {170,470,190,470,170,490,190,490,170,510,190,510};
	int[] Fbuilding = {120,370,160,370,160,370,120,390,160,390,160,390};
	int[] Gbuilding = {100+20,300+20,140+20,300+20,140+20,300+20,100+20,340+20,140+20,340+20,140+20,340+20};
	int[] Hbuilding = {400+20,400+20,240+20,400+20,400+20,240+20,240+20,240+20,400+20,240+20,240+20,240+20};
	int[] Ibuilding = {250+20,125+20,270+20,125+20,290+20,125+20,250+20,145+20,270+20,145+20,290+20,145+20};
	int[] Jbuilding = {300+20,400+20,340+20,400+20,300+20,240+20,340+20,240+20,300+20,240+20,340+20,240+20};
	int[] Lbuilding = {350+20,125+20,370+20,125+20,390+20,125+20,350+20,145+20,370+20,145+20,390+20,145+20};
	int[] Mbuilding = {400+20,400+20,440+20,400+20,400+20,240+20,440+20,240+20,400+20,240+20,440+20,240+20};
	int[] Qbuilding = {650+20,500+20,670+20,500+20,690+20,500+20,650+20,540+20,670+20,540+20,690+20,540+20};
	int[] Q1building = {740+20,450+20,760+20,450+20,740+20,470+20,760+20,470+20,740+20,490+20,760+20,490+20};
	int[] Pbuilding = {650+20,400+20,670+20,400+20,650+20,240+20,670+20,240+20,650+20,240+20,670+20,240+20};
	
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
	Boolean canAdd = false;
	
	
	
	
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
	
	
	public boolean canAddTroop(){
		return canAdd;
	}
	public void draw(Graphics g){
		int y = 1;
		for(int x = 0; x<off.size();x++){
			off.get(x).drawClassroom(g, Office[x], Office[x+1]);
			g.drawString("Off", Office[x], Office[x+1]+40);
			x++;
		}
		y=1;
		for(int x = 0; x<B.size();x++){
			
			B.get(x).drawClassroom(g, Bbuilding[x], Bbuilding[x+1]);
			g.drawString("B"+y,Bbuilding[x], Bbuilding[x+1]+40);
			y++;
			x++;
		}
		y=1;
		for(int x = 0; x<C.size();x++){
			C.get(x).drawClassroom(g, Cbuilding[x], Cbuilding[x+1]);
			g.drawString("C"+y,Cbuilding[x], Cbuilding[x+1]+40);
			y++;
			x++;
		}
		y=1;
		for(int x = 0; x<D.size();x++){
			D.get(x).drawClassroom(g, Dbuilding[x], Dbuilding[x+1]);
			g.drawString("D"+y,Dbuilding[x], Dbuilding[x+1]+40);
			y++;
			x++;
		}
		y=1;
		for(int x = 0; x<E.size();x++){
			E.get(x).drawClassroom(g, Ebuilding[x], Ebuilding[x+1]);
			g.drawString("E"+y,Ebuilding[x], Ebuilding[x+1]+40);
			y++;
			x++;
		}
		y=1;
		for(int x = 0; x<F.size();x++){
			F.get(x).drawClassroom(g, Fbuilding[x], Fbuilding[x+1]);
			g.drawString("F"+y,Fbuilding[x], Fbuilding[x+1]+40);
			y++;
			x++;
		}
		y=1;
		for(int x = 0; x<G.size();x++){
			G.get(x).drawClassroom(g, Gbuilding[x], Gbuilding[x+1]);
			g.drawString("G"+y,Gbuilding[x], Gbuilding[x+1]+40);
			y++;
			x++;
		}
		y=1;
		for(int x = 0; x<H.size();x++){
			H.get(x).drawClassroom(g, Hbuilding[x], Hbuilding[x+1]);
			g.drawString("H"+y,Hbuilding[x], Hbuilding[x+1]+40);
			y++;
			x++;
		}
		y=1;
		for(int x = 0; x<I.size();x++){
			I.get(x).drawClassroom(g, Ibuilding[x], Ibuilding[x+1]);
			g.drawString("I"+y,Ibuilding[x], Ibuilding[x+1]+40);
			y++;
			x++;
		}
		y=1;
		for(int x = 0; x<J.size();x++){
			J.get(x).drawClassroom(g, Jbuilding[x], Jbuilding[x+1]);
			g.drawString("J"+y,Jbuilding[x], Jbuilding[x+1]+40);
			y++;
			x++;
		}
		y=1;
		for(int x = 0; x<L.size();x++){
			L.get(x).drawClassroom(g, Lbuilding[x], Lbuilding[x+1]);
			g.drawString("L"+y,Lbuilding[x], Lbuilding[x+1]+40);
			y++;
			x++;
		}
		y=1;
		for(int x = 0; x<M.size();x++){
			M.get(x).drawClassroom(g, Mbuilding[x], Mbuilding[x+1]);
			g.drawString("M"+y,Mbuilding[x], Mbuilding[x+1]+40);
			y++;
			x++;
		}
		y=1;
		for(int x = 0; x<Q.size();x++){
			Q.get(x).drawClassroom(g, Qbuilding[x], Qbuilding[x+1]);
			g.drawString("Q"+y,Qbuilding[x], Qbuilding[x+1]+40);
			y++;
			x++;
		}
		y=1;
		for(int x = 0; x<Q1.size();x++){
			Q1.get(x).drawClassroom(g, Q1building[x], Q1building[x+1]);
			g.drawString("Q"+y,Qbuilding[x], Qbuilding[x+1]+40);
			y++;
			x++;
		}
		y=1;
		for(int x = 0; x<P.size();x++){
			P.get(x).drawClassroom(g, Pbuilding[x], Pbuilding[x+1]);
			g.drawString("P"+y,Pbuilding[x], Pbuilding[x+1]+40);
			y++;
			x++;
		}
	}
	
	public void Clickloc(Graphics g, int tX, int tY) {
		if(graph.isPressed() == true){
			for(int x = 0; x<off.size()-1;x++){
				if(graph.getmouseX() <=Office[x]+40 && graph.getmouseX() >=Office[x] 
						&& graph.getmouseY() >= Office[x+1] &&graph.getmouseY() <= Office[x+1]+40){
					off.get(x).click(g, Office[x], Office[x+1]);
					canAdd = true;
					System.out.println("Office Building");
					x++;
				}
				

			}
			canAdd=false;
			for(int x = 0; x<B.size()-1;x++){
				if(graph.getmouseX() <=Bbuilding[x]+40 && graph.getmouseX() >=Bbuilding[x] 
						&& graph.getmouseY() >= Bbuilding[x+1] &&graph.getmouseY() <= Bbuilding[x+1]+40){
					B.get(x).click(g, Bbuilding[x], Bbuilding[x+1]);
					System.out.println("B Building");
					canAdd = true;
					x++;
				}
				
			}
			canAdd=false;
			for(int x = 0; x<C.size()-1;x+=2){
				if(graph.getmouseX() <=Cbuilding[x]+40 && graph.getmouseX() >=Cbuilding[x] 
						&& graph.getmouseY() >= Cbuilding[x+1] &&graph.getmouseY() <= Cbuilding[x+1]+40){
					C.get(x).click(g, Cbuilding[x], Cbuilding[x+1]);
					System.out.println("C Building");
					canAdd = true;
					x++;
				}
			}
			canAdd=false;
			for(int x = 0; x<D.size()-1;x++){
				if(graph.getmouseX() <=Dbuilding[x]+40 && graph.getmouseX() >=Dbuilding[x] 
						&& graph.getmouseY() >= Dbuilding[x+1] &&graph.getmouseY() <= Dbuilding[x+1]+40){
					D.get(x).click(g, Dbuilding[x], Dbuilding[x+1]);
					System.out.println("D Building");
					canAdd = true;
					x++;
				}

			}
			canAdd=false;
			for(int x = 0; x<E.size()-1;x++){
				if(graph.getmouseX() <=Ebuilding[x]+40 && graph.getmouseX() >=Ebuilding[x] 
						&& graph.getmouseY() >= Ebuilding[x+1] &&graph.getmouseY() <= Ebuilding[x+1]+40){
					E.get(x).click(g, Ebuilding[x], Ebuilding[x+1]);
					System.out.println("E Building");
					canAdd = true;
					x++;
				}

			}
			canAdd=false;
			for(int x = 0; x<F.size()-1;x++){
				if(graph.getmouseX() <=Fbuilding[x]+40 && graph.getmouseX() >=Fbuilding[x] 
						&& graph.getmouseY() >= Fbuilding[x+1] &&graph.getmouseY() <= Fbuilding[x+1]+40){
					F.get(x).click(g, Fbuilding[x], Fbuilding[x+1]);
					System.out.println("F Building");
					canAdd = true;
					x++;
				}

			}
			canAdd=false;
			for(int x = 0; x<G.size()-1;x++){
				if(graph.getmouseX() <=Gbuilding[x]+40 && graph.getmouseX() >=Gbuilding[x] 
						&& graph.getmouseY() >= Gbuilding[x+1] &&graph.getmouseY() <= Gbuilding[x+1]+40){
					G.get(x).click(g, Gbuilding[x], Gbuilding[x+1]);
					System.out.println("G Building");
					canAdd = true;
					x++;
				}

			}
			canAdd=false;
			for(int x = 0; x<H.size()-1;x++){
				if(graph.getmouseX() <=Hbuilding[x]+40 && graph.getmouseX() >=Hbuilding[x] 
						&& graph.getmouseY() >= Hbuilding[x+1] &&graph.getmouseY() <= Hbuilding[x+1]+40){
					H.get(x).click(g, Hbuilding[x], Hbuilding[x+1]);
					System.out.println("H Building");
					canAdd = true;
					x++;
				}

			}
			canAdd=false;
			for(int x = 0; x<I.size()-1;x++){
				if(graph.getmouseX() <=Ibuilding[x]+40 && graph.getmouseX() >=Ibuilding[x] 
						&& graph.getmouseY() >= Ibuilding[x+1] &&graph.getmouseY() <= Ibuilding[x+1]+40){
					I.get(x).click(g, Ibuilding[x], Ibuilding[x+1]);
					canAdd = true;
					x++;
				}

			}
			canAdd=false;
			for(int x = 0; x<J.size()-1;x++){
				if(graph.getmouseX() <=Jbuilding[x]+40 && graph.getmouseX() >=Jbuilding[x] 
						&& graph.getmouseY() >= Jbuilding[x+1] &&graph.getmouseY() <= Jbuilding[x+1]+40){
					J.get(x).click(g, Jbuilding[x], Jbuilding[x+1]);
					System.out.println("J Building");
					canAdd = true;
					x++;
				}

			}
			canAdd=false;
			for(int x = 0; x<L.size()-1;x++){
				if(graph.getmouseX() <=Lbuilding[x]+40 && graph.getmouseX() >=Lbuilding[x] 
						&& graph.getmouseY() >= Lbuilding[x+1] &&graph.getmouseY() <= Lbuilding[x+1]+40){
					L.get(x).click(g, Lbuilding[x], Lbuilding[x+1]);
					System.out.println("L Building");
					canAdd = true;
					x++;
				}

			}
			canAdd=false;
			for(int x = 0; x<M.size()-1;x++){
				if(graph.getmouseX() <=Mbuilding[x]+40 && graph.getmouseX() >=Mbuilding[x] 
						&& graph.getmouseY() >= Mbuilding[x+1] &&graph.getmouseY() <= Mbuilding[x+1]+40){
					M.get(x).click(g, Mbuilding[x], Mbuilding[x+1]);
					canAdd = true;
					x++;
				}

			}
			canAdd=false;
			for(int x = 0; x<Q.size()-1;x++){
				if(graph.getmouseX() <=Qbuilding[x]+40 && graph.getmouseX() >=Qbuilding[x] 
						&& graph.getmouseY() >= Qbuilding[x+1] &&graph.getmouseY() <= Qbuilding[x+1]+40){
					Q.get(x).click(g, Qbuilding[x], Qbuilding[x+1]);
					canAdd = true;
					x++;
				}

			}
			canAdd=false;
			for(int x = 0; x<Q1.size()-1;x++){
				if(graph.getmouseX() <=Q1building[x]+40 && graph.getmouseX() >=Q1building[x] 
						&& graph.getmouseY() >= Q1building[x+1] &&graph.getmouseY() <= Q1building[x+1]+40){
					Q1.get(x).click(g, Q1building[x], Q1building[x+1]);
					canAdd = true;
					x++;
				}

			}
			canAdd=false;
			for(int x = 0; x<P.size()-1;x++){
				if(graph.getmouseX() <=Pbuilding[x]+40 && graph.getmouseX() >=Pbuilding[x] 
						&& graph.getmouseY() >= Pbuilding[x+1] &&graph.getmouseY() <= Pbuilding[x+1]+40){
					P.get(x).click(g, Pbuilding[x], Pbuilding[x+1]);
					canAdd = true;
					x++;
				}

			}
			canAdd=false;
			
		}
	}

	

}