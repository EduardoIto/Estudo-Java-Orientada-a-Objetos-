package entities;

public class Media {
	
	private String name;
	private double N1;
	private double N2;
	
	public Media(String name, double N1, double N2) {
		this.name = name;
		this.N1 = N1;
		this.N2 = N2;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getN1() {
		return N1;
	}

	public void setN1(double n1) {
		N1 = n1;
	}

	public double getN2() {
		return N2;
	}

	public void setN2(double n2) {
		N2 = n2;
	}
	
}
