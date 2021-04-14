package modelo;

import processing.core.PApplet;

public class ObjetoInteractivo {
	int posX;
	int posY;
	int ancho;
	int alto;
	PApplet app;
	boolean activado;
	
	public ObjetoInteractivo(int posX, int posY, int ancho, int alto, boolean activado, PApplet app) {
		this.posX = posX;
		this.posY = posY;
		this.ancho = ancho;
		this.alto = alto;
		this.app = app;
		this.activado = activado;
		
	}

	
	public void pintar() {
		
		
	}
}
