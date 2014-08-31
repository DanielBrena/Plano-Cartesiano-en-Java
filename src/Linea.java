
/**
 * 
 * @author codecon-work : Daniel Brena Aquino
 * @version 1.0
 *
 */
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.geom.Line2D;


public class Linea {
	private Punto punto1;
	private Punto punto2;
	
	public Linea(){}
	/**
	 * Constructor de clase.
	 * Una linea se forma 2 puntos.
	 * @param punto1 Punto (x,y)
	 * @param punto2 Punto (x,y)
	 */
	public Linea(Punto punto1, Punto punto2){
		this.punto1 = punto1;
		this.punto2 = punto2;
		
	}
	
	/**
	 * Constructor de clase.
	 * 
	 * @param x1 Punto1 x
	 * @param y1 Punto1 y
	 * @param x2 Punto2 x
	 * @param y2 Punto2 y
	 * @param texto Boolean Si quiere que lleve texto con la coordenada.
	 */
	public Linea(double x1, double y1, double x2, double y2,boolean texto){
		if(texto){
			this.punto1 = new Punto(x1, y1,true);
			this.punto2 = new Punto(x2, y2,true);
		}else{
			this.punto1 = new Punto(x1, y1,false);
			this.punto2 = new Punto(x2, y2,false);
		}
	}
	
	/**
	 * Constructor de clase.
	 * 
	 * @param x1 Punto1 x
	 * @param y1 Punto1 y
	 * @param x2 Punto2 x
	 * @param y2 Punto2 y
	 * @param texto Boolean Si quiere que lleve texto con la coordenada.
	 */
	public Linea(double x1, double y1, double x2, double y2){
		
			this.punto1 = new Punto(x1, y1,false);
			this.punto2 = new Punto(x2, y2,false);
		
	}
	
	/**
	 * Metodo dibujar.
	 * Dibujara una recta.
	 * @param g  Graphics2D
	 */
	public void dibujar(Graphics2D g){
		g.setColor(new Color(100,100,100));
		g.setFont(new Font( "SansSerif", Font.PLAIN, 10 ));
		g.drawString(punto1.toString(), (int)punto1.get_x()+2,(int) punto1.get_y() -2);
		g.drawString(punto2.toString(), (int)punto2.get_x()+2,(int) punto2.get_y() -2);
		g.setColor(Color.BLACK);
		Line2D linea = new Line2D.Double(punto1.get_x(),punto1.get_y(),punto2.get_x(),punto2.get_y());
		g.draw(linea);
	}

	

	
	
}
