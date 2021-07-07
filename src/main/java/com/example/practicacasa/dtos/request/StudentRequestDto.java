package com.example.practicacasa.dtos.request;

import lombok.Data;


import java.util.List;
import java.util.Map;

@Data
public class StudentRequestDto {

    private String name;
    private List<AssignmentsDto> assigments;
}
