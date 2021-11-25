package com.qa.project.main.model;

import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Table(name= "Ticket")
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Ticket {
	
	@Id
	@GeneratedValue
	private int id;
	private double amount;
	private String category;
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	@Override
	public String toString() {
		return "Ticket [id=" + id + ", amount=" + amount + ", category=" + category + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(amount, category, id);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Ticket other = (Ticket) obj;
		return Double.doubleToLongBits(amount) == Double.doubleToLongBits(other.amount)
				&& Objects.equals(category, other.category) && id == other.id;
	}
	public Ticket(int id, double amount, String category) {
		super();
		this.id = id;
		this.amount = amount;
		this.category = category;
	}
	

}
