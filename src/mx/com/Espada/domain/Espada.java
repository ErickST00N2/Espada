package mx.com.Espada.domain;

public class Espada {
	//VARIABLES
	private String color;
	private String tipo;
	private int tamanio;
	private int poder;

	//CONSTRUCTOR
	public Espada() {

	}

	//CONSTRUCTOR CON PARAMETROS
	public Espada(String color, String tipo, int tamanio, int poder) {
		this.color = color;
		this.tipo = tipo;
		this.tamanio = tamanio;
		this.poder = poder;
	}

	//GETTERS Y SETTERS
	public String getColor() {
		return color;

	}

	public void setColor(String color) {
		this.color = color;

	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;

	}

	public int getTamanio() {
		return tamanio;
	}

	public void setTamanio(int tamanio) {
		this.tamanio = tamanio;
	}

	public int getPoder() {
		return poder;
	}

	public void setPoder(int poder) {
		this.poder = poder;
	}

	//toString
	public String toString() {
		return "Espada[ tipo = " + tipo + " color = " + color + " tamanio = " + tamanio
				+ " poder = " + poder + "]\n";
	}
}
