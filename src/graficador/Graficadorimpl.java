package graficador;

import matriz.Matriz;
import matriz.MultiplicacionImpl;
import matriz.SumaImpl;
import punto.Punto;


public class Graficadorimpl implements Graficador{
	int FACTOr_ESCALACION = 10;

	
	public  int teX(Double x) {
		return (int) ((x *  FACTOr_ESCALACION) + 320);
	}

	@Override
	public int teY(Double y) {
		return (int) ( - (y * FACTOr_ESCALACION ) +240);
	}


	@Override
	public Matriz multiplicar(Matriz m1, Matriz m2) {
	
		return MultiplicacionImpl.multiplicacion(m1, m2);
	}

	@Override
	public Matriz sumar(Matriz m1, Matriz m2) {
		
		return SumaImpl.suma(m1, m2);
		
	}

}
