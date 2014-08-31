/**
 * 
 * @author codecon-work : Daniel Brena Aquino
 * @version 1.0
 *
 */
public class Punto {
	private double _x;
	private double _y;
	private double v_x;
	private double v_y;
	private boolean texto;
	public Punto(){}
	
	/**
	 * Constructor punto.
	 * @param _x
	 * @param _y
	 * @param texto boolean Si quiere llevar texto.
	 */
	public Punto(double _x, double _y,boolean texto) {
		super();
		this.v_x = _x;
		this.v_y = _y;
		this._x = ((double)Ventana.ALTO/2) + _x;
		this._y = ((double) Ventana.ANCHO/2) + ((-1)* (_y));
		this.texto = texto;
	}

	public double get_x() {
		return _x;
	}
	public void set_x(double _x) {
		this._x = _x;
	}
	public double get_y() {
		return _y;
	}
	public void set_y(double _y) {
		this._y = _y;
	}
	
	public String toString(){
		if(this.texto){
			return "("+this.v_x+","+this.v_y+")";
		}else{
			return "";
		}
		
	}
	
	
}
