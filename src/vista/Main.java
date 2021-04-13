package vista;

import control.Controlador;
import processing.core.PApplet;

public class Main extends PApplet {
	
	public static void main(String[] args) {
		PApplet.main("vista.Main");
	}
	
	Controlador controlador;
	
	public void settings () {
		size (1200,700);
	}
	
	public void setup () {
		controlador = new Controlador(this);
	}
	
	public void draw () {
		background(0);
		controlador.pintar();
	}
	
	public void mousePressed() {
		controlador.interactuarClick();
	}

}
