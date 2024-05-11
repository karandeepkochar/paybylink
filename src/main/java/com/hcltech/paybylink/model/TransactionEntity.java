package com.hcltech.paybylink.model;
import com.hcltech.paybylink.enums.TransactionType;
import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity(name = "transaction_tbl")
public class TransactionEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "transaction_id")
    private String transactionId;

    @ManyToOne
    @JoinColumn(name="beneficiary_id")
    private BeneficiaryEntity beneficiaryId;

    @Column(name="amount")
    private double amount;

    @Column(name="transaction_date")
    private LocalDateTime transactionDate;

    @ManyToOne
    @JoinColumn(name="accountno")
    private AccountDetails accountDetails;

    @Column(name="transaction_type")
    private TransactionType transactionType;

}
