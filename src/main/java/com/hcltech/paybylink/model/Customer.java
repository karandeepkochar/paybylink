package com.hcltech.paybylink.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "customer")
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    String customerId;

    String username;

    String password;

    @OneToMany(mappedBy = "customer")
    List<AccountDetails> accounts;

    String customerName;

    String email;

    String phNo;


}
