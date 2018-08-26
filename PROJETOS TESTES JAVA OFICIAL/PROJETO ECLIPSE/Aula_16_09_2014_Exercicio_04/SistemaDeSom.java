package Aula_16_09_2014_Exercicio_04;

public class SistemaDeSom extends EquipamentoEletronico {
	private String marca;
	private String modelo;
	private float potencia;

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

	public float getPotencia() {
		return potencia;
	}

	public void setPotencia(float potencia) {
		if (potencia > 0)
			this.potencia = potencia;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("SistemaDeSom [marca=");
		builder.append(marca);
		builder.append(", modelo=");
		builder.append(modelo);
		builder.append(", potencia=");
		builder.append(potencia);
		builder.append(", getMarca()=");
		builder.append(getMarca());
		builder.append(", getModelo()=");
		builder.append(getModelo());
		builder.append(", getPotencia()=");
		builder.append(getPotencia());
		builder.append("]");
		return builder.toString();
	}

}
