package com.dev.estudospring.repositories;

import com.dev.estudospring.transacao.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TransactrionRepository extends JpaRepository<Transaction,Long> {
}
