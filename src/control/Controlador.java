package control;

import modelo.Logica;
import processing.core.PApplet;

public class Controlador {
	
	PApplet app;
	Logica logica;
	
	public Controlador (PApplet app) {
		this.app = app;
		this.logica = new Logica(app);
	}
	
	public void pintar () {
		logica.pintar();
	}
	
	public void interactuarClick() {
		logica.interactuarClick();
	}

}
