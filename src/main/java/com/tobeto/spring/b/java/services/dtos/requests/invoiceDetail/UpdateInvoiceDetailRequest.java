package com.tobeto.spring.b.java.services.dtos.requests.invoiceDetail;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class UpdateInvoiceDetailRequest {
    private String description;
    private String type;
}
