package poligono;


import java.awt.Graphics;
import graficador.Graficador;
import graficador.Graficadorimpl;

import java.awt.Graphics;

import punto.Punto;
import listaLigada.ListaDB;

public class Poligono {
	private ListaDB<Punto> puntos;
	
	public Poligono(){
		this.puntos = new ListaDB<Punto>();
	}
	
	public Poligono(ListaDB<Punto> puntos){
		this.puntos = puntos;
	}
	
	public Poligono(Poligono poligono){
		this.puntos = poligono.getPuntos();
	}
	
	public void add(Punto p){
		this.puntos.add(p);
	}
	
	public void dibujar(Graphics g){
		Graficador gr = new Graficadorimpl();
		
		
		for(int i = 0; i < this.puntos.size()-1; i++){
			g.drawLine(gr.teX(this.puntos.get(i).getX()), gr.teY(this.puntos.get(i).getY()), gr.teX(this.puntos.get(i+1).getX()), gr.teY(this.puntos.get(i +1).getY()));
			
		}
	}

	public ListaDB<Punto> getPuntos() {
		return puntos;
	}

	public void setPuntos(ListaDB<Punto> puntos) {
		this.puntos = puntos;
	}
	
	
	
}
