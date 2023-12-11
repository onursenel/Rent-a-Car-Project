package com.tobeto.spring.b.java.services.dtos.requests.paymentMethod;

import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AddPaymentMethodRequest {

    @NotBlank(message = "ödenecek para yöntemi girilmesi zorunludur!")
    private String type;

    private String creditCardInformation;
    private String moneyType;
}
