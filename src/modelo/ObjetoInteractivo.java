package modelo;

import processing.core.PApplet;
import processing.core.PImage;

public class ObjetoInteractivo {
	int posX;
	int posY;
	int ancho;
	int alto;
	PApplet app;
	boolean activado;
	PImage imagenOscura;
	PImage imagenNormal;
	String urlNormal;
	String urlOscuro;

	public ObjetoInteractivo(int posX, int posY, int ancho, int alto, boolean activado, String urlNormal,
			String urlOscuro, PApplet app) {
		this.posX = posX;
		this.posY = posY;
		this.ancho = ancho;
		this.alto = alto;
		this.app = app;
		this.activado = activado;
		this.urlNormal = urlNormal;
		this.urlOscuro = urlOscuro;
		this.imagenNormal = app.loadImage("../img/" + this.urlNormal + ".png");
		this.imagenOscura = app.loadImage("../img/" + this.urlOscuro + ".png");
	}

	public void pintar() {
		if (activado) {
			app.image(imagenNormal, posX, posY, ancho, alto);
		} else {
			app.image(imagenOscura, posX, posY, ancho, alto);
		}
	}
	
	public void revelar () {
		
		if (app.mouseX >= posX && app.mouseX <= posX + ancho && app.mouseY >= posY
				&& app.mouseY <= posY + alto) {
			activado = true;
		}
	}

	public int getPosX() {
		return posX;
	}

	public void setPosX(int posX) {
		this.posX = posX;
	}

	public int getPosY() {
		return posY;
	}

	public void setPosY(int posY) {
		this.posY = posY;
	}

	public int getAncho() {
		return ancho;
	}

	public void setAncho(int ancho) {
		this.ancho = ancho;
	}

	public int getAlto() {
		return alto;
	}

	public void setAlto(int alto) {
		this.alto = alto;
	}

	public boolean isActivado() {
		return activado;
	}

	public void setActivado(boolean activado) {
		this.activado = activado;
	}

	public PImage getImagenOscura() {
		return imagenOscura;
	}

	public void setImagenOscura(PImage imagenOscura) {
		this.imagenOscura = imagenOscura;
	}

	public PImage getImagenNormal() {
		return imagenNormal;
	}

	public void setImagenNormal(PImage imagenNormal) {
		this.imagenNormal = imagenNormal;
	}

	public String getUrlNormal() {
		return urlNormal;
	}

	public void setUrlNormal(String urlNormal) {
		this.urlNormal = urlNormal;
	}

	public String getUrlOscuro() {
		return urlOscuro;
	}

	public void setUrlOscuro(String urlOscuro) {
		this.urlOscuro = urlOscuro;
	}
	
}
