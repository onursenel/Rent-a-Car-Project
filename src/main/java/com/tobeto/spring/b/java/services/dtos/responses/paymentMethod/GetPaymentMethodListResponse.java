package com.tobeto.spring.b.java.services.dtos.responses.paymentMethod;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GetPaymentMethodListResponse {
    private String type;
    private String creditCardInformation;
    private String moneyType;

}
