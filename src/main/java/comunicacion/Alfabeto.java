package comunicacion;

import java.util.ArrayList;

public class Alfabeto extends Pictograma {
	private String [] letras;
	private String interpretacion;
	
	public Alfabeto(String origen,String [] letras, String interpretacion ) {
		super(origen);
		this.letras=letras;
		this.interpretacion=interpretacion;
	}
	
	public int cantidadLetras() {}
	
	public String interpretacion() {}
	
	public String toString() {}

	public String getLetras() {
		return letras;
	}

	public void setLetras(String letras) {
		this.letras = letras;
	}

	public String getInterpretacion() {
		return interpretacion;
	}

	public void setInterpretacion(String interpretacion) {
		this.interpretacion = interpretacion;
	}

	//get y set
	
	
}