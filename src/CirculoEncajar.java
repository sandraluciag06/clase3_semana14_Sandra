
import processing.core.PApplet;

public class CirculoEncajar {

	
	
		private int x;
		private int y;
		private int diametro;

		public CirculoEncajar () {
			this.x = 240;
			this.y = 170;
			this.diametro = 50;
			
		}
		
		public CirculoEncajar (int x, int y, int lado) {
			this.x = x;
			this.y = y;
			this.diametro = lado;
			
		}
		
		public void pintar (PApplet app){
			app.fill(255);
		app.ellipse(x,y,diametro, diametro);
		}
public int getX() {
	return x;
}
public int getDiametro() {
	return diametro;
}
public int getY() {
	return y;
}
		
		}