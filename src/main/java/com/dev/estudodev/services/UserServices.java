package com.dev.estudodev.services;

import com.dev.estudodev.domain.users.UserType;
import com.dev.estudodev.domain.users.User;
import com.dev.estudodev.dto.UserDto;
import com.dev.estudodev.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;

@Service
public class UserServices {
    @Autowired
    private UserRepository repository;

    public void ValidateTransactions(User sender, BigDecimal amount) throws Exception {
        if (sender.getUserType() == UserType.MERCHANT) {
            throw new Exception(" USUÁRIO DO TIPO LOJISTA NÃO ESTÁ AUTORIZADO AO REALIZAR ESSE TIPO TRANSAÇÃO !!");
        }
        if (sender.getBalance().compareTo(amount) < 0) {
            throw new Exception(" SALDO INSUFICIENTE !!");
        }
    }
    public User findUsersById(Long id) throws Exception {
       return this.repository.findUsersById(id).orElseThrow(() -> new Exception("Usuário Não Encontrado!"));
    }
    public void saveUsers(User users){
        this.repository.save(users);
    }
    public User createUser(UserDto userDto) {
         User newUser = new User(userDto);
         this.saveUsers(newUser);
         return  newUser;
    }
    public List<User> getAllUsers() {
       return this.repository.findAll();
    }
}
