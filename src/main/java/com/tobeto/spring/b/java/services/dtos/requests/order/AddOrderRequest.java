package com.tobeto.spring.b.java.services.dtos.requests.order;


import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class AddOrderRequest {

    @NotBlank(message = "tarih boş bırakılamaz!")
    private LocalDate date;

    private LocalDate rentalStartDate;
    private LocalDate rentalEndDate;

}
