package matriz;
import javax.print.attribute.standard.MediaSize.ISO;

import listaLigada.ListaDB;


public class Matriz {
	
	ListaDB<ListaDB<Double>> m1 = new ListaDB();
	public Matriz(){
		this.m1 = new ListaDB<>();
	}
	
	public void addFila(ListaDB<Double> fila){
		
		this.m1.add(fila);
		
		
		
	}
	
	public boolean addDato(int col, double dato){
		if( col >= 0 && col < this.getMaxCol()){
			
			if(col == 0){
				this.m1.get(col).add(dato);
				System.out.println("si");
				return true;
			}else{
				if(this.getM1().get(col).size() < this.getMaxFila()){
					this.m1.get(col).add(dato);
					System.out.println("si");
					return true;
				}else{
					System.out.println("no");
					return false;
					
				}
			}
		}else{
			System.out.println("no");
			return false;
		}
	}
	
	public int getMaxFila(){
		return this.getM1().get(0).size();
		
	}
	
	public boolean isValidoAdd(){
		boolean isValido = true;
		
		for(int i = 0; i < this.m1.size(); i++){
			if( this.m1.get(i).size() != this.getMaxFila() ){
				isValido = false;
				
			}
		}
		return isValido;
	}
	
	
	public int getMaxCol(){
		
			return this.getM1().size();
		
	}
	
	public ListaDB<ListaDB<Double>> getM1() {
		return m1;
	}

	public void setM1(ListaDB<ListaDB<Double>> m1) {
		this.m1 = m1;
	}
	
	public String toString(){
		String resultado = "";
		for(int i = 0; i < this.getMaxCol(); i++){
			for(int j = 0; j < this.getMaxFila(); j++){
				resultado += this.getM1().get(i).get(j) + " ";
			}
			resultado += "\n";
		}
		return resultado;
	}
	
	
	
}
