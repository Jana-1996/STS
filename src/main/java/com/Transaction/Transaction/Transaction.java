package com.Transaction.Transaction;

import com.Transaction.Entity.Receiver;
import com.Transaction.Entity.Sender;

public class Transaction {
	
	private Sender sender;
	private Receiver receiver;
	public Sender getSender() {
		return sender;
	}
	public void setSender(Sender sender) {
		this.sender = sender;
	}
	public Receiver getReceiver() {
		return receiver;
	}
	public void setReceiver(Receiver receiver) {
		this.receiver = receiver;
	}
}
