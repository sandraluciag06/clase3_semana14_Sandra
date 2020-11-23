
import processing.core.PApplet;

public class TrianguloForma {

	
	
		private int x1;
		private int y1;
		private int x2;
		private int y2;
		private int x3;
		private int y3;

		public TrianguloForma () {
			this.x1 = 315;
			this.y1 = 295;
			this.x2 = 340;
			this.y2 = 245;
			this.x3 = 365;
			this.y3 = 295;
			
		}
		
		public TrianguloForma(int x1, int y1, int x2, int y2, int x3, int y3 ) {
			
			this.x1 = x1;
			this.y1 = y1;
			this.x2 = x2;
			this.y2 = y2;
			this.x3 = x3;
			this.y3 = y3;
						
		}
		
		public void pintar (PApplet app){
			app.fill(0,0,255);
		app.triangle(x1,y1, x2, y2, x3, y3);
		}
public int getX1() {
	return x1;
}
public int getX2() {
	return x2;
}
public int getX3() {
	return x3;
}
public int getY1() {
	return y1;
}
public int getY2() {
	return y2;
}
public int getY3() {
	return y3;
}
		public void setX1(int x1) {
			this.x1 = x1;
		}
		public void setY1(int y1) {
			this.y1 = y1;
		}
		public void setX2(int x2) {
			this.x2 = x2;
		}
		public void setX3(int x3) {
			this.x3 = x3;
		}
		public void setY2(int y2) {
			this.y2 = y2;
		}
		public void setY3(int y3) {
			this.y3 = y3;
		}
		}
