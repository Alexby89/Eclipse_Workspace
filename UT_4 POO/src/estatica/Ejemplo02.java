package estatica;
import java.util.Scanner;

public class Ejemplo02 {
	public static Scanner teclado = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Precio de una tarjeta grafica: ");
		double precioGrafica = Double.parseDouble(teclado.nextLine().trim());
		
		System.out.print("Precio de 1kg de harina: ");
		double precioHarina = Double.parseDouble(teclado.nextLine().trim());
		
		double ivaGrafica = utilidades.calcularIva(precioGrafica);
		System.out.println("Iva de la grafica: " + ivaGrafica);
		
		double ivaHarina = utilidades.calcularIvaReducido(precioHarina);
		System.out.println("Iva de Harina: " + ivaHarina);
		
		utilidades util = new utilidades();
		
		double precioSinIvaGrafica = util.calcularPrecioSinIva(precioGrafica);
		System.out.println("Precio sin IVA de la grafica: " + precioSinIvaGrafica);
		
		double precioSinIvaHarina = util.calcularPrecioSinIva(precioHarina);
		System.out.println("Precio sin IVA de la harina: " + precioSinIvaHarina);
		
	}
}