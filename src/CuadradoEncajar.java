import processing.core.PApplet;

public class CuadradoEncajar {

	
	
		private int x;
		private int y;
		private int lado;

		public CuadradoEncajar() {
			this.x = 115;
			this.y = 145;
			this.lado = 50;
			
		}
		
		public CuadradoEncajar(int x, int y, int lado) {
			this.x = x;
			this.y = y;
			this.lado = lado;
			
		}
		
		public void pintar (PApplet app){
			app.fill(255);
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
		
		}

	

