package Aula_16_09_2014_Exercicio_03;

public class ContaEspecial extends Conta {
	
	private int diasSemJuros;
	private double limite;
	public int getDiasSemJuros() {
		return diasSemJuros;
	}
	public void setDiasSemJuros(int diasSemJuros) {
		this.diasSemJuros = diasSemJuros;
	}
	public double getLimite() {
		return limite;
	}
	public void setLimite(double limite) {
		this.limite = limite;
	}
	
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("ContaEspecial [diasSemJuros=");
		builder.append(diasSemJuros);
		builder.append(", limite=");
		builder.append(limite);
		builder.append(", getDiasSemJuros()=");
		builder.append(getDiasSemJuros());
		builder.append(", getLimite()=");
		builder.append(getLimite());
		builder.append("]");
		return builder.toString();
	}

}
