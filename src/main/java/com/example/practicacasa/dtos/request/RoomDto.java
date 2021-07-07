package com.example.practicacasa.dtos.request;

import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Data
public class RoomDto {

    @NotBlank(message = "La habitacion no tiene nombre")
    private String nameRoom;

    @NotNull(message = "Debe tener ancho la habitación")
    private float width;

    @NotNull(message = "Debe tener largo la habitación")
    private float height;

    public float getArea() {
        return this.width*this.height;
    }



}
