package com.dev.estudodev.repositories;

import com.dev.estudodev.transacao.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TransactrionRepository extends JpaRepository<Transaction,Long> {
}
