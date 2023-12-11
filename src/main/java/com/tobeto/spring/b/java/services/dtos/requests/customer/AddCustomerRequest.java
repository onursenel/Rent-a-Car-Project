package com.tobeto.spring.b.java.services.dtos.requests.customer;


import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AddCustomerRequest {

    @NotBlank(message = "Müşteri ismi boş bırakılamaz!")
    @Size(min = 3,max = 20,message = "3 harften az isim girilemez!")
    private String name;

    @NotBlank(message = "Müşteri soyismi boş bırakılamaz!")
    @Size(min = 3,max = 20,message = "3 harften az soyisim girilemez!")
    private String surname;

    private String address;

    @NotBlank(message = "Email boş bırakılamaz!!")
    @Email(message = "Geçersiz bir Email formatı!")
    private String email;
    private String phone;
}
