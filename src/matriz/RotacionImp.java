package matriz;

import listaLigada.ListaDB;
import poligono.Poligono;
import punto.Punto;

public class RotacionImp {
	public static Poligono rotacion(Poligono poligono, Double escala){
		Poligono poligono_aux = new Poligono();
		
		Matriz matriz_escala = new Matriz();
		
		ListaDB<Double> fila_1_escala = new ListaDB<Double>();
		fila_1_escala.add(Math.cos(escala));
		fila_1_escala.add(-Math.sin(escala));
		
		
		ListaDB<Double> fila_2_escala = new ListaDB<Double>();
		
		fila_2_escala.add(Math.sin(escala) );
		fila_2_escala.add(Math.cos(escala));
		
		matriz_escala.addFila(fila_1_escala);
		matriz_escala.addFila(fila_2_escala);
		
		
		System.out.println("es" + matriz_escala);
		
		
		for(int i = 0; i < poligono.getPuntos().size(); i++){
			Matriz m1 = MultiplicacionImpl.multiplicacion(matriz_escala, UtileriaMatriz.puntoAMatriz(poligono.getPuntos().get(i)));
			
			Punto punto = UtileriaMatriz.matrizAPunto(m1);
			
			
			poligono_aux.add( UtileriaMatriz.matrizAPunto( MultiplicacionImpl.multiplicacion(matriz_escala, UtileriaMatriz.puntoAMatriz(poligono.getPuntos().get(i))) ) );
		}
		
		return poligono_aux;
		
		
	}
}
