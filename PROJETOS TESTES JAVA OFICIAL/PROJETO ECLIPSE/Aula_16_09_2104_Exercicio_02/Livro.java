package Aula_16_09_2104_Exercicio_02;

public class Livro extends Item {
	private String autor;

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Livro [autor=");
		builder.append(autor);
		builder.append(", getAutor()=");
		builder.append(getAutor());
		builder.append("]");
		return builder.toString();
	}
	
}
