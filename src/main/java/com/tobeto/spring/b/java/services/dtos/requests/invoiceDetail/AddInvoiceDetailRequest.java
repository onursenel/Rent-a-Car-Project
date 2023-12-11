package com.tobeto.spring.b.java.services.dtos.requests.invoiceDetail;

import jakarta.validation.constraints.Max;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AddInvoiceDetailRequest {

    @Max(value = 100,message = "açıklama çok uzun!!")
    private String description;
    private String type;
}
