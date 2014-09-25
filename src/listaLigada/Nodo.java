package listaLigada;
/*
 * Una tipo generico, es una clase generica o interfaz  que se ha parametrizado 
 * sobre tipos.
 */
public class Nodo <T> {
	
	private T info;
	private Nodo<T> liga;
	
	/**
	 * Metodo constructor que se inicializa con un dato.
	 * @param info Parametro con el que se inicializa el nodo.
	 */
	public Nodo(T info){
		this.info = info;
		this.liga = null;
	}
	
	public Nodo(){
		
	}
	
	//Gettters and Setters
	public T getInfo() {
		return info;
	}

	public void setInfo(T info) {
		this.info = info;
	}

	public Nodo<T> getLiga() {
		return liga;
	}

	public void setLiga(Nodo<T> liga) {
		this.liga = liga;
	}	
	
}
