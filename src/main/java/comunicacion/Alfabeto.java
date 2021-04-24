package comunicacion;

import java.util.ArrayList;

public class Alfabeto extends Pictograma {
	private static String [] letras;
	private String interpretacion;
	
	public Alfabeto(String origen,String [] letras, String interpretacion ) {
		super(origen);
		Alfabeto.letras=letras;
		this.interpretacion=interpretacion;
	}
	
	public int cantidadLetras() {
		return letras.length;
	}
	
	public String interpretacion() {
		return  interpretacion ;
	}
	//probar
	public String toString() {
		String l = "";
		for(int i=0; i<letras.length;i++){
			
			if (i==letras.length-1) {
				l += letras[i]; 
				break;
			}
			l += letras[i]+ ", " ;	
		}
		return l;
	}

	public static String[] getLetras() {
		return letras;
	}

	public static void setLetras(String[] letras) {
		Alfabeto.letras = letras;
	}

	public String getInterpretacion() {
		return interpretacion;
	}

	public void setInterpretacion(String interpretacion) {
		this.interpretacion = interpretacion;
	}

	
	
}
