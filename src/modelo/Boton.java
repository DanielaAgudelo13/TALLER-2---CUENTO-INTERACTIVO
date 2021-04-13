package modelo;

import processing.core.PApplet;
import processing.core.PImage;

public class Boton {
	
	int posX;
	int posY;
	int ancho;
	int alto;
	PImage imagen;
	PApplet app;
	
	public Boton(int posX, int posY, int ancho, int alto, PImage imagen, PApplet app) {
		
		this.posX = posX;
		this.posY = posY;
		this.ancho = ancho;
		this.alto = alto;
		this.imagen = imagen;
		this.app = app;
	}
	
	public void pintar () {
		
		app.image(imagen, posX, posY, ancho, alto);
	}
	
	

}
