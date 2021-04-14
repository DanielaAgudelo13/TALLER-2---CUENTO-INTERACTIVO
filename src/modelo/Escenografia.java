package modelo;

import processing.core.PApplet;
import processing.core.PImage;

public class Escenografia {

	int posX;
	int posY;
	int ancho;
	int alto;
	PApplet app;
	PImage imagen;
		
	public Escenografia(int posX, int posY, int ancho, int alto, PApplet app, PImage imagen) {
	
		this.posX = posX;
		this.posY = posY;
		this.ancho = ancho;
		this.alto = alto;
		this.app = app;
		this.imagen = imagen;
	}
	
	public void pintar () {
		
		app.image(imagen,posX, posY, ancho, alto);
	}
}
