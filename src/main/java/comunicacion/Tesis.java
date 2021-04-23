package comunicacion;

import java.util.ArrayList;

public class Tesis extends Escrito{
	private String idea;
	private String[] argumentos;
    private String conclusion;
    private String referencias;
    private String interpretacion;
    
    public Tesis(String origen, String titulo, String autor, int paginas, String idea,String [] argumentos,String conclusion,String referencias,String interpretacion) {
    	super(origen,titulo,autor,paginas);
    	this.idea=idea;
    	this.argumentos=argumentos;
    	this.conclusion=conclusion;
    	this.referencias=referencias;
    	this.interpretacion=interpretacion;
    }
    public int palabrasTotales(int x) {}
    
	public String interpretacion() {}
	
	public String toString() {}

	public String getIdea() {
		return idea;
	}

	public void setIdea(String idea) {
		this.idea = idea;
	}

	public ArrayList<String> getArgumentos() {
		return argumentos;
	}

	public void setArgumentos(ArrayList<String> argumentos) {
		this.argumentos = argumentos;
	}

	public String getConclusion() {
		return conclusion;
	}

	public void setConclusion(String conclusion) {
		this.conclusion = conclusion;
	}

	public String getReferencias() {
		return referencias;
	}

	public void setReferencias(String referencias) {
		this.referencias = referencias;
	}

	public String getInterpretacion() {
		return interpretacion;
	}

	public void setInterpretacion(String interpretacion) {
		this.interpretacion = interpretacion;
	} 
	
}
