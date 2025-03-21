package com.example.STREAM;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;

//Given a list of transactions (with `id`, `amount`, and `type`), calculate the total amount for each transaction type.
public class Transactions {
	private int id;
	private double amount;
	private String type;

	public Transactions(int id, double amount, String type) {
		super();
		this.id = id;
		this.amount = amount;
		this.type = type;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "Transactions [id=" + id + ", amount=" + amount + ", type=" + type + "]";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Transactions> txn = Arrays.asList(new Transactions(1, 100, "Food"),
				new Transactions(2, 200, "Entertainment"), new Transactions(3, 50, "Food"),
				new Transactions(4, 300, "Bills"), new Transactions(5, 150, "Entertainment"));
		
		  Map<String, Double> totalByType =	txn.stream().collect(Collectors.groupingBy(
				Transactions::getType,
				Collectors.summingDouble(Transactions::getAmount)
				));
		totalByType.forEach((type, total) -> 
        System.out.println("Total amount for " + type + ": " + total));
		
		
		
		
	}

}
