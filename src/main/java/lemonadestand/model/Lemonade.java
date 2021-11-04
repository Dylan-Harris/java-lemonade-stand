package lemonadestand.model;

public class Lemonade {

	private double lemonJuice;

	private double water;

	private double sugar;

	private int iceCube;

	private final int CUP = 1;

	private double price;

	public Lemonade(double lemonJuice, double water, double sugar, int iceCube) {
		super();
		this.lemonJuice = lemonJuice;
		this.water = water;
		this.sugar = sugar;
		this.iceCube = iceCube;
		calculatePrice();
	}

	private void calculatePrice() {
		price = (lemonJuice * .3) + (sugar * .15) + (CUP * .50); 
	}

	public double getLemonJuice() {
		return lemonJuice;
	}

	public double getWater() {
		return water;
	}

	public double getSugar() {
		return sugar;
	}

	public int getIceCube() {
		return iceCube;
	}

	public int getCUP() {
		return CUP;
	}

	public double getPrice() {
		return price;
	}

	public static void main(String[] args) {

	}

	@Override
	public String toString() {
		return "Lemonade [lemonJuice=" + lemonJuice + ", water=" + water + ", sugar=" + sugar + ", iceCube=" + iceCube
				+ ", CUP=" + CUP + ", price=" + price + "]";
	}
	

}
