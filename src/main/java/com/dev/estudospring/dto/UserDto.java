package com.dev.estudospring.dto;

import com.dev.estudospring.domain.users.UserType;

import java.math.BigDecimal;

public record UserDto(String firstname, String lastname, String cpf, BigDecimal balance, String email, String password , UserType userType) {
}

