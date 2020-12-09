package sh.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "MenuInventory")
public class Menu {
	@Id
	@Column
	private int id;
	@Column
	private String name;
	@Column
	private String quantity;
	@Column
	private double price;

	public Menu() {
	}

	public Menu(int id, String name, String quantity, double price) {
		this.id = id;
		this.name = name;
		this.quantity = quantity;
		this.price = price;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getQuantity() {
		return quantity;
	}

	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Menu [id=" + id + ", name=" + name + ", quantity=" + quantity + ", price=" + price + "]";
	}

}
