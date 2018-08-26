package Aula_16_09_2014_Exercicio_03;

public class Conta {
	private String banco;
	private int agencia;
	private int numeroconta;
	private double saldo;
	public String getBanco() {
		return banco;
	}
	public void setBanco(String banco) {
		this.banco = banco;
	}
	public int getAgencia() {
		return agencia;
	}
	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}
	public int getNumeroconta() {
		return numeroconta;
	}
	public void setNumeroconta(int numeroconta) {
		if(numeroconta>0){
			this.numeroconta = numeroconta;
		}
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	public boolean deposito(double valor){
		if(valor>0){
			this.saldo=saldo+valor;
			return true;
		}else{
			return false;
		}
	}
	
	public boolean saque(double valor){
		if(valor>0){
			this.saldo=saldo-valor;
			return true;
		}else{
			return false;
		}
	}

	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Conta [banco=");
		builder.append(banco);
		builder.append(", agencia=");
		builder.append(agencia);
		builder.append(", numeroconta=");
		builder.append(numeroconta);
		builder.append(", saldo=");
		builder.append(saldo);
		builder.append(", getBanco()=");
		builder.append(getBanco());
		builder.append(", getAgencia()=");
		builder.append(getAgencia());
		builder.append(", getNumeroconta()=");
		builder.append(getNumeroconta());
		builder.append(", getSaldo()=");
		builder.append(getSaldo());
		builder.append("]");
		return builder.toString();
	}
	
	

}
