import processing.core.PApplet;

public class TrianguloEncajar {

	
	
		private int x1;
		private int y1;
		private int x2;
		private int y2;
		private int x3;
		private int y3;

		public TrianguloEncajar () {
			this.x1 = 315;
			this.y1 = 195;
			this.x2 = 340;
			this.y2 = 145;
			this.x3 = 365;
			this.y3 = 195;
			
		}
		
		public TrianguloEncajar(int x1, int y1, int x2, int y2, int x3, int y3 ) {
			
			this.x1 = x1;
			this.y1 = y1;
			this.x2 = x2;
			this.y2 = y2;
			this.x3 = x3;
			this.y3 = y3;
						
		}
		
		public void pintar (PApplet app){
			app.fill(255);
		app.triangle(x1,y1, x2, y2, x3, y3);
		}

		
		}