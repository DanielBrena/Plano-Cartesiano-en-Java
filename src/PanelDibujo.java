/**
 * 
 * @author codecon-work : Daniel Brena Aquino
 * @version 1.0
 *
 */
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Line2D;
import java.awt.geom.Rectangle2D;

import javax.swing.JPanel;


public class PanelDibujo extends JPanel {
		
	public PanelDibujo(){
		
	}
	
	
	public void paintComponent(Graphics g){
		super.paintComponent(g);
		Graphics2D g2 = (Graphics2D)g;
		
		
		Plano plano = new Plano(Ventana.ANCHO,Ventana.ALTO);
		plano.dibujar(g2);
		
		Linea linea = new Linea(0,0,0,100);
		Linea linea2 = new Linea(0,100,100,100,true);
		Linea linea3 = new Linea(100,0,100,100);
		
		linea2.dibujar(g2);
	}

	
	
}
