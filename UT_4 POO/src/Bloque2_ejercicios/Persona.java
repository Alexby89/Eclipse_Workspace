package Bloque2_ejercicios;

public class Persona {

	private String nombre;
	private int edad;
	private String dni;
	private char sexo;
	private int altura;
	private double peso;
	private final char HOMBRE = 'H';

	public Persona() {
		nombre = "";
		edad = 0;
		sexo = HOMBRE;
		altura = 0;
		peso = 0;
	}
	
	public Persona(String nombre, int edad, char sexo) {
		this.nombre = nombre;
		this.edad = edad > 0 ? edad : 0;
		this.sexo = sexo == 'H' || sexo == 'M' ? sexo : HOMBRE;
		this.altura = 0;
		this.peso = 0;
	}
	
	public Persona(String nombre, int edad, char sexo, int altura, double peso) {
		this.nombre = nombre;
		this.edad = edad > 0 ? edad : 0;
		this.sexo = sexo == 'H' || sexo == 'M' ? sexo : HOMBRE;
		this.peso = peso > 0 ? peso : 0;
		this.altura = altura > 0 ? altura : 0;
	}
	
	public void setNombre(String nombre) {
		if(nombre.length() > 0 ) {
			this.nombre = nombre;
		}
	}
	
	public void setEdad(int edad) {
		if(edad > 0 ) {
			this.edad = edad;
		}
	}
	
	public void setSexo(char sexo) {
		if(sexo == 'H' || sexo =='M') {
			this.sexo = sexo;
		}
	}
	
	public void setPeso(double peso) {
		if(peso > 0 ) {
			this.peso = peso;
		}
	}
	
	public void setAltura(int altura) {
		if(altura > 0 ) {
			this.altura = altura;
		}
	}
	
	public String toString() {
		return nombre + "(" + dni + ") Edad: " + edad + ". Sexo: " + (sexo == 'M' ? "Hombre" : "Mujer") + ". Peso: " + peso + "kg. Altura: " + altura + "cm.";
	}
	
	public int calcularIMC(double peso, int altura) {
		double resultado = peso / Math.pow((double)altura/(double)100, 2);
		
		if(resultado < 20) {
			return -1;
		} else if(resultado >= 20 && resultado <= 25) {
			return 0;
		}
		return 1;
	}
	
	public static boolean esMayor(int edad) {
		if(edad <= 18) {
			return false;
		}
		return true;
	}
	
	public void generarDNI() {
		String dni = "";
		for(int i = 0; i <= 8; i++) {
			dni += (int)(Math.random()*10);
		}
		int numero = Integer.parseInt(dni);
		int posicion = numero%23;
		
		char[] letra = {'T','R','W','A','G','M','Y','F','P','D','X','B','N','J','Z','S','Q','V','H','L','C','K','E'};
		
		dni += letra[posicion];
		
		this.dni = dni;
	}
}