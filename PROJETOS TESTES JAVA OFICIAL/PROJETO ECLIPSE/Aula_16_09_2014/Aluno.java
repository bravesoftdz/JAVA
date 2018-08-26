package Aula_16_09_2014;

//Herança da classe Pessoa
public class Aluno extends Pessoa {
	private int matricula;
	
	public Aluno(){
		//Nesta parte traz os dados da classe Pessoa
		
	}
	
	public void setMatricula(int matricula){
		this.matricula=matricula;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Aluno [matricula=");
		builder.append(matricula);
		builder.append(", toString()=");
		//Comando super sobe um nivel
		//por exemplo neste caso vai para a pessoa
		//E vai mostrar nome e data de nascimento
		builder.append(super.toString());
		builder.append("]");
		return builder.toString();
	}
	
	
}
