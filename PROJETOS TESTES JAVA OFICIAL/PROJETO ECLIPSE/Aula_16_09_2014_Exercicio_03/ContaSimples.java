package Aula_16_09_2014_Exercicio_03;

public class ContaSimples extends Conta{
	private double saldoPoupanca;

	public double getSaldoPoupanca() {
		return saldoPoupanca;
	}

	public void setSaldoPoupanca(double saldoPoupanca) {
		this.saldoPoupanca = saldoPoupanca;
	}

	public boolean depositoPoupanca(double valor){
		if(valor>0){
			this.saldoPoupanca=saldoPoupanca+valor;
			return true;
		}else{
			return false;
		}
	}
	
	public boolean saquePoupanca(double valor){
		if(valor>0){
			this.saldoPoupanca=saldoPoupanca-valor;
			return true;
		}else{
			return false;
		}
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("ContaSimples [saldoPoupanca=");
		builder.append(saldoPoupanca);
		builder.append(", getSaldoPoupanca()=");
		builder.append(getSaldoPoupanca());
		builder.append("]");
		return builder.toString();
	}
	
	

}
