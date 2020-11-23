import processing.core.PApplet;

public class CuadradoForma {

	
	
		private int x;
		private int y;
		private int lado;

		public CuadradoForma() {
			this.x = 115;
			this.y = 245;
			this.lado = 50;
			
		}
		
		public CuadradoForma(int x, int y, int lado) {
			this.x = x;
			this.y = y;
			this.lado = lado;
			
		}
		
		public void pintar (PApplet app){
			app.fill(255,255,0);
		app.rect(x,y,lado, lado);
		}

		public int getX() {
			return x;
		}
		public int getY() {
			return y;
		}
		public int getLado() {
			return lado;
		}
		public void setX(int x) {
			this.x = x;
		}
		public void setY(int y) {
			this.y = y;
		}
		}