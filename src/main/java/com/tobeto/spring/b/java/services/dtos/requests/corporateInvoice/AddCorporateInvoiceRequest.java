package com.tobeto.spring.b.java.services.dtos.requests.corporateInvoice;


import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AddCorporateInvoiceRequest {
    @NotBlank(message = "Kurumsal müşteri ismi boş olamaz!!")
    @Size(min = 3,max = 20,message = "kısaltmadan en az 3 harf olacak şekilde girin!")
    private String contactName;

    private String contactAddress;
    private String phoneNumber;
    private String taxNumber;

    @Positive(message = "pozitif değere sahip olmalı!")
    private int amount;
}
