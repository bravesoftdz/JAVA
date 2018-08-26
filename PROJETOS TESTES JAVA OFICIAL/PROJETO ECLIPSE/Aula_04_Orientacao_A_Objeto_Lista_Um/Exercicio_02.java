package Aula_04_Orientacao_A_Objeto_Lista_Um;

public class Exercicio_02 {
	private int n1;
	private int n2;

	// Métodos Get e Set
	public void setN1(int n1) {
		this.n1 = n1;
	}

	public void setN2(int n2) {
		this.n2 = n2;
	}

	public int getN1() {
		if (n1 > n2) {
			System.out.println("Numero será invertido!");
			int aux;
			aux = n1;
			n1 = n2;
			n2 = aux;
		}
		return n1;
	}

	public int getN2() {

		return n2;
	}

}
