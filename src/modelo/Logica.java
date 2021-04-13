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
	Boton boton4ultimo;
	PImage[] botones;
	String[] cuentoData;
	String[] parrafo2;
	String textoInteractivo1;
	ObjetoInteractivo objInteractivo1;

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
		this.numeroPagina = 6;
		this.botones = new PImage[4];
		this.botones[0] = app.loadImage("../img/boton1.png");
		this.botones[1] = app.loadImage("../img/boton2.png");
		this.botones[2] = app.loadImage("../img/boton3.png");
		this.botones[3] = app.loadImage("../img/boton4ultimo.png");
		this.inicioBtn = new Boton(960, 551, 148, 60, botones[0], app);
		this.boton2 = new Boton(960, 551, 148, 60, botones[1], app);
		this.boton3 = new Boton(897, 486, 206, 60, botones[2], app);
		this.boton4ultimo = new Boton(950, 572, 158, 60, botones[3], app);
		this.cuentoData = app.loadStrings("../data/Cuentoprincesa.txt");
		this.parrafo2 = cuentoData[1].split(" ");
		this.textoInteractivo1 = parrafo2[8].substring(0, parrafo2[8].length() - 1);
		this.objInteractivo1 = new ObjetoInteractivo(546, 515, 56, 31, app);
		// System.out.println(textoInteractivo1);
	}

	public void pintar() {

		app.image(paginas[numeroPagina], 0, 0, 1200, 700);
		app.textSize(36);
		app.textFont(mangostana);
		app.fill(0);
		app.textLeading(25);
		
		// 708, 508, 56, 31
		switch (numeroPagina) {

		case 0:

			inicioBtn.pintar();
			break;

		case 1:

			boton2.pintar();
			app.textAlign(app.RIGHT);
			app.text(cuentoData[0], 614, 246, 505, 233);


			// System.out.println(cuentoData[0]);
			break;

		case 2:

			app.textAlign(app.CENTER);
			app.text(cuentoData[1], 28, 503, 1150, 160);
			app.text(cuentoData[2], 28, 580, 1150, 160);
			//objInteractivo1.pintar();
			break;

		case 3:
			
			app.textAlign(app.CENTER);
			app.text(cuentoData[3], 28, 503, 1150, 160);
			break;
			
		case 4:
			
			app.textAlign(app.CENTER);
			app.text(cuentoData[4], 28, 503, 1150, 160);
			break;
			
		case 5: 
			
			app.textAlign(app.CENTER);
			app.text(cuentoData[5], 28, 503, 1150, 160);
			break;
		
		case 6:
			
			app.textAlign(app.RIGHT);
			app.text(cuentoData[6], 576, 318, 518, 158);
			app.text(cuentoData[7], 576, 420, 518, 158);
			boton3.pintar();
			boton4ultimo.pintar();
			
			break;
		
			
		}
	}

	public void interactuarClick() {
		System.out.println(app.mouseX + " " + app.mouseY);
		switch (numeroPagina) {

		case 0:
			cambiarPagina(inicioBtn);
			break;

		case 1:
			cambiarPagina(boton2);
			break;

		case 2:
			interactuarObjeto(objInteractivo1);
			break;
			
		}
	}

	public void cambiarPagina(Boton boton) {
		if (app.mouseX >= boton.posX && app.mouseX <= boton.posX + boton.ancho && app.mouseY >= boton.posY
				&& app.mouseY <= boton.posY + boton.alto) {
			numeroPagina++;
		}
	}

	public void interactuarObjeto(ObjetoInteractivo objInteractivo) {
		if (app.mouseX >= objInteractivo.posX && app.mouseX <= objInteractivo.posX + objInteractivo.ancho
				&& app.mouseY >= objInteractivo.posY && app.mouseY <= objInteractivo.posY + objInteractivo.alto) {
			System.out.println("ok");
			parrafo2[8].toUpperCase();
		}
	}

}
