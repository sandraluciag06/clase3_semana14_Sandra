
import processing.core.PApplet;

public class CirculoForma {

	
	
		private int x;
		private int y;
		private int diametro;

		/*public CirculoForma() {
			this.x = 115;
			this.y = 145;
			this.diametro = 50;
			
		}*/
		
		public CirculoForma(int x, int y, int diametro) {
			this.x = x;
			this.y = y;
			this.diametro = diametro;
			
		}
		
		public void pintar (PApplet app){
			app.fill(0,255,255);
		app.ellipse(x,y,diametro, diametro);
		}
public void setX(int x) {
	this.x = x;
}
public void setY(int y) {
	this.y = y;
}
		public int getDiametro() {
			return diametro;
		}
		public int getX() {
			return x;
		}
		public int getY() {
			return y;
		}
	}