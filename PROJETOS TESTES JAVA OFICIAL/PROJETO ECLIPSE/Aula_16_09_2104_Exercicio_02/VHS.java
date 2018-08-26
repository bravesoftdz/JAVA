package Aula_16_09_2104_Exercicio_02;

public class VHS extends Midia{
	private String titulo;

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("VHS [titulo=");
		builder.append(titulo);
		builder.append(", getTitulo()=");
		builder.append(getTitulo());
		builder.append("]");
		return builder.toString();
	}
	
	
}
