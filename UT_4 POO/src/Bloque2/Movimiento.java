package Bloque2;

public class Movimiento {
	private String dni;
	private int movimiento;
	private String fechaMovimiento;
	private String horaMovimiento;
	private double importeMovimiento;
	private String conceptoMovimiento;
	
	public Movimiento(String dni, String campos, String fechaMovimiento, String horaMovimiento,
			String campos2, String conceptoMovimiento) {
		super();
		this.dni = dni;
		this.movimiento = campos;
		this.fechaMovimiento = fechaMovimiento;
		this.horaMovimiento = horaMovimiento;
		this.importeMovimiento = campos2;
		this.conceptoMovimiento = conceptoMovimiento;
	}

	public String getDni() {
		return dni;
	}

	public int getMovimiento() {
		return movimiento;
	}

	public String getFechaMovimiento() {
		return fechaMovimiento;
	}

	public String getHoraMovimiento() {
		return horaMovimiento;
	}

	public double getImporteMovimiento() {
		return importeMovimiento;
	}

	public String getConceptoMovimiento() {
		return conceptoMovimiento;
	}	
	
	public String toString() {
		return dni + " (" + movimiento + ", " + fechaMovimiento + ", " + horaMovimiento + ", " + importeMovimiento + ", " + importeMovimiento + ", " + conceptoMovimiento + ")";
	}
}
