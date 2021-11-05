package lemonadestand;

import lemonadestand.model.Customer;
import lemonadestand.model.Lemonade;
import lemonadestand.model.Order;

public class Application {
	
	public static void main(String[] args) {
		
		Customer customer1 = new Customer("Will", "(999)-999-9999");
		Customer customer2 = new Customer("Frank", "(901)-999-9999");
		
		Order order1 = new Order(customer1);
		Order order2 = new Order(customer2);
		
		order1.addLemonade(new Lemonade(1, .5, 1, 5));
		order1.addLemonade(new Lemonade(1, .5, 1, 5));
		order1.addLemonade(new Lemonade(1, .5, 1, 5));
		order1.addLemonade(new Lemonade(1, .5, 1, 5));
		
//		for (Lemonade l : order1.getLemonades()) {
////			System.out.println(l.getPrice());
//		}
//		System.out.println(order1.getCustomer().getName());
//		System.out.println(order1.getTotal());
		
		order2.addLemonade(new Lemonade(2, 2.5, 1, 5));
		order2.addLemonade(new Lemonade(1, .5, 1, 5));
		order2.addLemonade(new Lemonade(3, .5, 1, 5));
		order2.addLemonade(new Lemonade(1, 1.5, 1.75, 5));
		
//		for (Lemonade l : order2.getLemonades()) {
////			System.out.println(l.getPrice());
//		}
//		System.out.println(order2.getCustomer().getName());
//		System.out.println(order2.getTotal());
		
		Box<Order> b1 = new Box<Order>(order1);
		Box<Customer> b2 = new Box<Customer>(customer1);
		
		b1.setObj(order2);
		b2.setObj(customer2);
		
		
		//Downcasting to an Order type
		b1.getObj().addLemonade(new Lemonade(2, 1.5, 1.75, 5));
		
		System.out.println(b1.getObj());
		System.out.println(b2.getObj());
		
		b2.printValue(customer2, order1);
		Box<Integer> b3 = new Box<Integer>(1);
	}

}
