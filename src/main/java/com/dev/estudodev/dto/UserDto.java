package com.dev.estudodev.dto;

import com.dev.estudodev.domain.users.UserType;

import java.math.BigDecimal;

public record UserDto(String firstname, String lastname, String cpf, BigDecimal balance, String email, String password , UserType userType) {
}

