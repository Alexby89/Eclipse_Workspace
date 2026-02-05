
public class Calculadora {
	private int num1;
	private int num2;
	
	public Calculadora(int a, int b) {
		this.num1 = a;
		this.num2 = b;
	}

	public int suma() {
		return num1 + num2;
	}
	
	public int resta() {
		return num1 - num2;
	}
	
	public int multiplicacion() {
		return num1 * num2;
	}
	
	public int division() {
		return num1 / num2;
	}
}