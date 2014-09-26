import javax.swing.JFrame;

import gui.Ventana;
import listaLigada.ListaDB;
import matriz.MultiplicacionImpl;
import matriz.SumaImpl;
import matriz.Matriz;
public class Test {
	public static void main(String[] args){
		f2();
	}
	public static void f2(){
		Ventana ventana = new Ventana();
		ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ventana.setVisible(true);
		ventana.setBounds(100, 20, 640,480);
	}
	
	public static void f3(){
		//SumaImpl suma = new SumaImpl();
		
		Matriz m2 = new Matriz();
		
		Matriz m = new Matriz();
		
		
		ListaDB<Double> f1 = new ListaDB<>();
		f1.add(2.0);
		f1.add(1.0);
		
		
		ListaDB<Double> f2 = new ListaDB<>();
		f2.add(2.0);
		f2.add(2.0);
		
		
		ListaDB<Double> f3 = new ListaDB<>();
		f3.add(4.0);
		
		
		
		ListaDB<Double> f4 = new ListaDB<>();
		f4.add(2.0);
		
		
		
		
		m.addFila(f1);
		m.addFila(f2);
		
		
		
		m2.addFila(f3);
		m2.addFila(f4);
		
		
		
		System.out.println(m);
		System.out.println();
		
		System.out.println(m2);
		//Matriz r =MultiplicacionImpl.multiplicacion(m, m2);
		//System.out.println(r);
	}
	
	public static void f1(){
		/*ListaDB<Double> f1 = new ListaDB<>();
		f1.add(1.0);
		f1.add(2.0);
		f1.add(4.0);
		
		ListaDB<Double> f2 = new ListaDB<>();
		f2.add(4.0);
		f2.add(3.0);
		
		
		ListaDB<Double> f3 = new ListaDB<>();
		f3.add(4.0);
		f3.add(3.0);
		f3.add(12.0);
		
		ListaDB<Double> f4 = new ListaDB<>();
		f3.add(4.0);
		f3.add(3.0);
		f3.add(12.0);
		
		
		m.addFila(f1);
		m.addFila(f2);
		m.addFila(f3);
		
		m2.addFila(f3);
		m2.addFila(f4);
		m2.addFila(f3);
		*/
		
		Matriz m = new Matriz();
		Matriz m2 = new Matriz();
		
		ListaDB<Double> f1 = new ListaDB<>();
		f1.add(2.0);
		f1.add(2.0);
		
		ListaDB<Double> f2 = new ListaDB<>();
		f2.add(1.0);
		f2.add(2.0);
		
		
		ListaDB<Double> f3 = new ListaDB<>();
		f3.add(4.0);
		f3.add(4.4);
		f3.add(4.4);
		
		
		
		
		ListaDB<Double> f4 = new ListaDB<>();
		f4.add(2.0);
		f4.add(3.5);
		f4.add(4.0);
		
		
		
		
		
		m.addFila(f1);
		m.addFila(f2);
		
		
		m2.addFila(f3);
		m2.addFila(f4);
		
		//MultiplicacionImpl ml = new MultiplicacionImpl();
		
		//System.out.println(ml.isValidoMultiplicacion(m, m2));
		
		//Matriz r = ml.multiplicacion(m, m2);
		Matriz r = MultiplicacionImpl.multiplicacion(m, m2);
		//Matriz r = ml.crearMatriz(m, m2);
		//System.out.println(r.getMaxFila());
		//System.out.println(r.getMaxCol() + " " + r.getMaxFila());
		//System.out.println(r.getM1().get(1).get(1));
		System.out.println(r);
		
		//System.out.println(r.getM1().get(1).get(1));
	}
}
