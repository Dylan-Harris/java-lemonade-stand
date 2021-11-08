package lemonadestand;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.InputMismatchException;
import java.util.Scanner;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import lemonadestand.model.Order;

public class ViewOrder {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		while (true) {

			File file = new File("./orders");

			System.out.println("Which order number would you like to view?");

			int orderNumber = 0;
			try {
				orderNumber = scanner.nextInt();
			} catch (InputMismatchException e) {
				System.out.println("Please enter a number");
			}

//			try (FileInputStream fileInputStream = new FileInputStream(file + "/order" + orderNumber + ".txt");
//					ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);) {
//
//				Order order = (Order) objectInputStream.readObject();
//
//				System.out.println(order.getLemonades());
//				System.out.println("Total " + order.getTotal());
//
//			} catch (FileNotFoundException e) {
//				System.out.println("Order number " + orderNumber + " does not exist");
//			} catch (IOException e) {
//				System.out.println("Internal IOException");
//			} catch (ClassNotFoundException e) {
//				System.out.println("Tried to read in an in order that isn't formatted correctly");
//			} catch (ClassCastException e) {
//				System.out.println("The file read does not contain an order");
//			}

			ObjectMapper objectMapper = new ObjectMapper();
			try {
				Order order = objectMapper.readValue(new File(file + "/order" + orderNumber + ".json"), Order.class);
				System.out.println(order.getLemonades());
				System.out.println("Total " + order.getTotal());
			} catch (JsonParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (JsonMappingException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

	}
}
