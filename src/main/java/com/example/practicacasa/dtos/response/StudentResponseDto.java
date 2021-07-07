package com.example.practicacasa.dtos.response;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
public class StudentResponseDto {

    private String message;
    private BigDecimal average;
    private String name;

}
