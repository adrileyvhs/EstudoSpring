package com.dev.estudospring.transacao;

import com.dev.estudospring.domain.users.Users;
import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(of = "id")

@Entity(name = "transactions")
@Table(name = "transations")
public class Transaction {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private BigDecimal amount;
    @ManyToOne
    @JoinColumn(name = "sender_id")
    private Users sender;
    @ManyToOne
    @JoinColumn(name = "receiver_id")
    private Users receiver;
    private LocalDateTime timestamp;


}
