package com.dev.estudospring.dto;

import java.math.BigDecimal;

public record TrasactionDto(BigDecimal value,long senderid, long receiveid) {
}
