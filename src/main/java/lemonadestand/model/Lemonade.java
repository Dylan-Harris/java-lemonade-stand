package lemonadestand.model;

import java.util.Objects;

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
	public int hashCode() {
		return Objects.hash(CUP, iceCube, lemonJuice, price, sugar, water);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Lemonade other = (Lemonade) obj;
		return CUP == other.CUP && iceCube == other.iceCube
				&& Double.doubleToLongBits(lemonJuice) == Double.doubleToLongBits(other.lemonJuice)
				&& Double.doubleToLongBits(price) == Double.doubleToLongBits(other.price)
				&& Double.doubleToLongBits(sugar) == Double.doubleToLongBits(other.sugar)
				&& Double.doubleToLongBits(water) == Double.doubleToLongBits(other.water);
	}

	@Override
	public String toString() {
		return "Lemonade {lemonJuice=" + lemonJuice + ", water=" + water + ", sugar=" + sugar + ", iceCube=" + iceCube
				+ ", CUP=" + CUP + ", price=" + price + "}";
	}
	

}
