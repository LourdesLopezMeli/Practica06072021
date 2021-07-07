package com.example.practicacasa.dtos.request;

import lombok.Data;
import org.springframework.validation.annotation.Validated;

import javax.validation.Valid;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import java.util.List;

@Data
@Validated
public class HouseRequestDto {

    @NotBlank(message = "El nombre está vacío")
    private String name;

    @NotBlank(message = "La dirección está vacía")
    private String address;

    @NotEmpty(message = "Las habitaciones están vacías")
    @Valid
    private List<RoomDto> rooms;


}
