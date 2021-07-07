package com.example.practicacasa.dtos.response;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;
import java.util.Map;

@Data
@AllArgsConstructor
public class HouseResponseDto {

    private float totalMetrosCuadrados;
    private float valorCasa;
    private String habitacionGrande;
    private List<Map<String, Object>> habitaciones;


}
