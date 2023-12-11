package com.tobeto.spring.b.java.services.dtos.requests.brand;


import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.Length;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AddBrandRequest {

    @NotBlank(message = "marka adı boş olamaz!")//requestteki name alanı boş olamaz
    //@Length(min=3,max=20)//min 3 max 20 karakter alır
    @Size(min=3,max=20,message = "marka adı 3 harf ile 20 harf aralığında olmalı!")
    private String name;

    private int modelYear;

    private String productionPlace;

    private String type;

    private String color;

}
