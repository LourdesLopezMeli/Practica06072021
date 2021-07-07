package com.example.practicacasa.handlers;

import com.example.practicacasa.dtos.request.AssignmentsDto;
import com.example.practicacasa.dtos.request.StudentRequestDto;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.List;

public class StudentHandler {

    public static BigDecimal getAverage(List<AssignmentsDto> assignmentsDtoList) {
        BigDecimal average = new BigDecimal(0);
        for (AssignmentsDto assingment: assignmentsDtoList) {
            average = average.add(assingment.getScore());
        }

        average = average.divide(new BigDecimal(assignmentsDtoList.size()), 2 , RoundingMode.HALF_UP );

        return average.setScale(2, RoundingMode.HALF_UP);
    }

    public static String getMessage(List<AssignmentsDto> assignmentsDtoList) {
        BigDecimal average = getAverage(assignmentsDtoList);
        String message = "";
        if (average.compareTo(BigDecimal.valueOf(9)) > 0) {
            message = "Felicitaciones, tus datos son los siguientes: ";
        } else {
            message = "Tus datos son los siguientes: ";
        }

        return message;
    }

}
