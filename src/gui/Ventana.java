package gui;


import java.awt.Graphics;
import java.util.List;

import javax.swing.JFrame;

import listaLigada.ListaDB;
import matriz.MultiplicacionImpl;
import matriz.SumaImpl;
import poligono.Poligono;
import punto.Punto;
import graficador.*;
public class Ventana extends JFrame{
	
	public void paint(Graphics g){
		super.paint(g);
		
		Graficador gr = new Graficadorimpl();
		g.drawLine(gr.teX(-25.0), gr.teY(0.0), gr.teX(25.0),gr.teY(0.0));
		g.drawLine(gr.teX(0.0), gr.teY(25.0), gr.teX(0.0),gr.teY(-25.0));
		
		ListaDB<Punto> lp = new ListaDB<>();
		lp.add(new Punto(5,11));
		lp.add(new Punto(9,11));
		lp.add(new Punto(12,8));
		lp.add(new Punto(12,4));
		lp.add(new Punto(9,1));
		lp.add(new Punto(5,1));
		lp.add(new Punto(2,4));
		lp.add(new Punto(2,8));
		lp.add(new Punto(5,11));
		
		Poligono poligono = new
				Poligono(lp);
		poligono.dibujar(g);
		
		Poligono poligono2 = new
				Poligono(MultiplicacionImpl.escalar(poligono, 1.0));
		poligono2.dibujar(g);
		
		Poligono poligono3 = new
				Poligono(SumaImpl.sumar(poligono, new Punto(-8,0)));
		poligono3.dibujar(g);
		
		
		
		
	}
}
