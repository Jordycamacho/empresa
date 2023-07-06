
public class Empleados {
	protected String nombre, DNI;
	protected int salario, salarioFinal;
	
	public Empleados() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Empleados(String nombre, String dNI, int salario) {
		super();
		this.nombre = nombre;
		DNI = dNI;
		this.salario = salario;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDNI() {
		return DNI;
	}
 
	public void setDNI(String dNI) {
		DNI = dNI;
	}
 
	public int getSalario() {
		return salario;
	}

	public void setSalario(int salario) {
		this.salario = salario;
	}

	public int getSalarioFinal() {
		return salarioFinal;
	}

	public void setSalarioFinal(int salarioFinal) {
		this.salarioFinal = salarioFinal;
	}
	
	public String getData() {
		String ret = "";
		ret += nombre + " - " + DNI + " - " + salario;
		return ret;
	}
}
