package Aula_16_09_2014;

public class Executa_Pagamento {

	public static void main(String[] args) {
		Pagamento pagamento = new Pagamento();
		pagamento.setHt(220);
		pagamento.setVh(10);
		System.out.println("Horas Trabalhadas: "+
		pagamento.getHt()+
				" com valor de :"+pagamento.getVh());

	}

}
