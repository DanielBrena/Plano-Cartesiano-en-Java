package matriz;

import listaLigada.ListaDB;
import punto.Punto;

public class UtileriaMatriz {
	/**
	 * Metodo que nos permite generar una matriz a traves de un punto.
	 * @param punto Punto a convertir a una matriz.
	 * @return Matriz Matriz a retornar.
	 */
	public static Matriz puntoAMatriz(Punto punto){
		Matriz matriz = new Matriz();
		
		ListaDB<Double> fila_1 = new ListaDB<Double>();
		fila_1.add(punto.getX());
		
		ListaDB<Double> fila_2 = new ListaDB<Double>();
		fila_2.add(punto.getY());
		
		matriz.addFila(fila_1);
		matriz.addFila(fila_2);
		
		return matriz;
		
	}
	
	/**
	 * Metodo que nos permite crear un punto a traves de una matriz.
	 * @param matriz Matriz a converitir en punto.
	 * @return Punto Retorna un punto.
	 */
	public static Punto matrizAPunto(Matriz matriz){
		Punto punto = new Punto();
		punto.setX(matriz.getM1().get(0).get(0));
		punto.setY(matriz.getM1().get(1).get(0));
		return punto;
	}
	
	/**
	 * Metodo que nos permite crear una matriz auxiliar que se genera
	 * apartir del numero de columnas de una.
	 * @param m1 Matriz Matriz a utilizar para generar la matriz auxiliar.
	 * @return Matriz Retorna una matriz.
	 */
	public static Matriz crearMatriz(Matriz m1){
		Matriz matriz_aux = new Matriz();
		
		for(int i = 0; i < m1.getMaxCol(); i++){
			matriz_aux.addFila(new ListaDB<Double>());
		}
		
		return matriz_aux;
	}
}
