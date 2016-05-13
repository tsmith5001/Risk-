
public class Classroom extends Building{
	int troop;
	int x,y;
	String name;
	
 public Classroom(int troops,int x2,int y2,String names){
	 name=names;
	 troop= troops;
	 x=x2;
	 y=y2;
	 //super();
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
 
 
}
