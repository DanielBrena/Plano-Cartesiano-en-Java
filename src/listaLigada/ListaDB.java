package listaLigada;

import listaLigada.Nodo;

public class ListaDB <T> {
	private Nodo<T> inicio;
	
	
	/**
	 * Constructor.
	 */
	public ListaDB(){
		
	}
	
	/**
	 * Sobrecarga del constructor que agrega otro lista.
	 * @param lista Lista.
	 */
	public ListaDB(ListaDB<T> lista){
		this.inicio = lista.getInicio();
	}
	
	/**
	 * Metodo que inserta un dato al principio de la lista.
	 * @param dato Dato a insertar.
	 */
	
	public void insertaInicio(T dato){
		Nodo<T> nodoQ = new Nodo<T>(dato);
		nodoQ.setLiga(this.inicio);
		this.inicio = nodoQ;
		
	}
	
	/**
	 * Metodo que inserta un dato al final de la lista.
	 * @param dato Dato a insertar.
	 */
	public void insertaFinal(T dato){
		Nodo<T> nodoQ = new Nodo<T>(dato);
		if(this.inicio == null){
			this.inicio = nodoQ;
		}else{
			Nodo<T> nodoT = this.inicio;
			while(nodoT.getLiga() != null){
				nodoT = nodoT.getLiga();
			}
			nodoQ.setLiga(null);
			nodoT.setLiga(nodoQ);
		}
		
	}
	
	/**
	 * Metodo que inserta dato antes de un nodo.
	 * @param dato Dato a inserta.
	 * @param x Dato a buscar para insertar antes de el.
	 */
	public void insertaAntesDeX(T dato, T x){
		Nodo<T> nodoQ = this.inicio;
		Nodo<T> nodoT = null;
		boolean bandera = true;
		if(this.inicio == null){
			this.inicio = new Nodo<>(dato);
		}else{
			while(nodoQ.getInfo() != x && bandera){
				if(nodoQ.getLiga() != null){
					nodoT = nodoQ;
					nodoQ = nodoQ.getLiga();
				}else{
					bandera = false;
				}
			}
			
			if(bandera){
				Nodo<T> nodoX = new Nodo<T>(dato);
				if(this.inicio == nodoQ){
					nodoX.setLiga(this.inicio);
					this.inicio = nodoX;
				}else{
					nodoT.setLiga(nodoX);
					nodoX.setLiga(nodoQ);
				}
			}else{
				System.out.println("No se encontro la referencia");
			}
		}
	}
	
	/**
	 * Metodo que inserta un elemento despues de x.
	 * @param dato Dato a insertar.
	 * @param x Dato a buscar para insertar.
	 */
	public void insertarDespuesDeX(T dato, T x){
		Nodo<T> nodoQ = this.inicio;
		Nodo<T> nodoT = null;
		boolean bandera = true;
		if(this.inicio == null){
			this.inicio = new Nodo<T>(dato);
		}else{
			while(nodoQ.getInfo() != x && bandera){
				if(nodoQ.getLiga() != null){
					nodoQ = nodoQ.getLiga();
				}else{
					bandera = false;
				}
			}
			if(bandera){
				nodoT = new Nodo<T>(dato);
				nodoT.setLiga(nodoQ.getLiga());
				nodoQ.setLiga(nodoT);
			}else{
				System.out.println("Nodo de referencia no se ha encontrado");
			}
		}
		
	}
	
	/**
	 * Metodo que elimina el primer elemento de la lista.
	 */
	public void eliminaInicio(){
		if(this.inicio == null){
			System.out.println("La lista esta vacia");
		}else{
			this.inicio = this.inicio.getLiga();
		}
	}
	
	/**
	 * Metodo que eliminar el ultimo elemento.
	 */
	public void eliminaUltimo(){
		if(this.inicio == null){
			System.out.println("La lista esta vacia");
		}else{
			if(this.inicio.getLiga() == null){
				this.inicio = null;
			}else{
				Nodo<T> nodoQ = this.inicio;
				Nodo<T> nodoT = null;
				while(nodoQ.getLiga() != null){
					nodoT = nodoQ;
					nodoQ = nodoQ.getLiga();
				}
				nodoT.setLiga(null);
			}
		}
	}
	
