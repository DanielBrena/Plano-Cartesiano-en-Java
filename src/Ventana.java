/**
 * 
 * @author codecon-work : Daniel Brena Aquino
 * @version 1.0
 *
 */
import javax.swing.JFrame;

public class Ventana extends JFrame{
	public static final int ANCHO = 600;
	public static final int ALTO = 800;
	private PanelDibujo pd;
	
	public Ventana(){
		this.configuracionVentana();
		PanelDibujo pd = new PanelDibujo();
		super.add(pd);
	}
	
	public void configuracionVentana(){
		super.setTitle("Ventana");
		super.setBounds(300, 100, Ventana.ALTO,Ventana.ANCHO);
		super.setVisible(true);
		super.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
}
