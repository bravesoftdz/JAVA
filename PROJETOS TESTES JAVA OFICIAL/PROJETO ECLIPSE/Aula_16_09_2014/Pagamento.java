package Aula_16_09_2014;

public class Pagamento {
	private double ht;
	private double vh;

	public void setHt(double ht) {
		if (ht >= 0)
			this.ht = ht;
	}

	public void setVh(double vh) {
		if (vh >= 0)
			this.vh = vh;
	}

	public double getHt() {
		return ht;
	}
	
	public double getVh(){
		return vh;
	}	

}
