package com.dev.estudodev.controller;

import com.dev.estudodev.dto.TransactionDto;
import com.dev.estudodev.services.TransationsServices;
import com.dev.estudodev.transacao.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/transaction")
public class TransactrionController {
    @Autowired
    private TransationsServices transationsServices;
    @PostMapping
    public ResponseEntity<Transaction> createTransaction(@RequestBody TransactionDto transactionDto) throws Exception {
        Transaction newtransaction = this.transationsServices.createTransactions(transactionDto);
        return  new ResponseEntity<>(newtransaction, HttpStatus.OK);
    }
}
