package com.Transaction.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="sender")
public class Sender {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	
	private int id;
	private String name;
	private int sendAmt;
	private int totalAmt;
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
	public int getSendAmt() {
		return sendAmt;
	}
	public void setSendAmt(int sendAmt) {
		this.sendAmt = sendAmt;
	}
	public int getTotalAmt() {
		return totalAmt;
	}
	public void setTotalAmt(int totalAmt) {
		this.totalAmt = totalAmt;
	}
}
