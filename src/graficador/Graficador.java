package graficador;

import matriz.Matriz;

public interface Graficador {
	int teX(Double x);
	int teY(Double y);
	Matriz multiplicar(Matriz m1, Matriz m2);
	Matriz sumar(Matriz m1,Matriz m2);
}
