package matriz;
import poligono.Poligono;
import punto.Punto;
import listaLigada.ListaDB;


public class MultiplicacionImpl{
	
	/**
	 * Metodo que nos valida si la multiplicacion es posible realizarse.
	 * El numero de columas de la primera debe ser igual al numero filas de la segunda
	 * matriz.
	 * @param m1 Matriz Primera matriz a validar.
	 * @param m2 Matriz Segunda matriz a validar.
	 * @return boolean Regresa un booleando.
	 */
	public static boolean  isValidoMultiplicacion(Matriz m1,Matriz  m2){
		
		if(m1.getMaxFila() == m2.getMaxCol()){
			return true;
		}else{
			return false;
		}
		
	}
	
	/**
	 * Metodo estatico que realiza la multiplicacion de dos matrices.
	 * Usa un for para ir recorriendo la matriz e ir multiplicando por la otra, 
	 * va almacenando el valor e insertando en una matriz auxiliar.
	 * El metodo valida si es posible realizar la multiplicacion.
	 * @param m1 Matriz Primera matriz que se multiplicara con la otra.
	 * @param m2 Matriz Segunda matriz que se multiplicara con la otra.
	 * @return Matriz Retorna una matriz.
	 */
	public static Matriz multiplicacion(Matriz m1, Matriz m2){

		Matriz matriz_aux = null;
		if( isValidoMultiplicacion(m1, m2)){
			matriz_aux = UtileriaMatriz.crearMatriz(m1);
			
			for(int i = 0; i < m1.getMaxCol(); i++){
				
				for(int j = 0; j < m2.getMaxFila(); j++){
					
					Double acumulador = 0.0;
					
					for(int k = 0; k < m1.getMaxFila(); k++){
						
						acumulador += m1.getM1().get(i).get(k) * m2.getM1().get(k).get(j);
						
					}
					
					matriz_aux.getM1().get(i).add(acumulador);

				}
				
			}
			return matriz_aux;
		}else{
			return null;
		}

	}
	
	
	
	
	
	
	/**
	 * Metodo de escalacion que apartir de un poligono y el valor de escalacion
	 * nos genera un poligono a la escala dada.
	 * @param poligono	Poligono Poligono a escalar.
	 * @param escala	Double Valor de la escala.
	 * @return Poligono Retorna un poligono.
	 */
	public static Poligono escalar(Poligono poligono, Double escala){
		Poligono poligono_aux = new Poligono();
		
		Matriz matriz_escala = new Matriz();
		
		ListaDB<Double> fila_1_escala = new ListaDB<Double>();
		fila_1_escala.add(escala);
		fila_1_escala.add(0.0);
		
		
		ListaDB<Double> fila_2_escala = new ListaDB<Double>();
		
		fila_2_escala.add(0.0);
		fila_2_escala.add(escala);
		
		matriz_escala.addFila(fila_1_escala);
		matriz_escala.addFila(fila_2_escala);
		
		System.out.println("es" + matriz_escala);
		
		
		for(int i = 0; i < poligono.getPuntos().size(); i++){
			Matriz m1 = multiplicacion(matriz_escala, UtileriaMatriz.puntoAMatriz(poligono.getPuntos().get(i)));
			
			Punto punto = UtileriaMatriz.matrizAPunto(m1);
			
			
			poligono_aux.add( UtileriaMatriz.matrizAPunto( multiplicacion(matriz_escala, UtileriaMatriz.puntoAMatriz(poligono.getPuntos().get(i))) ) );
		}
		
		return poligono_aux;
		
		
	}
	
	
	
	/**
	 * Metodo de escalacion que nos genera un poligono escalado a partir de 
	 * un poligono y un punto.
	 * @param poligono Poligono Poligono a escalar.
	 * @param punto Punto con el valor escalable.
	 * @return Poligono Retorna un poligono.
	 */
	public static Poligono escalacion(Poligono poligono, Punto punto){
		Poligono poligono_aux = new Poligono();
		
		for(int i = 0; i < poligono.getPuntos().size(); i++){
			Punto punto_aux = new Punto();
			punto_aux.setX( poligono.getPuntos().get(i).getX() * punto.getX());
			punto_aux.setY( poligono.getPuntos().get(i).getX() * punto.getY());
			poligono_aux.add(punto_aux);
		}
		
		return poligono_aux;
	}
	
	
	
}
