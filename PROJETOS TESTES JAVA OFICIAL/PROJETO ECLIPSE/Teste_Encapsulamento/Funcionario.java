package Teste_Encapsulamento;

public class Funcionario extends Pessoa {
	private double salario;
	private double hora_trabalhada;
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	public double getHora_trabalhada() {
		return hora_trabalhada;
	}
	public void setHora_trabalhada(double hora_trabalhada) {
		this.hora_trabalhada = hora_trabalhada;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Funcionario [salario=");
		builder.append(salario);
		builder.append(", hora_trabalhada=");
		builder.append(hora_trabalhada);
		builder.append(", getSalario()=");
		builder.append(getSalario());
		builder.append(", getHora_trabalhada()=");
		builder.append(getHora_trabalhada());
		builder.append("]");
		return builder.toString();
	}
	
	

}
