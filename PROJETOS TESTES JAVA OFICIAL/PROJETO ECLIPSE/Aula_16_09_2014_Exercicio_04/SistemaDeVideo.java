package Aula_16_09_2014_Exercicio_04;

public class SistemaDeVideo extends EquipamentoEletronico {
	private String marca;
	private String modelo;
	private String tipo;
	private String resolucao;

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getResolucao() {
		return resolucao;
	}

	public void setResolucao(String resolucao) {
		this.resolucao = resolucao;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("SistemaDeVideo [marca=");
		builder.append(marca);
		builder.append(", modelo=");
		builder.append(modelo);
		builder.append(", tipo=");
		builder.append(tipo);
		builder.append(", resolucao=");
		builder.append(resolucao);
		builder.append(", getMarca()=");
		builder.append(getMarca());
		builder.append(", getModelo()=");
		builder.append(getModelo());
		builder.append(", getTipo()=");
		builder.append(getTipo());
		builder.append(", getResolucao()=");
		builder.append(getResolucao());
		builder.append("]");
		return builder.toString();
	}

}
