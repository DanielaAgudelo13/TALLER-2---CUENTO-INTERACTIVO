package modelo;

import processing.core.PApplet;

public class ObjetoInteractivo {
	int posX;
	int posY;
	int ancho;
	int alto;
	PApplet app;
	
	public ObjetoInteractivo(int posX, int posY, int ancho, int alto, PApplet app) {
		this.posX = posX;
		this.posY = posY;
		this.ancho = ancho;
		this.alto = alto;
		this.app = app;
	}

	
	public void pintar() {
		app.fill(0);
		app.rect(posX, posY, ancho, alto);
	}
}
