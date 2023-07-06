
public class Oficial extends Operario {
	private int sobresueldo;

	public Oficial() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Oficial(int sobresueldo) {
		super();
		this.sobresueldo = sobresueldo;
	}

	public int getSobresueldo() {
		return sobresueldo;
	}

	public void setSobresueldo(int sobresueldo) {
		this.sobresueldo = sobresueldo;
	}

	public int calcularnomina() {
		int resultado = salario + sobresueldo;
		return resultado;
	}

	public String quiensoy() {
		quienSoy = "Oficial";
		return quienSoy;
	}
	 
	public String getData() {
		String ret = "";
		ret += super.getData() + " - " + numobra + " - " + salarioFinal + " - " + quienSoy;
		return ret;
	}
}
