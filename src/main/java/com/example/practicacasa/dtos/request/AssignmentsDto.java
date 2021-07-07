package com.example.practicacasa.dtos.request;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class AssignmentsDto {

    private String name;
    private BigDecimal score;

}
