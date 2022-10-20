package entities;

public class Dados {
	private double height;
	private char sex;
	
	public Dados(double height, char sex) {
		this.height = height;
		this.sex = sex;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public char getSex() {
		return sex;
	}

	public void setSex(char sex) {
		this.sex = sex;
	}

	
}
