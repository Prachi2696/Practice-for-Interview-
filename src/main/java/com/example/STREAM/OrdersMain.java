package com.example.STREAM;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;

// Given a list of `Orders` (each having a `List<Item>`), flatten the order list to get all distinct items.s

class Item {
    private String name;
    private double price;

    public Item(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Item{name='" + name + "', price=" + price + "}";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Item item = (Item) obj;
        return Objects.equals(name, item.name); // Comparing based on item name
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}

 class Order {
	 private int id;
	    private List<Item> items;

	    public Order(int id, List<Item> items) {
	        this.id = id;
	        this.items = items;
	    }

	    public List<Item> getItems() {
	        return items;
	    }
}
	
 public class OrdersMain{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Item item1 = new Item("Laptop", 1000);
	        Item item2 = new Item("Phone", 500);
	        Item item3 = new Item("Tablet", 300);
	        Item item4 = new Item("Phone", 500); // Duplicate item

	        // Sample orders
	        List<Order> orders = Arrays.asList(
	            new Order(1, Arrays.asList(item1, item2)),
	            new Order(2, Arrays.asList(item3, item2, item4)) // Contains duplicate "Phone"
	        );
	        
	        orders.stream().flatMap(e -> e.getItems().stream()).distinct().forEach(System.out::println);

	}

}
