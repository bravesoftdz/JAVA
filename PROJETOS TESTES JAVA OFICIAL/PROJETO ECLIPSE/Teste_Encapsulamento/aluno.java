package Teste_Encapsulamento;

public class aluno extends Pessoa{
	private int matricula;
	private String curso;
	public int getMatricula() {
		return matricula;
	}
	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}
	public String getCurso() {
		return curso;
	}
	public void setCurso(String curso) {
		this.curso = curso;
	}
	
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("aluno [matricula=");
		builder.append(matricula);
		builder.append(", curso=");
		builder.append(curso);
		builder.append(", getMatricula()=");
		builder.append(getMatricula());
		builder.append(", getCurso()=");
		builder.append(getCurso());
		builder.append("]");
		return builder.toString();
	}
	
	

}
