package com.Transaction.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.Transaction.Repository.ReceiverRepository;
import com.Transaction.Repository.SenderRepository;
import com.Transaction.Transaction.Transaction;

import jakarta.transaction.Transactional;

@RestController
public class TransactionController {

	@Autowired
	SenderRepository sr;
	
	@Autowired
	ReceiverRepository rr;
	
	int a = 10;
	int b = 0;
	@Transactional
	@PostMapping(value="/send")
	public String send(@RequestBody Transaction t)  {
		sr.save(t.getSender());
		
		int c = a/b;
		rr.save(t.getReceiver());
		return "Transaction Completed";
	}
}