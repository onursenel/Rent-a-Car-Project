package com.tobeto.spring.b.java.services.dtos.requests.individualInvoice;


import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AddIndividualInvoiceRequest {
    @NotBlank(message = "Bireysel Fatura ismi boş olamaz!")
    @Size(min = 3,max = 20,message = "girilen isim en az 3 harfli olmalı!")
    private String name;
    @NotBlank(message = "Bireysel Fatura soyismi boş olamaz!")
    @Size(min =3,max =20,message = "girilen soyisim en az 3 harfli olmalı!!")
    private String surname;

    @Positive(message = "Fatura tutarı negatif olamaz!")
    private int amount;
    private String address;
}