	/**
	 * Metodo que elimina un elemento con informacion x.
	 * @param x Dato a buscar y eliminar.
	 */
	public void eliminaX(T x){
		if(this.inicio == null ){
			System.out.println("Lista vacia");
		}else{
			Nodo<T> nodoQ = this.inicio;
			Nodo<T> nodoT = null;
			boolean bandera = true;
			
			while(nodoQ.getInfo() != x && bandera){
				if(nodoQ.getLiga() != null){
					nodoT = nodoQ;
					nodoQ = nodoQ.getLiga();
				}else{
					bandera = false;
				}
			}
			
			if(bandera){
				if(nodoQ == this.inicio){
					nodoQ = nodoQ.getLiga();
				}else{
					nodoT.setLiga(nodoQ.getLiga());
				}
			}else{
				System.out.println("No se encontro el elemento");
			}
		}
	}
	
	/**
	 * Metodo que elimina un elemento antes de X.
	 * @param x Elemento que buscar para eliminar su antecesor.
	 */
	public void eliminarAntesDeX(T x){
		Nodo<T> nodoQ = null;
		Nodo<T> nodoT = null;
		Nodo<T> nodoR = null;
		boolean bandera = true;
		if(this.inicio == null){
			
		}else{
			if(this.inicio.getInfo() == x){
				System.out.println("No existe elementos antes de X");
			}else{
				nodoQ = this.inicio;
				nodoT = this.inicio;
				while(nodoQ.getInfo() != x && bandera){
					if(nodoQ.getLiga() != null){
						nodoR = nodoT;
						nodoT = nodoQ;
						nodoQ = nodoQ.getLiga();
					}else{
						bandera = false;
					}
				}
				if(bandera){
					if(nodoQ == this.inicio){
						nodoQ = nodoQ.getLiga();
					}else{
						nodoR.setLiga(nodoQ);
					}
				}else{
					System.out.println("No se encontro le elemento en la lista");
				}
			}
		}
		
	}
	
	/**
	 * Metodo que hace una busqueda de un elemento
	 * dentro de la lista.
	 * @param dato Dato a buscar.
	 */
	public void busquedaDesordenada(T dato){
		Nodo<T> nodoQ = this.inicio;
		while(nodoQ != null && nodoQ.getInfo() != dato){
			nodoQ = nodoQ.getLiga();
		}
		if(nodoQ  == null){
			System.out.println("El elmento no se encuentra en la lista");
		}else{
			System.out.println("EL elemento se encuentra en la lista");
		}
	}
	
	/**
	 * Metodo para buscar un dato en una lista ordenada (Ascendente).
	 * @param dato Dato a buscar.
	 */
	public void busquedaOrdenada(T dato){
		if(dato instanceof Integer ){
			
			Nodo<T> nodoQ = this.inicio;
			while(nodoQ != null && (Integer)nodoQ.getInfo() < (Integer) dato){
				nodoQ = nodoQ.getLiga();
			}
			if(nodoQ  == null ||(Integer) nodoQ.getInfo() > (Integer)dato){
				System.out.println("El elemento no se encontro en la lista");
			}else{
				System.out.println("El elemento se encontro en la lista");
			}
		}else{
			System.out.println("No es entero");
		}
		
	}
	
	/**
	 * Meotodo que hace una busqueda recursiva.
	 * @param lista Lista para usar la recursion.
	 * @param x Dato a buscar.
	 */
	public void busquedaRecursiva(Nodo<T> lista, T x){
		if(lista != null){
			if(lista.getInfo() == x){
				System.out.println("El elemento se encuentra en la lista");
			}else{
				this.busquedaRecursiva(lista.getLiga(),x);
			}
		}else{
			System.out.println("EL elemento no se encuentra en la lista");
		}
	}
	
	
	/**
	 * Metodo que recorre toda la lista.
	 * @return String Regresa toda la lista.
	 */
	public String recorreIteractivo(){
		String resultado = "";
		if(this.inicio == null){
			return "Lista vacia";
		}else{
			Nodo<T> nodoQ = this.inicio;
			while(nodoQ != null){
				resultado = resultado + nodoQ.getInfo().toString() + "->";
				nodoQ = nodoQ.getLiga();
			}
		}
		return resultado + "null";
	}
	
