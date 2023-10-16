package com.codebased.Lulu_02_week4_Springboot.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="SportsProductShop")

public class SportsProductShop {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	
	int id;
	String Productname;
	String date_of_purchase;
	float cost;
	String delivery_date;
	String feedback;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getProductname() {
		return Productname;
	}
	public void setProductname(String productname) {
		Productname = productname;
	}
	public String getDate_of_purchase() {
		return date_of_purchase;
	}
	public void setDate_of_purchase(String date_of_purchase) {
		this.date_of_purchase = date_of_purchase;
	}
	public float getCost() {
		return cost;
	}
	public void setCost(float cost) {
		this.cost = cost;
	}
	public String getDelivery_date() {
		return delivery_date;
	}
	public void setDelivery_date(String delivery_date) {
		this.delivery_date = delivery_date;
	}
	public String getFeedback() {
		return feedback;
	}
	public void setFeedback(String feedback) {
		this.feedback = feedback;
	}
	public SportsProductShop(int id, String productname, String date_of_purchase, float cost, String delivery_date,
			String feedback) {
		super();
		this.id = id;
		Productname = productname;
		this.date_of_purchase = date_of_purchase;
		this.cost = cost;
		this.delivery_date = delivery_date;
		this.feedback = feedback;
	}
	public SportsProductShop() {
		super();
		// TODO Auto-generated constructor stub
	}
	

}
