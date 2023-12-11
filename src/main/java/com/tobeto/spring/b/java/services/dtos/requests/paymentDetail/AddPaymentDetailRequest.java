package com.tobeto.spring.b.java.services.dtos.requests.paymentDetail;

import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;


@Data
@AllArgsConstructor
@NoArgsConstructor

public class AddPaymentDetailRequest {
    @NotBlank(message = "işlem tarihi boş olamaz!")
    private LocalDate transactionDate;

}
