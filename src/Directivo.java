
public class Directivo extends Empleados {
	private int plus;

	public Directivo() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Directivo(int plus) {
		super();
		this.plus = plus;
	}
  
	public int getPlus() {
		return plus;
	}

	public void setPlus(int plus) {
		this.plus = plus;
	}

	public int calcularnomina() {
		int calculo;
		calculo = salario + plus;
		return calculo;
	}
	
	public String getData() {
		String ret = "";
		ret += super.getData() + " - " + plus + " - " + salarioFinal;
		return ret;
	}
}
