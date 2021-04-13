package modelo;

import processing.core.PApplet;
import processing.core.PImage;

public class Logica {
	
	PApplet app;
	PImage[] paginas;
	int numeroPagina;
	
	public Logica (PApplet app) {
		
		this.app = app;
		this.paginas = new PImage[7];
		this.paginas[0] = app.loadImage("../img/inicio.jpg");
		this.paginas[1] = app.loadImage("../img/habiaunavez.jpg");
		this.paginas[2] = app.loadImage("../img/relato1.jpg");
		this.paginas[3] = app.loadImage("../img/relato2.jpg");
		this.paginas[4] = app.loadImage("../img/relato3.jpg");
		this.paginas[5] = app.loadImage("../img/relato4.jpg");
		this.paginas[6] = app.loadImage("../img/fin.jpg");
		this.numeroPagina = 0;
	}
	

	public void pintar () {
		
		app.image(paginas[numeroPagina], 0, 0, 1200, 700);
		
	}
	
}