	/**
	 * Metodo que recorre la lista recursivamente.
	 * @param nodo Nodo que que se usa para la recursividad.
	 */
	public void recorreRecursivo(Nodo<T> nodo){
		if(nodo != null){
			System.out.print(nodo.getInfo() + "->");
			this.recorreRecursivo(nodo.getLiga());
			
		}else{
			System.out.print("null");
		}
		
		
	}
	
	
	/**
	 * Metodo que regresa el valor dentro de un indice.
	 * @param i Indice a buscar.
	 * @return T Valor del elemento.
	 */
	public T get(int i){
		T dato = null;
		if(i >= 0){
			Integer contador = 0;
			
			Nodo<T> nodoQ = this.inicio;
			while(nodoQ != null){
				if(i == contador){
					dato = nodoQ.getInfo();
					break;
				}else{
					nodoQ = nodoQ.getLiga();
					contador++;
				}
			}
			return dato;
			
		}else{
			return dato;
		}
		
		
	}
	
	/**
	 * Complemento
	 * Metodo que regresa la longitud de la lista.
	 * @return Int Longitud de la lista
	 */
	public int size(){
		int contador = 0;
		Nodo<T> nodoQ = this.inicio;
		while(nodoQ != null){
			contador++;
			nodoQ = nodoQ.getLiga();
		}
		return contador;
		
	}
	
	/**
	 * Metodo que elimina por un indice.
	 * @param index Indice a eliminar.
	 */
	public void remove(int index){
		
		if(this.inicio != null){
			if(index > this.size()-1 || index < 0){
				System.out.println("Fuera del rango");
			}else{
				int contador = 0;
				Nodo<T> nodoQ = this.inicio;
				Nodo<T> nodoT = null;
				
				while(nodoQ != null){
					if(contador == index){
						
						break;
					}else{
						nodoT = nodoQ;
						nodoQ = nodoQ.getLiga();
						contador++;
					}
				}
				if(nodoQ == this.inicio){
					this.eliminaInicio();
				}else{
					nodoT.setLiga(nodoQ.getLiga());
				}	
				
			}
		}else{
			System.out.println("Lista vacia");
		}
	}
	
	/**
	 * Complemento metodo que agrega al ultimo de la lista.
	 * @param dato Dato a agregar.
	 */
	public void add(T dato){
		this.insertaFinal(dato);
	}
	
	/**
	 * Metodo que agrega un elemento apartir de un indice.
	 * @param index Indice a buscar para insertar el nuevo elemento.
	 * @param dato Dato a insetar
	 */
	public void add(int index, T dato){
		if(this.inicio != null){
			if(index > this.size()-1 || index < 0){
				System.out.println("Fuera del rango");
			}else{
				int contador = 0;
				Nodo<T> nodoQ = this.inicio;
				Nodo<T> nodoT = null;
				while(nodoQ != null){
					if(contador  == index){
						break;
					}else{
						nodoT = nodoQ;
						nodoQ = nodoQ.getLiga();
						contador++;
					}
				}
				if(nodoQ == this.inicio){
					this.insertaInicio(dato);
				}else{
					this.insertaAntesDeX(dato,nodoQ.getInfo());
				}
			}
				
			
			
		}else{
			System.out.println("Lista vacia");
		}
	}
	
	/**
	 * Complemento.
	 * Metodo que retorno true is el elemnto se encuentra.
	 * @param dato
	 * @return Retorna verdadero si contiene el elemento.
	 */
	public boolean contains(Object dato){
		boolean esta = false;
		Nodo<T> nodoQ = this.inicio;
		while(nodoQ != null && !nodoQ.getInfo().equals( dato)){
			nodoQ = nodoQ.getLiga();
		}
		if(nodoQ  == null){
			return false;
		}else{
			return true;
		}
	}
	
	/**Complemento
	 * Metodo que limpia la lista.
	 */
	public void clear(){
		this.inicio = null;
	}
	
	/**
	 * Complemento
	 * Metodo que checa si la lista esta vacia.
	 * @return boolean Si esta o no esta.
	 */
	public boolean isEmpty(){
		if(this.inicio == null){
			return true;
		}else{
			return false;
		}
	}
	
	//Get y Set
	public Nodo<T> getInicio() {
		return inicio;
	}

	public void setInicio(Nodo<T> inicio) {
		this.inicio = inicio;
	}
	
	
	
}
