package conta_bancaria.model;

public class ContaPoupanca extends Conta {
	
	private int dia_aniversario;

	public ContaPoupanca(int numero, int agencia, int tipo, String titular, float saldo, int dia_aniversario) {
		super(numero, agencia, tipo, titular, saldo);
		this.dia_aniversario = dia_aniversario;
	}

	public int getDia_aniversario() {
		return dia_aniversario;
	}

	public void setDia_aniversario(int dia_aniversario) {
		this.dia_aniversario = dia_aniversario;
	}
	
	@Override
	public void visualizar() {
		super.visualizar();
		System.out.printf("Dia do aniversário: %d%n", this.dia_aniversario);
	}
	
	
		
}
