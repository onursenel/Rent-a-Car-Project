package com.tobeto.spring.b.java.services.dtos.requests.car;


import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AddCarRequest {
    @NotBlank(message = "Plaka boş bırakılamaz!!")
    @Size(min=6,max=12,message = "Plaka bilgisi 6-12 aralığında olmalıdır!!")
    private String plate;

    @Min(value = 1000 ,message = "aracın kiralama fiyatı en az 1000 tl dir!")
    private int rentalFee;
}
