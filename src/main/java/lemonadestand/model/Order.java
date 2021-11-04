package lemonadestand.model;

import java.util.Arrays;

public class Order {

	private Customer customer;

	private Lemonade[] lemonades;

	private double total;

	public Order(Customer customer) {
		super();
		this.customer = customer;
		lemonades = new Lemonade[0];
		total = 0.0;
	}

//	private void updateTotal() {
//		for (Lemonade l : lemonades) {
//			total += l.getPrice();
//		}
//	}

	public void addLemonade(Lemonade lemonade) {
		Lemonade[] temp = Arrays.copyOf(lemonades, lemonades.length + 1);
//		Lemonade[] temp = new Lemonade[lemonades.length + 1];
//		for (int i = 0; i < lemonades.length; i++) {
//			// populate temp array with old values
//			temp[i] = lemonades[i];
//		}

		temp[temp.length - 1] = lemonade;
		lemonades = temp;
		total += lemonade.getPrice();
	}

	public Customer getCustomer() {
		return customer;
	}

	public Lemonade[] getLemonades() {
		return lemonades;
	}

	public double getTotal() {
		return total;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((customer == null) ? 0 : customer.hashCode());
		result = prime * result + Arrays.hashCode(lemonades);
		long temp;
		temp = Double.doubleToLongBits(total);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Order other = (Order) obj;
		if (customer == null) {
			if (other.customer != null)
				return false;
		} else if (!customer.equals(other.customer))
			return false;
		if (!Arrays.equals(lemonades, other.lemonades))
			return false;
		if (Double.doubleToLongBits(total) != Double.doubleToLongBits(other.total))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Order [customer=" + customer + ", lemonades=" + Arrays.toString(lemonades) + ", total=" + total + "]";
	}
	
	

}
