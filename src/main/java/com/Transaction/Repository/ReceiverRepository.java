package com.Transaction.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Transaction.Entity.Receiver;

public interface ReceiverRepository extends JpaRepository<Receiver, Integer> {

	

}
