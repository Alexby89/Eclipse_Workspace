package Metodos;

public class Coches {
	private String marca;
	private String modelo;
	private int año;
	
	public Coches(String marca, String modelo, int año) {
		this.marca = marca;
		this.modelo = modelo;
		this.año = año > 0 ? año : 0;
	}

	public String getMarca() {
		return marca;
	}
	
	public void setMarca(String marca) {
		if(marca.length() > 0) {
			this.marca = marca;
		}
	}
	
	public String getModelo() {
		return modelo;
	}
	
	public void setModelo(String modelo) {
		if(modelo.length() > 0) {
			this.modelo = modelo;
		}
	}
	
	public int getAño() {
		return año;
	}
	
	public void setAño(int año) {
		if(año > 0) {
			this.año = año;
		}
	}
}
