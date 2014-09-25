import listaLigada.ListaDB;


public class MultiplicacionImpl {
	
	public static boolean  isValidoMultiplicacion(Matriz m1,Matriz  m2){
		
		if(m1.getMaxFila() == m2.getMaxCol()){
			return true;
		}else{
			return false;
		}
		
	}
	
	public static Matriz multiplicacion(Matriz m1, Matriz m2){

		Matriz matriz_aux = null;
		if( isValidoMultiplicacion(m1, m2)){
			matriz_aux = crearMatriz(m1, m2);
			
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
	
	public static Matriz crearMatriz(Matriz m1, Matriz m2){
		Matriz matriz_aux = new Matriz();
		
		for(int i = 0; i < m1.getMaxCol(); i++){
			matriz_aux.addFila(new ListaDB<Double>());
		}
		
		return matriz_aux;
	}
	
	
}
