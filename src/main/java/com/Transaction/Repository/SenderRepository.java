package com.Transaction.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Transaction.Entity.Sender;

public interface SenderRepository extends JpaRepository<Sender, Integer> {

	

}
