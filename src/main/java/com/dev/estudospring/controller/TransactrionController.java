package com.dev.estudospring.controller;

import com.dev.estudospring.dto.TransactionDto;
import com.dev.estudospring.services.TransationsServices;
import com.dev.estudospring.transacao.Transaction;
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
