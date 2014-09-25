package matriz;

import matriz.Matriz;
import poligono.Poligono;
import punto.Punto;

import java.util.ArrayList;

import listaLigada.ListaDB;

public class SumaImpl {
	
	/**
	 * Metodo que nos permite sumar los puntos de un poligono con un punto
	 * la cual es la Transformacion.
	 * @param poligono	Poligono Poligono a transformar.
	 * @param punto Punto Punto que se le sumara al poligono.
	 * @return Poligono Retorna un poligono.
	 */
	public static Poligono sumar(Poligono poligono, Punto punto){

		Poligono poligono_aux = new Poligono();
		
		for(int i = 0; i < poligono.getPuntos().size(); i++){
			Punto punto_aux = new Punto();
			punto_aux.setX( punto.getX() + poligono.getPuntos().get(i).getX()  );
			punto_aux.setY( punto.getY() + poligono.getPuntos().get(i).getY()  );
			poligono_aux.getPuntos().add(punto_aux);
			
		}
		
		return poligono_aux;
	}
	
	/**
	 * Metodo que suma dos poligonos para generar otro poligono.
	 * @param poligono1 Poligono Poligono uno.
	 * @param poligono2 POligono Poligono dos.
	 * @return Poligono Retorna un poligono.
	 */
	public static Poligono suma(Poligono poligono1, Poligono poligono2 ){
		Poligono poligono_aux = new Poligono();
		
		for(int i = 0; i < poligono1.getPuntos().size(); i++){
			Punto punto_aux = new Punto();
			punto_aux.setX( poligono1.getPuntos().get(i).getX() + poligono2.getPuntos().get(i).getX()  );
			punto_aux.setY( poligono1.getPuntos().get(i).getY() + poligono2.getPuntos().get(i).getY()  );
			poligono_aux.getPuntos().add(punto_aux);
			
		}
		
		return poligono_aux;
	}
	
	/**
	 * Metodo que sumas dos matrices y regresa el resultado de la suma.
	 * Para que se efectue la suma, las matrices deben ser de la misma dimension.
	 * @param m1 Matriz Primera matriz a sumar.
	 * @param m2 Matriz Segunda matriz a suma
	 * @return Matriz Retorna una matriz.
	 */
	public static Matriz suma(Matriz m1, Matriz m2){
		
		Matriz matriz_aux = null;
		if(isValidoSuma(m1, m2)){
			matriz_aux = UtileriaMatriz.crearMatriz(m1);
			for(int i = 0; i < m1.getMaxFila(); i++){
				
				for(int j = 0; j < m1.getMaxFila(); j++){
					Double valor = m1.getM1().get(j).get(i) + m2.getM1().get(i).get(j);
					matriz_aux.getM1().get(i).add(valor);
				}
				
			}
			return matriz_aux;
			
		}else{
			return null;
		}
		
	}
	
	/**
	 * Metodo que nos valida que dos matrices se sumen.
	 * Deben ser de la misma dimension para efectuar la suma.
	 * @param m1 Matriz Primer matriz a validar.
	 * @param m2 Matriz Segunda matriz a validar.
	 * @return boolean Retorna un booleano
	 */
	private static boolean isValidoSuma(Matriz m1, Matriz m2){
		if(m1.getMaxFila() == m2.getMaxFila() && m1.getMaxCol() == m2.getMaxCol()){
			return true;
		}else{
			return false;
		}
	}
	
	
}
