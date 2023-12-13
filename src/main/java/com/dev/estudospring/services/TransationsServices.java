package com.dev.estudospring.services;

import com.dev.estudospring.domain.users.User;
import com.dev.estudospring.dto.TransactionDto;
import com.dev.estudospring.repositories.TransactrionRepository;
import com.dev.estudospring.transacao.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Map;

@Service
public class TransationsServices {
    @Autowired
    private UserServices userServices;
    @Autowired
    private TransactrionRepository repository;
    @Autowired
    private RestTemplate  restTemplate;
    @Autowired
    private NotificationService notificationService;

    public  Transaction createTransactions(TransactionDto trasactionDto) throws Exception {
        User sender  = this.userServices.findUsersById(trasactionDto.senderid());
        User receive = this.userServices.findUsersById(trasactionDto.receiveid());
        userServices.ValidateTransactions(sender,trasactionDto.value());
        boolean  isAuthorized = this.autorizeTranscations(sender,trasactionDto.value());
        if(!isAuthorized){
            throw new Exception("Trasação Não Autorizada");
        }
         Transaction transaction= new Transaction(null,trasactionDto.value(),sender,receive, LocalDateTime.now());
         sender.setBalance(sender.getBalance().subtract(trasactionDto.value()));
         receive.setBalance(receive.getBalance().add(trasactionDto.value()));
         repository.save(transaction);
         userServices.saveUsers(sender);
         userServices.saveUsers(receive);
           this.notificationService.sendNotification(sender,"Transação Realizada com sucesso! ");
           this.notificationService.sendNotification(receive,"Transação Recebida  com sucesso! ");
        return transaction;

    }
    public boolean autorizeTranscations(User sender, BigDecimal value){
         ResponseEntity<Map> authorizeResponse = restTemplate.getForEntity("https://run.mocky.io/v3/8fafdd68-a090-496f-8c9a-3442cf30dae6",Map.class);
        if(authorizeResponse.getStatusCode()== HttpStatus.OK){
            String message=  (String) authorizeResponse.getBody().get("message");
            return "Autorizado".equalsIgnoreCase(message);
        }else return false;
    }
}
