import processing.core.PApplet;

public class Prin_encajarfiguras extends PApplet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		PApplet.main("Prin_encajarfiguras");
	}
@Override
	public void settings() {
		size(500, 500);
	}
int x1,x2,x3;
int y1,y2,y3;

CuadradoEncajar obj;
CirculoEncajar ee;
TrianguloEncajar te;
CuadradoForma cf; CuadradoForma sel;
CirculoForma elf; CirculoForma selc;
TrianguloForma tf; TrianguloForma sele;

@Override
	public void setup() {
		obj = new CuadradoEncajar();
		ee = new CirculoEncajar();
		te = new TrianguloEncajar();
		cf = new CuadradoForma();
		elf = new CirculoForma(235,270,50);
		tf = new TrianguloForma();
		
x1=100; x2=200; x3=300;
y1=130; y2=130; y3=130;

sel = null;
selc = null;
sele = null;
	}
@Override
	public void draw() {

		background(255, 100, 50);
		textSize(14);
		text("Solo alumbrarán de verde las figuras, cuando las ", 25, 50); 
		text("emparejes exacta y delicadamente con los bordes correspondientes",25,62);
		fill(255);
		rect(x1,y1,80,80);
		rect(x2,y2,80,80);
		rect(x3,y3,80,80);
		
		//if(obj.getX() == cf.getX() && obj.getY() == cf.getY()){
		if(obj.getX()>= cf.getX() && obj.getX()<= cf.getX() + cf.getLado() 
				&& obj.getY() >= cf.getY() && obj.getY() <= cf.getY()+ cf.getLado()){
			fill(0,255,0);
			rect(x1,y1,80,80);
		}
		
		if(elf.getX() >= ee.getX() && elf.getX() <= ee.getX() &&				
				elf.getY() >= ee.getY() && elf.getDiametro()/2 >=
				  ee.getDiametro()/2){
			fill(0,255,0);
			rect(x2,y2,80,80);
		}
		else{}
					
		obj.pintar(this);
		ee.pintar(this);
		cf.pintar(this);
		elf.pintar(this);
		te.pintar(this);
		tf.pintar(this);
	    
	}
@Override
	public void mousePressed() {
	
if(dist(mouseX, mouseY, cf.getX(), cf.getY())<50){
	sel=cf;
}
if (dist(mouseX, mouseY, elf.getX(), elf.getY())<elf.getDiametro()/2){
	selc = elf;
}
if (mouseX >= tf.getX1() && mouseX <= tf.getX3() && mouseY >= tf.getY2() &&
     mouseY <= tf.getY1()){
	sele = tf;
	}
}

public void mouseDragged() {
	if (selc != null){
		selc.setX(mouseX);
		selc.setY(mouseY);
	}
	if (sel != null){
		sel.setX(mouseX);
		sel.setY(mouseY);
	}
	if (sele != null){
		sele.setX1(mouseX);
		sele.setY1(mouseY);
	
	}
}
public void mouseReleased(){
	selc=null;
	sel=null;
	sele = null;
}
}
