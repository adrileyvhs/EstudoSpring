package com.dev.estudospring.services;

import com.dev.estudospring.domain.users.UserType;
import com.dev.estudospring.domain.users.Users;
import com.dev.estudospring.repositories.UserRepository;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

@Service
public class UserServices {
    @Autowired
    private UserRepository repository;

    public void ValidateTransactions(Users sender, BigDecimal amount) throws Exception {
        if (sender.getUserType() == UserType.MERCHANT) {
            throw new Exception(" USUÁRIO DO TIPO LOJISTA NÃO ESTÁ AUTORIZADO AO REALIZAR ESSE TIPO TRANSAÇÃO !!");
        }
        if (sender.getBalance().compareTo(amount) < 0) {
            throw new Exception(" SALDO INSUFICIENTE !!");
        }
    }

    public Users findUsersById(Long id) throws Exception {
       return this.repository.findUsersById(id).orElseThrow(() -> new Exception("Usuário Não Encontrado!"));
    }
    public void saveUsers(Users users){
        this.repository.save(users);
    }
}
