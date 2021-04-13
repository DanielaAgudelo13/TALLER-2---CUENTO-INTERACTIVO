package modelo;

import processing.core.PApplet;
import processing.core.PFont;
import processing.core.PImage;

public class Logica {

	PApplet app;
	PFont mangostana;
	PImage[] paginas;
	int numeroPagina;
	Boton inicioBtn;
	Boton boton2;
	Boton boton3;
	Boton boton4;
	PImage[] botones;
	String [] cuentoData;

	public Logica(PApplet app) {

		this.app = app;
		this.mangostana = app.createFont("../fonts/Mangostana.otf", 36);
		this.paginas = new PImage[7];
		this.paginas[0] = app.loadImage("../img/inicio.jpg");
		this.paginas[1] = app.loadImage("../img/habiaunavez.jpg");
		this.paginas[2] = app.loadImage("../img/relato1.jpg");
		this.paginas[3] = app.loadImage("../img/relato2.jpg");
		this.paginas[4] = app.loadImage("../img/relato3.jpg");
		this.paginas[5] = app.loadImage("../img/relato4.jpg");
		this.paginas[6] = app.loadImage("../img/fin.jpg");
		this.numeroPagina = 0;
		this.botones = new PImage[4];
		this.botones[0] = app.loadImage("../img/boton1.png");
		this.botones[1] = app.loadImage("../img/boton2.png");
		this.botones[2] = app.loadImage("../img/boton3.png");
		this.botones[3] = app.loadImage("../img/boton4ultimo.png");
		this.inicioBtn = new Boton(960, 551, 148, 60, botones[0], app);
		this.boton2 = new Boton(960, 551, 148, 60, botones[1], app);
		this.cuentoData = app.loadStrings("../data/Cuentoprincesa.txt");

	}

	public void pintar() {

		app.image(paginas[numeroPagina], 0, 0, 1200, 700);
		

		switch (numeroPagina) {

		case 0:

			inicioBtn.pintar();
			break;

		case 1:
			
			boton2.pintar();
			app.textSize(36);
			app.textFont(mangostana);
			app.fill(0);
			app.textAlign(app.RIGHT);
			app.textLeading(25);
			app.text(cuentoData[0], 614, 246, 505, 233);
			//System.out.println(cuentoData[0]);
			break;

		}
	}

	public void interactuarClick() {
		switch (numeroPagina) {

		case 0:
			cambiarPagina(inicioBtn);
			break;

		case 1:
			cambiarPagina(boton2);

			break;

		}
	}

	public void cambiarPagina(Boton boton) {
		if (app.mouseX >= boton.posX && app.mouseX <= boton.posX + boton.ancho && app.mouseY >= boton.posY
				&& app.mouseY <= boton.posY + boton.alto) {
			numeroPagina++;
		}
		
		
	}

}
