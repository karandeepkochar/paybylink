package com.hcltech.paybylink.controller;

import com.hcltech.paybylink.dto.FundTransferRequestDTO;
import com.hcltech.paybylink.dto.FundTransferResponseDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/transfer")
public class FundTransferController {

    @PostMapping("/internal")
    public static ResponseEntity<FundTransferResponseDTO> transferFunds
            (@RequestBody FundTransferRequestDTO fundTransferDTO) {

        return null;
    }

}
