package com.dev.estudodev.dto;

import java.math.BigDecimal;

public record TransactionDto(BigDecimal value, long senderid, long receiveid) {
}
