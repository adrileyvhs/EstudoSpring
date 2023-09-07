package com.dev.estudospring.domain.users;

import com.dev.estudospring.dto.UserDto;
import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;

@Entity(name = "users")
@Table(name = "tb_users")

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(of = "id")

public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private  String firstname;
    private  String lastname;
    @Column(unique = true)
    private  String  cpf;
    @Column(unique = true)
    private  String  email;
    private  String  password;
    private BigDecimal balance;
    @Enumerated(EnumType.STRING)
    private  UserType userType;

    public  User(UserDto userDto){
        this.firstname = userDto.firstname();
        this.lastname = userDto.lastname();
        this.cpf = userDto.cpf();
        this.email = userDto.email();
        this.password = userDto.password();
        this.balance = userDto.balance();
        this.userType = userDto.userType();
    }



}
