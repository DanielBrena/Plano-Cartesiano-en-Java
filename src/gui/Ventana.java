package gui;


import java.awt.Color;
import java.awt.Graphics;
import java.util.List;

import javax.swing.JFrame;

import listaLigada.ListaDB;
import matriz.MultiplicacionImpl;
import matriz.RotacionImp;
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
		lp.add(new Punto(2,1));
		lp.add(new Punto(4,3));
		lp.add(new Punto(6,1));
		lp.add(new Punto(4,7));
		lp.add(new Punto(2,1));
		/*lp.add(new Punto(9,1));
		lp.add(new Punto(5,1));
		lp.add(new Punto(2,4));
		lp.add(new Punto(2,8));
		lp.add(new Punto(5,11));*/
		
		Poligono poligono = new
				Poligono(lp);
		poligono.dibujar(g,new Color(0,0,0));
		
		Poligono poligono2 = new
				Poligono(MultiplicacionImpl.escalar(poligono, 1.3));
		poligono2.dibujar(g,new Color(255,0,0));
		
		Poligono poligono4 = new Poligono(RotacionImp.rotacion(poligono, 180.0));
		poligono4.dibujar(g,new Color(255,0,255));
		
		Poligono poligono3 = new
				Poligono(SumaImpl.sumar(poligono, new Punto(-10,0)));
		poligono3.dibujar(g,new Color(255,255,0));
		
		
		
		
		
		
	}
}
